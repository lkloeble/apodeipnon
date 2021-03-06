package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.Path;
import org.orthodoxmusic.apodeipnon.TextLinePositions;

import java.util.Arrays;

public class Oligon extends Neume {

    private static int OLIGON_LENGTH = 71;

    public Oligon() {
        height = 15;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        int y = maxHeight - height + 13;
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = (wordUnderNeumeLength - OLIGON_LENGTH)*2;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        this.xStart = currentXPosition;
        //return "<image oligon x=\"" + currentXPosition + "\" y=\"" + y + "\"  width=\"71.36\" height=\"14.72\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAN8AAAAuCAYAAACoN8yQAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKCAYaF37nqAAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAM4SURBVHja7Z0hTOtQGIUPPBBFIJCkkGAIElNVEjAboJYMRxYMlUwg mJhhgiUExBJmQSwQXJshwRGKmpjBTPdaSgKkk/9TEOCFB3lvvX1593zJMTed+f+c3P+e3K5DURSJ bdsghOhluN1uo9/vsxKE6Dbf5uYmdnd3aUBCdJvPsiysr6/j5OSE1SBEp/kAYH5+Ho+Pj7i6umJF CNHEkIgIAPT7fSwuLuLs7Ayzs7OsDCE6dj4AsCwLjUYDpVIJSilWhhBdO98LlUoFDw8PODo6gmVZ rBAhuswXxzFWVlawtLSEg4MDVoiQlBj5uDAxMYG9vT0sLy9jenoaW1tbrBIhaZ753pLP57Gzs4Ny ucwElBBdY+fH8bPT6SAMQ7iuy2oRkvbO93b8BICFhQUEQcBbMITo2PleqFQqODw8BAA4joONjQ1M Tk6ycuS/ZXV1VU/SL18QRZEAoChj5Hme6ADfecj3fTaFMkrNZvPfMJ+IiOd5bApllMIwTNV8X575 XlBKYWpqigcCYhS9Xi+1u87D333Qtm34vs9uEKMolUqI4zibwIXjJ8UAxpMkSbI78zH9pBjAZGw+ EZFWq8WGUMbJ9/3szZckiRQKBTaEMk7dbjdb84mI9Ho9NoMyTo7jSBRF2ZqP4yfFACZD83H8pExV vV7P1nwcPymT1Wq1sjUfx0+KV9AyNF+SJOI4DptBMYDRbT4RkW63y2ZQRqpQKPxRADMw84mI1Ot1 NoPiO4BZmI/jJ8UraBmZj+MnxQAmzM58HD8p0/XdACYV83H8pExPQO/v7wf3JjshpqKUQpIk79bu 7u7w/PyMm5sbHB8f//Ibz/O+/N4JzUfIXxLHMc7Pz1Eul9+tN5vN335ugeYjZIAm3N/ff/2fWwC4 vLxEPp+n+QjRwe3tLba3t9HpdAB8/idMwywVIYPFdV0EQQDP8wDg0w/O/qjVajWWi5DBMj4+jlwu h7GxMZyenuLp6Qm5XA6jo6Ovz4ywTISkg2VZqFarmJubw9raGmZmZlCtVjl2EqKLYrGIMAzRbrcR BMHrOgMXQjShlEKxWESj0YDrutz5CNGFbdu4vr7GxcUFlFLc+QjJgiAI8BNn2KVDT2/cUAAAAABJ RU5ErkJggg== \"/>\n";

        String oligonPath = "m 69.440001,13.264897 c -0.968,-0.78688 -2.264,-1.572585 -2.88,-1.74601 C 65.86195,11.322363 54.45777,11.202897 36.28938,11.201785 L 7.1387569,11.2 4.634394,7.44 C 3.2569943,5.372 1.6361957,2.888 1.0326191,1.92 l -1.09741185,-1.76 1.81795795,2 1.8179581,2 H 33.267876 62.964625 l 3.95769,4.8573386 c 3.708204,4.5511464 4.606659,5.7201194 4.373587,5.6904564 -0.05275,-0.0067 -0.887901,-0.656017 -1.855901,-1.442898 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + oligonPath + "\"\n" +
                "     id=\"oligon\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return OLIGON_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public int getUnderGorgonCorrection() {
        return getLength() - 70;
    }

    @Override
    public int getDiplieCorrection() {
        return getLength()/2 -10;
    }

    @Override
    public String toString() {
        return "Oligon{}";
    }
}
