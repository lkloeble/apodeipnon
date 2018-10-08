package org.orthodoxmusic.apodeipnon;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryHolder {

    public boolean exist(String possiblePath) {
        return Files.exists(createFullLocalPath(possiblePath));
    }

    public boolean isDirectory(String possibleDirectory) {
        return Files.isDirectory(createFullLocalPath(possibleDirectory));
    }

    public boolean existsAndIsDirectory(String possibleDirectory) {
        return exist(possibleDirectory) && isDirectory(possibleDirectory);
    }

    public boolean exist(File file) {
        return file != null && exist(file.getPath());
    }

    public Path createFullLocalPath(String file) {
        Path path = Paths.get(file);
        Path currentDir = Paths.get(".").toAbsolutePath();
        Path fullPath = Paths.get(currentDir.toString() + path.toString());
        return fullPath;
    }
}
