package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class AscendingOligonBeforeDown extends Neume {

    private static int ASCENDING_OLIGON_BEFORE_DOWN_LENGTH = 71;

    public AscendingOligonBeforeDown() {
        xSpaceBetweenNeume = 15;
        height = 28;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = wordUnderNeumeLength/2;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        this.xStart = currentXPosition;
        int y = maxHeight - height + 29;
        //return "<image +2oligon x=\"" + currentXPosition + "\" y=\""  + y + "\"  width=\"71.36\" height=\"27.84\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";

        String ascendingOligonPath = "m 38.418651,26.536209 c -2.440838,-0.318178 -5.054656,-1.415066 -5.883779,-2.469125 -0.345155,-0.438794 -1.076063,-2.254787 -1.624237,-4.035541 -1.157336,-3.759621 -1.64309,-4.81384 -2.801248,-6.079475 l -0.843469,-0.921742 1.663185,0.210533 c 0.914752,0.115793 2.786751,0.497703 4.159999,0.848689 3.484733,0.890655 4.055021,1.537601 5.678522,6.441842 1.198096,3.619182 1.401751,4.000308 2.638803,4.9383 0.737277,0.559041 1.253277,1.103666 1.146666,1.210279 -0.238413,0.238414 -1.55345,0.192689 -4.134442,-0.14376 z M 69.025919,12.107274 C 66.769951,10.132242 68.545836,10.234172 36.316197,10.229849 L 6.7859182,10.225849 6.0078742,9.0298097 C 0.37748624,0.37459871 0.39405824,0.40288571 1.8856002,1.9938107 l 1.425046,1.519999 29.7376368,0.01806 29.737636,0.01806 3.2,3.992053 c 4.839101,6.0368583 5.004342,6.2850083 3.04,4.5652873 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + ascendingOligonPath + "\"\n" +
                "     id=\"oligon+2\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";


    }

    @Override
    public int getLength() {
        return ASCENDING_OLIGON_BEFORE_DOWN_LENGTH;
    }

    @Override
    public int getAndikenomaCorrection() {
        return 20;
    }

    @Override
    public String toString() {
        return "AscendingOligonBeforeDown{}";
    }


}
