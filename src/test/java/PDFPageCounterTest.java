import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.pdfutils.PDFPageCounter;

import java.io.IOException;

public class PDFPageCounterTest {

    private String FILE = "C:\\Users\\kloeblel\\IdeaProjects\\apodeipnon\\liturgie_complete_ton1.pdf";
    private PDFPageCounter counter = new PDFPageCounter();

    @Test
    public void test_show_page_number() throws IOException {
        counter.dostuff(FILE);
    }
}
