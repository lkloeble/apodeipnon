package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class ApostrosAndElaphron extends Neume {

    private static int APOSTROPHOS_AND_ELAPHRON_LENGTH = 55;

    public ApostrosAndElaphron() {
        xSpaceBetweenNeume = 15;
        height = 20;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        //return "<image apostrophos+elaphron x=\"" + currentXPosition + "\" y=\""  + y + "\"  width=\"55.04\" height=\"20.16\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 SUVORK5CYII= \"/>\n";

        String apostrophosAndElaphronPath = "m 29.760001,19.405055 c -0.616,-0.22377 -1.536445,-0.628185 -2.045434,-0.898702 l -0.925433,-0.491847 1.606876,-0.21316 c 3.19225,-0.423467 5.084464,-2.762995 3.716563,-4.595148 C 30.726527,11.349739 25.029345,9.0110122 20.16,8.2995958 18.84,8.1067427 17.184,7.8337322 16.48,7.6929059 c -2.75977,-0.5520566 0.720528,-0.3399213 5.34463,0.3257722 5.24339,0.7548473 7.926404,1.5947088 11.347451,3.5520809 5.067609,2.899465 5.937033,5.682495 2.34792,7.515705 -1.63465,0.834928 -3.981304,0.964724 -5.76,0.318591 z m 18.72,-4.231734 C 37.035181,7.4628371 25.836445,3.0949412 18.88,3.6282947 15.99653,3.8493715 14.783077,4.2383341 12.538656,5.660961 10.295963,7.0824922 8.2320149,9.2404867 7.317532,11.119993 6.4486715,12.905734 6.1193128,16.477605 6.7200148,17.600027 7.0990564,18.308274 7.0840948,18.306406 6.0337524,17.514387 5.4431886,17.069067 3.9970922,16.271307 2.820205,15.741588 0.81767041,14.840242 0.6563883,14.689346 0.30592828,13.38923 -0.20682291,11.487056 0.15664549,8.8667462 1.1988727,6.9518314 2.7847689,4.0380179 5.7574651,2.1363189 10.667394,0.89461085 12.885674,0.33361386 13.85958,0.26337593 17.12,0.42925024 c 2.112,0.10744829 4.656936,0.3992623 5.655414,0.64847556 8.817801,2.2008649 18.284318,7.1936547 28.203499,14.8749692 1.8816,1.45709 3.421088,2.711816 3.421088,2.78828 0,0.360157 -0.852032,-0.153316 -5.92,-3.567654 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + apostrophosAndElaphronPath + "\"\n" +
                "     id=\"apostrophosAndElaphron\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return APOSTROPHOS_AND_ELAPHRON_LENGTH;
    }

    @Override
    public String toString() {
        return "ApostrophosAndElaphron{}";
    }


}
