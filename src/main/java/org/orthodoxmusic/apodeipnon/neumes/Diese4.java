package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Diese4 extends Neume {

    private static int DIESE4_LENGTH = 0;

    private Neume neumeWithDiese;

    public Diese4(Neume neumeWithDiese) {
        this.neumeWithDiese=neumeWithDiese;
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 14;
        currentXPosition += neumeWithDiese.getDieseCorrection() -5;
        //return "<image diese4 x=\"" + (currentXPosition+30) + "\" y=\"" + y + "\" width=\"33.6\" height=\"22.72\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,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 \"/>\n";

        String diese4Path = "M 5.062577,22.273602 C 1.8975754,21.421383 0.02053844,18.99918 0.00702784,15.749721 -0.00972186,11.721222 2.471091,9.2065279 7.3315573,8.3251571 10.539397,7.7434649 14.763413,8.5900044 15.982488,10.0589 c 0.228732,0.275605 0.572582,0.5011 0.764111,0.5011 0.292728,0 7.153514,-3.1007482 7.542007,-3.4086272 0.07073,-0.056056 -0.469267,-1.3887212 -1.2,-2.9614773 -1.490043,-3.20701478 -1.533822,-3.40267429 -0.822435,-3.67565911 1.031854,-0.39595957 1.281485,-0.13192389 2.533828,2.68003951 0.703999,1.5807351 1.399326,2.8766874 1.545169,2.8798938 0.145843,0.00321 1.566757,-0.5989136 3.157586,-1.3380445 2.784438,-1.2937049 2.908934,-1.3212873 3.334831,-0.7388387 0.243328,0.3327699 0.442413,0.7843526 0.442413,1.0035171 0,0.2191642 -1.367922,1.0464717 -3.039827,1.8384604 -3.447739,1.6332095 -3.306739,1.1536582 -1.470338,5.000735 0.916996,1.921014 0.95142,2.110575 0.450365,2.48 -0.298388,0.22 -0.708221,0.4 -0.910742,0.4 -0.20252,0 -0.913613,-1.224 -1.580206,-2.72 C 26.062657,10.504 25.400783,9.2799996 25.258418,9.2799996 c -0.142365,0 -1.857843,0.7442704 -3.812173,1.6539344 -2.797611,1.302179 -3.508177,1.761563 -3.34104,2.16 0.116758,0.278336 0.285421,1.192665 0.374809,2.031842 0.335745,3.152017 -1.78766,6.118733 -5.079027,7.096164 -2.000001,0.593936 -6.2272255,0.620127 -8.33841,0.05166 z m 6.5477,-0.944684 c 1.44067,-0.603121 3.328301,-2.80388 3.750831,-4.373036 0.484281,-1.798482 -0.244085,-3.966767 -1.847246,-5.499098 -1.62353,-1.5517988 -2.317599,-1.8567844 -4.2255736,-1.8567844 -3.0235246,0 -5.3777376,1.8380914 -6.0745724,4.7428244 -0.6433075,2.681606 0.5112252,5.295625 3.0126455,6.821039 1.1671382,0.711744 3.8794215,0.794894 5.3839155,0.165055 z";

        return "  <path\n" +
                "     style=\"fill:#FF0000;stroke-width:0.31999999\"\n" +
                "     d=\"" + diese4Path + "\"\n" +
                "     id=\"diese4\"\n" +
                "     transform=\"translate("+ (currentXPosition+30) +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return DIESE4_LENGTH;
    }

    @Override
    public String toString() {
        return "Diese4{}";
    }
}
