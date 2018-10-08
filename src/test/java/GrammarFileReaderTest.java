import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.GrammarFileReader;
import org.orthodoxmusic.apodeipnon.Lines;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GrammarFileReaderTest {

    private GrammarFileReader grammarFileReader = new GrammarFileReader();

    @Test
    public void test_readlines_should_present_expected_content() {
        List<String> linesInFile = grammarFileReader.readLines("/src/test/resources/grammar1.txt");
        assertTrue(!linesInFile.isEmpty());
        assertEquals(3,linesInFile.size());
        assertEquals("line1",linesInFile.get(0));
    }

    @Test
    public void test_split_lines_should_split_correctly() {
        List<String> linesInFile = grammarFileReader.readLines("/src/test/resources/grammar2.txt");
        Lines linesInPartition = grammarFileReader.splitAllFileLinesInPartitionLines(linesInFile);
        assertTrue(linesInPartition.hasLines());
        assertEquals(6,linesInPartition.getLine(1).getWords().size());

    }
}
