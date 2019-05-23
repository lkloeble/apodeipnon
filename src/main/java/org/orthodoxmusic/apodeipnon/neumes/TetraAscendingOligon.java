package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class TetraAscendingOligon extends Neume {

    private static int TETRA_ASCENDING_OLIGON_LENGTH = 82;

    public TetraAscendingOligon() {
        xSpaceBetweenNeume = 15;
        height = 43;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        //return "<image oligon+4 x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"81.6\" height=\"43.2\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 /Qz/BcBRQOyw8oKUAAAAAElFTkSuQmCC \"/>\n";

        String tetraAscendingOligonPath = "M 69.439998,41.553467 C 67.18403,39.578433 68.959915,39.680363 36.730277,39.676039 L 7.1999998,39.672078 6.421956,38.476039 C 0.79156705,29.820789 0.80813988,29.849076 2.299681,31.440001 l 1.4250466,1.52 29.7376364,0.01805 29.737634,0.01805 3.2,3.992051 c 4.839101,6.036861 5.004343,6.285011 3.04,4.56529 z m -6.08,-14.361913 C 59.706927,25.112213 55.023979,23.294003 50.479477,22.19054 46.946293,21.332638 45.80925,20.809608 47.439999,20.792405 c 1.157513,-0.01221 4.134957,-1.367054 6.587731,-2.997657 3.184384,-2.116974 5.52016,-4.525326 9.466752,-9.7608973 4.559132,-6.048172 6.91527,-7.71385069 10.911411,-7.71385069 1.763878,0 4.971731,1.34188869 6.046265,2.52923719 0.532336,0.588223 0.49495,0.6204944 -1.12007,0.9668541 -3.813872,0.817929 -5.548781,1.9915901 -10.69209,7.2331607 -5.435008,5.538842 -8.831791,8.001281 -13.054079,9.463325 l -2.545338,0.88137 1.399709,0.373805 c 3.192752,0.852652 9.568556,4.457248 11.333443,6.407425 0.735465,0.812681 0.758771,0.822177 -2.413735,-0.983623 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + tetraAscendingOligonPath + "\"\n" +
                "     id=\"oligon+4\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return TETRA_ASCENDING_OLIGON_LENGTH;
    }

    @Override
    public String toString() {
        return "TetraAscendingOligon{}";
    }


}
