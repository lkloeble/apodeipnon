import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.DirectoryHolder;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirectoryHolderTest {

    DirectoryHolder directoryHolder = new DirectoryHolder();

    private static final String EXISTING_FILE = "/src/test/resources/dummy.txt";
    private static final String UNEXISTING_FILE = "/src/test/resources/foobar.txt";
    private static final String EXISTING_DIRECTORY = "/src/test/resources";
    private static final String UNEXISTING_DIRECTORY = "/src/test/resources2";


    @Test
    public void exist_method_should_return_appropriate_result() {
        assertTrue(directoryHolder.exist(EXISTING_FILE));
        assertFalse(directoryHolder.exist(UNEXISTING_FILE));
    }

    @Test
    public void is_directory_method_should_return_appropriate_result() {
        assertFalse(directoryHolder.isDirectory(EXISTING_FILE));
        assertTrue(directoryHolder.exist(EXISTING_DIRECTORY));
        assertFalse(directoryHolder.exist(UNEXISTING_DIRECTORY));
    }

    @Test
    public void check_exists_and_is_directory() {
        assertFalse(directoryHolder.existsAndIsDirectory(EXISTING_FILE));
        assertTrue(directoryHolder.existsAndIsDirectory(EXISTING_DIRECTORY));
        assertFalse(directoryHolder.existsAndIsDirectory(UNEXISTING_DIRECTORY));
    }
}
