import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.Lines;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinesTest {

    private Lines lines = new Lines();

    @Test
    public void next_indice_should_return_correct_value() {
        assertEquals(1,lines.getNextIndice());
        List<List<String>> content = new ArrayList<>();
        content.add(Arrays.asList(new String[]{"foobar"}));
        lines.addLineContentFromFile(content);
        assertEquals(2,lines.getNextIndice());
        content.add(Arrays.asList(new String[]{"foobar"}));
        lines.addLineContentFromFile(content);
        assertEquals(4,lines.getNextIndice());
    }
}
