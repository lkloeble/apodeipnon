package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Bareia extends Neume {

    private static int BAREIA_LENGTH = 20;

    public Bareia() {
        height = 28;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        //return "<image bareia x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"59.84\" height=\"39.04\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 f708+zdOdPrWVk+K6wAAAABJRU5ErkJggg== \"/>\n";

        String bareiaPath = "M 48.033482,38.366491 C 30.006746,37.070731 16.29922,31.240875 10.620357,22.45457 9.7025722,21.034578 8.6927792,18.558611 7.1781242,14.014368 4.8102378,6.9102754 3.0284732,3.0110862 1.6013569,1.810247 0.40019507,0.79953592 0.66675846,0.68921026 4.9205795,0.43648193 8.0797059,0.24879171 8.1783293,0.26383465 8.899489,1.0433802 9.9586637,2.1883068 11.824503,6.7020498 13.759306,12.8 c 0.921403,2.904 2.035703,6 2.476222,6.880001 2.61694,5.227706 7.606203,9.980523 13.701334,13.052016 2.498847,1.259232 7.68165,2.97289 11.70052,3.868694 3.626336,0.808311 7.355712,1.267047 14.362618,1.766688 l 3.68,0.26241 -4,-6.4e-4 c -2.2,-3.2e-4 -5.640934,-0.118554 -7.646518,-0.262717 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + bareiaPath + "\"\n" +
                "     id=\"bareia\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return BAREIA_LENGTH;
    }

    @Override
    public boolean isUnspoken() {
        return true;
    }

    @Override
    public String toString() {
        return "Bareia{}";
    }
}



