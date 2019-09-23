import org.junit.jupiter.api.Test;
import org.orthodoxliturgy.generator.*;
import org.orthodoxliturgy.generator.offices.InitialPrayers;
import org.orthodoxliturgy.generator.partitionprinter.HTMLHighLevelContainer;
import org.orthodoxliturgy.generator.partitionprinter.OfficePdfMerger;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InitialPrayersTest {

    private InitialPrayers initialPrayers;

    @Test
    public void content_without_priest_should_start_as_expected() {
        LiturgicalDay liturgicalDay = new LiturgicalDay(31,8,2019);
        Actors actors = new Actors().addActor(ActorType.READER);
        OfficeType officeType = OfficeType.PRIME;
        Omophore omophore = new Omophore().addOmophore("our bishop Somebody");
        List<String> protectors = Arrays.asList(new String[]{});
        List<String> countrySaints = Arrays.asList(new String[]{});
        LiturgicalContext liturgicalContext = new LiturgicalContext(liturgicalDay, actors, officeType, omophore,protectors,countrySaints);
        initialPrayers =new InitialPrayers(liturgicalContext);

        assertEquals("INPRPEOBLE/CHAM/SUPDOX/SUPHEAKIN/READTRIS/READDOX/READHOLY/READDOX/READOURFAT/READKYR12/READDOX/READCOME",initialPrayers.getInnerLiturgicalStructure());
    }

    @Test
    public void content_with_priest_should_start_as_expected() {
        LiturgicalDay liturgicalDay = new LiturgicalDay(31,8,2019);
        Actors actors = new Actors().addActor(ActorType.PRIEST);
        OfficeType officeType = OfficeType.PRIME;
        Omophore omophore = new Omophore().addOmophore("our bishop Somebody");
        List<String> protectors = Arrays.asList(new String[]{});
        List<String> countrySaints = Arrays.asList(new String[]{});
        LiturgicalContext liturgicalContext = new LiturgicalContext(liturgicalDay, actors, officeType,omophore,protectors,countrySaints);
        initialPrayers =new InitialPrayers(liturgicalContext);

        assertEquals("INPRPRIEBLES/CHAM/SUPDOX/SUPHEAKIN/READTRIS/READDOX/READHOLY/READDOX/READOURFAT/READKYR12/READDOX/READCOME",initialPrayers.getInnerLiturgicalStructure());
    }

    @Test
    public void initial_prayers_should_print_correctly_with_correct_bishop() {
        LiturgicalDay liturgicalDay = new LiturgicalDay(31,8,2019);
        Actors actors = new Actors().addActor(ActorType.PRIEST);
        OfficeType officeType = OfficeType.PRIME;
        Omophore omophore = new Omophore().addOmophore("notre évêque le Métropolite Jean");
        List<String> protectors = Arrays.asList(new String[]{});
        List<String> countrySaints = Arrays.asList(new String[]{});
        LiturgicalContext liturgicalContext = new LiturgicalContext(liturgicalDay, actors, officeType,omophore,protectors,countrySaints);
        initialPrayers =new InitialPrayers(liturgicalContext);
        HTMLHighLevelContainer container = new HTMLHighLevelContainer(liturgicalContext, initialPrayers);

        OfficePdfMerger merger = new OfficePdfMerger(container);

        merger.buildFinalScore();
    }
}
