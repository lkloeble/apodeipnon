package org.orthodoxmusic.apodeipnon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class GrammarFileReader {

    DirectoryHolder directoryHolder = new DirectoryHolder();
    Lines partitionLines = new Lines();

    public Partition process(String file) {
        List<String> allLines = readLines(file);
        if (documentIsEmpty(allLines)) return new NullPartition(new NullLines(),file);
        partitionLines = splitAllFileLinesInPartitionLines(allLines);
        return new Partition(partitionLines,file);
    }

    public Lines splitAllFileLinesInPartitionLines(List<String> allLines) {
        List<List<String>> delimitedLists = new ArrayList<>();
        List<String> newLineContent = new ArrayList<>();
        for (String line : allLines) {
            if (weFindLineSeparator(line)) {
                delimitedLists.add(newLineContent);
                newLineContent = new ArrayList<>();
                continue;
            }
            newLineContent.add(line);
        }
        partitionLines.addLineContentFromFile(delimitedLists);
        return partitionLines;
    }

    private boolean weFindLineSeparator(String line) {
        return line != null && line.toLowerCase().startsWith("ligne");
    }

    private boolean documentIsEmpty(List<String> allLines) {
        return allLines == null || allLines.isEmpty();
    }

    public List<String> readLines(String file) {
        List<String> lines = new ArrayList<>();
        Path fullLocalPath = directoryHolder.createFullLocalPath(file);
        try (Stream<String> stream = Files.lines(fullLocalPath)) {
            stream.forEach(lines::add);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
