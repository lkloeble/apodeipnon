import org.junit.jupiter.api.Test;
import org.orthodoxliturgy.generator.LiturgicalDay;

import static org.junit.jupiter.api.Assertions.*;

public class LiturgicalDayTest {

    @Test
    public void can_check_if_is_sunday() {
        LiturgicalDay monday = new LiturgicalDay(19,8,2019);
        assertFalse(monday.isSunday());
        LiturgicalDay sunday = new LiturgicalDay(25,8,2019);
        assertTrue(sunday.isSunday());
    }

    @Test
    public void can_check_if_its_easter_sunday() {
        LiturgicalDay notEaster1 = new LiturgicalDay(19,8,2019);
        assertFalse(notEaster1.isEasterSunday());
        LiturgicalDay notEaster2 = new LiturgicalDay(25,8,2019);
        assertFalse(notEaster2.isEasterSunday());
        LiturgicalDay easter2015 = new LiturgicalDay(12,4,2015);
        assertTrue(easter2015.isEasterSunday());
        LiturgicalDay easter2016 = new LiturgicalDay(1,5,2016);
        assertTrue(easter2016.isEasterSunday());
        LiturgicalDay easter2017 = new LiturgicalDay(16,4,2017);
        assertTrue(easter2017.isEasterSunday());
        LiturgicalDay easter2018 = new LiturgicalDay(8,4,2018);
        assertTrue(easter2018.isEasterSunday());
        LiturgicalDay easter2019 = new LiturgicalDay(28,4,2019);
        assertTrue(easter2019.isEasterSunday());
        LiturgicalDay easter2020 = new LiturgicalDay(19,4,2020);
        assertTrue(easter2020.isEasterSunday());
    }

    @Test
    public void check_dates_related_to_big_feast() {
        LiturgicalDay beforeBigFeast = new LiturgicalDay(2,2,2019);
        assertFalse(beforeBigFeast.isInBigFeast());
        LiturgicalDay afterBigFeast = new LiturgicalDay(10,9,2019);
        assertFalse(afterBigFeast.isInBigFeast());
        LiturgicalDay firstDayOfBigFeast = new LiturgicalDay(17,3,2019);
        assertTrue(firstDayOfBigFeast.isInBigFeast());
        LiturgicalDay inBigFeast = new LiturgicalDay(17,3,2019);
        assertTrue(inBigFeast.isInBigFeast());
        LiturgicalDay inHolyWeek = new LiturgicalDay(24,4,2019);
        assertFalse(inHolyWeek.isInBigFeast());

    }
}
