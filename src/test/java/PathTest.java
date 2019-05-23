import org.junit.jupiter.api.Test;
import org.orthodoxmusic.apodeipnon.Path;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PathTest {

    private Path path;

    @Test
    public void testLoadDateReturnsCorrectNumberOfCommands() {
        path = new Path("M1,2 C 3,5 c 7,7 8,9 10,11 L 1,2 z");
        assertEquals(path.numberOfCommand(),4);
    }

    @Test
    public void testLoadDataReturnDataForCommands() {
        path = new Path("M1,2 C 3,5 c 7,7 8,9 10,11 L 1,2 z");
        assertEquals(path.getNumberOfInstructionsForLetter('M'),1);
        assertEquals(path.getNumberOfInstructionsForLetter('L'),1);
        assertEquals(path.getNumberOfInstructionsForLetter('C'),1);
        assertEquals(path.getNumberOfInstructionsForLetter('c'),3);
    }

    @Test
    public void testLoadRealDataWithNeumes() {
        path = new Path("m 64.639998,25.080433 c -0.792,-0.411807 -2.215654,-0.895371 -3.163677,-1.074587 C 60.429742,23.808 52.375464,23.68 40.972712,23.68 25.12777,23.68 21.721366,23.599091 19.176389,23.16229 12.766116,22.06208 7.8999553,19.673748 3.8818988,15.655692 0.94944205,12.723235 -0.15462804,10.550664 0.08883261,8.1917568 0.42565352,4.9282762 2.9394032,1.5180761 5.6732558,0.61582336 7.3575796,0.05994631 11.106828,0.3690577 12.8,1.2033966 c 1.304752,0.6429387 1.615659,1.0424906 3.310271,4.2540866 L 17.980542,9.0019856 16.535504,7.8989632 C 14.89773,6.6488224 12.376185,5.9180013 10.814126,6.2407322 9.2968071,6.5542195 7.4607543,7.8369446 6.8563278,9.0057763 6.0196798,10.623675 6.3273291,14.255149 7.4439931,15.942543 8.55473,17.62098 10.454946,18.602989 12.950588,18.788285 14.011764,18.867075 24.340357,18.487943 35.903017,17.94577 47.465675,17.403596 57.431937,16.96 58.05027,16.96 c 1.056135,0 1.322042,0.247156 4.389504,4.08 3.840195,4.79838 3.914221,4.893577 3.759405,4.834586 -0.06555,-0.02498 -0.767181,-0.382347 -1.559181,-0.794153 z");
        assertEquals(path.getNumberOfInstructionsForLetter('m'),1);
        assertEquals(path.getNumberOfInstructionsForLetter('L'),2);
    }

    @Test
    public void translateTrueNeumes() {
        path = new Path("m 64.639998,25.080433 c -0.792,-0.411807 -2.215654,-0.895371 -3.163677,-1.074587 C 60.429742,23.808 52.375464,23.68 40.972712,23.68 25.12777,23.68 21.721366,23.599091 19.176389,23.16229 12.766116,22.06208 7.8999553,19.673748 3.8818988,15.655692 0.94944205,12.723235 -0.15462804,10.550664 0.08883261,8.1917568 0.42565352,4.9282762 2.9394032,1.5180761 5.6732558,0.61582336 7.3575796,0.05994631 11.106828,0.3690577 12.8,1.2033966 c 1.304752,0.6429387 1.615659,1.0424906 3.310271,4.2540866 L 17.980542,9.0019856 16.535504,7.8989632 C 14.89773,6.6488224 12.376185,5.9180013 10.814126,6.2407322 9.2968071,6.5542195 7.4607543,7.8369446 6.8563278,9.0057763 6.0196798,10.623675 6.3273291,14.255149 7.4439931,15.942543 8.55473,17.62098 10.454946,18.602989 12.950588,18.788285 14.011764,18.867075 24.340357,18.487943 35.903017,17.94577 47.465675,17.403596 57.431937,16.96 58.05027,16.96 c 1.056135,0 1.322042,0.247156 4.389504,4.08 3.840195,4.79838 3.914221,4.893577 3.759405,4.834586 -0.06555,-0.02498 -0.767181,-0.382347 -1.559181,-0.794153 z");
        Path translatedPath = path.translateOnlyLeftForSelectedLetters(20, Arrays.asList(new Character[]{'m','C','L'}));
        System.out.println(translatedPath.getPath());
        assertNotNull(translatedPath.getPath());
    }

    @Test
    public void translateOnlyLeftShouldReturnExpactedData() {
        path = new Path("M1,2 C 3,5 c 7,7 8,9 10,11 L 1,2 z");
        Path translatedPath = path.translateOnlyLeft(5);
        assertEquals("M 6.0,2.0 C 8.0,5.0 c 12.0,7.0 13.0,9.0 15.0,11.0 L 6.0,2.0 z",translatedPath.getPath());
    }

    @Test
    public void translateOnlyLeftWithSelectedLetterShouldReturnExpactedData() {
        path = new Path("M1,2 C 3,5 c 7,7 8,9 10,11 L 1,2 z");
        Path translatedPath = path.translateOnlyLeftForSelectedLetter(5,'M');
        assertEquals("M 6.0,2.0 C 3.0,5.0 c 7.0,7.0 8.0,9.0 10.0,11.0 L 1.0,2.0 z",translatedPath.getPath());
    }

    @Test
    public void translateOnlyLeftWithSelectedLettersShouldReturnExpactedData() {
        path = new Path("M1,2 C 3,5 c 7,7 8,9 10,11 L 1,2 z");
        Character[] chars = {'M', 'L'};
        Path translatedPath = path.translateOnlyLeftForSelectedLetters(5, Arrays.asList(chars));
        assertEquals("M 6.0,2.0 C 3.0,5.0 c 7.0,7.0 8.0,9.0 10.0,11.0 L 6.0,2.0 z",translatedPath.getPath());
    }

    @Test
    public void translateOligonTest() {
        path = new Path("m 69.440001,13.264897 c -0.968,-0.78688 -2.264,-1.572585 -2.88,-1.74601 C 65.86195,11.322363 54.45777,11.202897 36.28938,11.201785 L 7.1387569,11.2 4.634394,7.44 C 3.2569943,5.372 1.6361957,2.888 1.0326191,1.92 l -1.09741185,-1.76 1.81795795,2 1.8179581,2 H 33.267876 62.964625 l 3.95769,4.8573386 c 3.708204,4.5511464 4.606659,5.7201194 4.373587,5.6904564 -0.05275,-0.0067 -0.887901,-0.656017 -1.855901,-1.442898 z");
        Character[] chars = {'M', 'L', 'C', 'H'};
        Path translatedPath1 = path.translateOnlyLeftForSelectedLetters(300, Arrays.asList(chars));
        Path translatedPath2 = path.translateOnlyLeftForSelectedLetters(600, Arrays.asList(chars));
        System.out.println(translatedPath1.getPath());
        System.out.println(translatedPath2.getPath());
        assertNotNull(translatedPath1.getPath());
        assertNotNull(translatedPath2.getPath());
    }

}
