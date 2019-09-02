import org.junit.jupiter.api.Test;
import org.orthodoxliturgy.generator.LiturgicalDay;

import static org.junit.jupiter.api.Assertions.*;

public class LiturgycalDayTest {

    @Test
    public void can_check_if_is_sunday() {
        LiturgicalDay monday = new LiturgicalDay(19,8,2019);
        assertFalse(monday.isSunday());
        LiturgicalDay sunday = new LiturgicalDay(25,8,2019);
        assertTrue(sunday.isSunday());
    }
}
