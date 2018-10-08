import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.NeumesLinePositions;
import org.orthodoxmusic.apodeipnon.TextualSymbols;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextualSymbolsTest {

    private TextualSymbols textualSymbols = new TextualSymbols();

    @Test
    public void test_ison_and_one_syllab_text_positionning() {
        textualSymbols.addText("Al");
        NeumesLinePositions positionForOneSingleIson = new NeumesLinePositions(0.03d);
        positionForOneSingleIson.setWidthForOrder(0,71,2000);
        String svgData = textualSymbols.getData(positionForOneSingleIson);
        assertEquals("<text x=\"21\" y=\"15\" fill=\"black\">Al</text>\n", svgData);
    }

    @Test
    public void test_alleluia_full_formula() {
        textualSymbols.addText("Al le");
        NeumesLinePositions positionForOneSingleIson = new NeumesLinePositions(0.03d);
        positionForOneSingleIson.setWidthForOrder(0,71,1800);
        positionForOneSingleIson.setWidthForOrder(1,2200,3800);
        String svgData = textualSymbols.getData(positionForOneSingleIson);
        assertEquals("<text x=\"18\" y=\"15\" fill=\"black\">Al</text>\n<text x=\"81\" y=\"15\" fill=\"black\">le</text>\n", svgData);
    }

}
