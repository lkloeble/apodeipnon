import org.junit.jupiter.api.Test;
import org.orthodoxliturgy.generator.*;
import org.orthodoxliturgy.generator.offices.InitialPrayers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialPrayersTest {

    private InitialPrayers initialPrayers;

    @Test
    public void content_without_priest_should_start_as_expected() {
        LiturgicalDay liturgicalDay = new LiturgicalDay(31,8,2019);
        Actors actors = new Actors();
        actors.addActor(ActorType.READER);
        OfficeType officeType = OfficeType.PRIME;
        LiturgicalContext liturgicalContext = new LiturgicalContext(liturgicalDay, actors, officeType);
        initialPrayers =new InitialPrayers(liturgicalContext);

        assertEquals("INPRPEOBLE/CHAM/SUPDOX/SUPHEAKIN/READTRIS/READDOX/READHOLY/READDOX/READOURFAT/READKYR12/READDOX/READCOME",initialPrayers.getInnerLiturgicalStructure());
    }

    @Test
    public void content_with_priest_should_start_as_expected() {
        LiturgicalDay liturgicalDay = new LiturgicalDay(31,8,2019);
        Actors actors = new Actors();
        actors.addActor(ActorType.PRIEST);
        OfficeType officeType = OfficeType.PRIME;
        LiturgicalContext liturgicalContext = new LiturgicalContext(liturgicalDay, actors, officeType);
        initialPrayers =new InitialPrayers(liturgicalContext);

        assertEquals("INPRPRIEBLES/CHAM/SUPDOX/SUPHEAKIN/READTRIS/READDOX/READHOLY/READDOX/READOURFAT/READKYR12/READDOX/READCOME",initialPrayers.getInnerLiturgicalStructure());
    }
}
