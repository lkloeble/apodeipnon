package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

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
        return "<image oligon x=\"" + currentXPosition + "\" y=\"" + y + "\"  width=\"71.36\" height=\"14.72\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAN8AAAAuCAYAAACoN8yQAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKCAYaF37nqAAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAM4SURBVHja7Z0hTOtQGIUPPBBFIJCkkGAIElNVEjAboJYMRxYMlUwg mJhhgiUExBJmQSwQXJshwRGKmpjBTPdaSgKkk/9TEOCFB3lvvX1593zJMTed+f+c3P+e3K5DURSJ bdsghOhluN1uo9/vsxKE6Dbf5uYmdnd3aUBCdJvPsiysr6/j5OSE1SBEp/kAYH5+Ho+Pj7i6umJF CNHEkIgIAPT7fSwuLuLs7Ayzs7OsDCE6dj4AsCwLjUYDpVIJSilWhhBdO98LlUoFDw8PODo6gmVZ rBAhuswXxzFWVlawtLSEg4MDVoiQlBj5uDAxMYG9vT0sLy9jenoaW1tbrBIhaZ753pLP57Gzs4Ny ucwElBBdY+fH8bPT6SAMQ7iuy2oRkvbO93b8BICFhQUEQcBbMITo2PleqFQqODw8BAA4joONjQ1M Tk6ycuS/ZXV1VU/SL18QRZEAoChj5Hme6ADfecj3fTaFMkrNZvPfMJ+IiOd5bApllMIwTNV8X575 XlBKYWpqigcCYhS9Xi+1u87D333Qtm34vs9uEKMolUqI4zibwIXjJ8UAxpMkSbI78zH9pBjAZGw+ EZFWq8WGUMbJ9/3szZckiRQKBTaEMk7dbjdb84mI9Ho9NoMyTo7jSBRF2ZqP4yfFACZD83H8pExV vV7P1nwcPymT1Wq1sjUfx0+KV9AyNF+SJOI4DptBMYDRbT4RkW63y2ZQRqpQKPxRADMw84mI1Ot1 NoPiO4BZmI/jJ8UraBmZj+MnxQAmzM58HD8p0/XdACYV83H8pExPQO/v7wf3JjshpqKUQpIk79bu 7u7w/PyMm5sbHB8f//Ibz/O+/N4JzUfIXxLHMc7Pz1Eul9+tN5vN335ugeYjZIAm3N/ff/2fWwC4 vLxEPp+n+QjRwe3tLba3t9HpdAB8/idMwywVIYPFdV0EQQDP8wDg0w/O/qjVajWWi5DBMj4+jlwu h7GxMZyenuLp6Qm5XA6jo6Ovz4ywTISkg2VZqFarmJubw9raGmZmZlCtVjl2EqKLYrGIMAzRbrcR BMHrOgMXQjShlEKxWESj0YDrutz5CNGFbdu4vr7GxcUFlFLc+QjJgiAI8BNn2KVDT2/cUAAAAABJ RU5ErkJggg== \"/>\n";
    }

    @Override
    public int getLength() {
        return OLIGON_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "Oligon{}";
    }
}
