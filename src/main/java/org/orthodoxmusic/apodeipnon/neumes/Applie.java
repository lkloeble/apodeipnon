package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Applie extends Neume {

    private static int APPLIE_LENGTH = 8;
    private Neume neumeWithAapplie;

    public Applie(Neume neumeWithApplie) {
        this.neumeWithAapplie = neumeWithApplie;
        height = 13;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + neumeWithAapplie.getHeight() + 45;
        currentXPosition += 40;

        String appliePath = "M 1.3569409,6.1170119 C 1.9437904,5.7210119 2.8989798,4.5835844 3.4795839,3.5893956 4.0601881,2.5952064 4.9803823,1.4072064 5.5244597,0.9493954 6.4644034,0.15848481 6.697045,0.11701179 10.193691,0.11701179 h 3.68 L 12.901186,0.9353209 C 12.366308,1.385391 11.419509,2.5918177 10.797188,3.6162692 10.112093,4.7440561 9.3182959,5.6186199 8.7851407,5.8330369 8.101877,6.1078225 2.1530689,6.8352778 0.57726453,6.8367444 0.41923703,6.8368916 0.77009143,6.5130119 1.3569409,6.1170119 Z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + appliePath + "\"\n" +
                "     id=\"applie\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";


    }

    @Override
    public int getLength() {
        return APPLIE_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "Applie{}";
    }

}
