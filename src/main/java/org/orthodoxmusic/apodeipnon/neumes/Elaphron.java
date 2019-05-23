package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Elaphron extends Neume {

    private static int ELAPHRON_LENGTH = 55;

    public Elaphron() {
        xSpaceBetweenNeume = 15;
        height = 19;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        //return "<image elaphron x=\"" + currentXPosition + "\" y=\""  + y + "\" width=\"55.04\" height=\"19.2\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";

        String elaphronPath = "M 48.480001,15.173321 C 37.035181,7.4628375 25.836445,3.0949414 18.88,3.6282949 15.99653,3.8493717 14.783077,4.2383343 12.538656,5.6609613 10.295963,7.0824925 8.2320149,9.2404872 7.317532,11.119994 6.4486715,12.905735 6.1193128,16.477606 6.7200148,17.600028 7.0990564,18.308275 7.0840948,18.306407 6.0337524,17.514387 5.4431886,17.069068 3.9970922,16.271308 2.820205,15.741588 0.81767041,14.840242 0.6563883,14.689347 0.30592828,13.389231 -0.20682291,11.487057 0.15664549,8.8667467 1.1988727,6.9518317 2.7847689,4.0380181 5.7574651,2.136319 10.667394,0.89461089 12.885674,0.33361387 13.85958,0.26337594 17.12,0.42925026 c 2.112,0.1074483 4.656936,0.39926233 5.655414,0.64847564 8.817801,2.200865 18.284318,7.193655 28.203499,14.8749701 1.8816,1.45709 3.421088,2.711816 3.421088,2.78828 0,0.360157 -0.852032,-0.153316 -5.92,-3.567655 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + elaphronPath + "\"\n" +
                "     id=\"elaphron\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return ELAPHRON_LENGTH;
    }

    @Override
    public int getKlasmaCorrection() {
        return +4;
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public int getUnderGorgonCorrection() {
        return getLength() - 70;
    }

    @Override
    public int getDiplieCorrection() {
        return 10;
    }

    @Override
    public String toString() {
        return "Elaphron{}";
    }

}
