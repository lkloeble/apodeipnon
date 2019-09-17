import org.junit.jupiter.api.Test;
import org.orthodoxliturgy.generator.*;
import org.orthodoxliturgy.generator.offices.OfficeBlock;
import org.orthodoxliturgy.generator.offices.Prime;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratorTest {

    private Generator generator;


    @Test
    public void prime_sunday_structure_should_be_adequate() {
        //given
        LiturgicalDay officeDate = new LiturgicalDay(25,8,2019);
        Actors actors = new Actors();
        actors.addActor(ActorType.PRIEST);
        OfficeType officeType = OfficeType.PRIME;
        Omophore omophore = new Omophore().addOmophore("our bishop Somebody");
        LiturgicalContext liturgicalContext = new LiturgicalContext(officeDate,actors,officeType,omophore);
        generator = new Generator(liturgicalContext);

        //when
        OfficeBlock office = generator.buildOffice();

        //then
        assertEquals("INIPRY/PS5/PS89/PS100/GRCARPRIM/APOLITIK/THEOTOK/VERSTSPRIM/TRISAGPRAYER/PRIMKONDAK/PRIMPRAYER/PRIMEPHREMPRAY/PRIMDISMIS", office.getStructure());
        assertEquals("INIPRY/PS5/PS89/PS100/APOLITIK/THEOTOK/VERSTSPRIM/TRISAGPRAYER/PRIMKONDAK/PRIMPRAYER/PRIMDISMIS", office.getLiturgicalStructure());
    }
}
