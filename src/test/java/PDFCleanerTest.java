import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.pdfutils.PDFCleaner;

import java.io.IOException;

public class PDFCleanerTest {

    String FILE = "C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\partition_source_ton1.pdf";

    @Test
    public void test_erase_text() throws IOException {
        PDFCleaner.cleanPartition(FILE);
    }

}
