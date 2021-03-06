package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Apostrophos extends Neume {

    private static int APOSTROPHOS_LENGTH = 30;

    public Apostrophos() {
        xSpaceBetweenNeume = 10;
        height = 16;
    }



    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        int y = maxHeight - height + 13;
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = wordUnderNeumeLength/2;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        this.xStart = currentXPosition;
        //return "<image apostrophos x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"30.4\" height=\"16\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAF8AAAAyCAYAAAA6JgdxAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKDCgM76TzCQAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAPqSURBVHja7Zw/S+tQGMYfL3dp6KDiIKJFOpQiDgqJH8DRJUU/gEtw dCt+gkwdD052MO4tOlY6KHYoCFYkqAmo1YgomrpIMp473JtSe22bpP+b88AZ2pJT+nvOed9zct50 rFQq0fv7e/ykxcXF/96bmprC5OQkmNrXGKWUOi90XQcAqKoKACgWi/j8/EQ6nW7YgSRJmJiYqJoV DocRDocxPz8PAJibm0MoFGKkW8Fvpkqlgo+PD7y/v+Pt7Q23t7d4eHhoakytRFFELBbD+Pg44vF4 1SCO4zA7O8vg+5VjjKqq+Pr6gqqqODk5wfn5ues+HHMikQhmZmYQjUbBcRxisRiD70e2bcMwDJTL Zei6jqenJ6RSKc/9iKKIlZUVxONxRKNRRCKRkcg7XYXfSM/Pz3h8fMTd3R1UVW3LEJ7nsbCwMJSh qy/wGxlyfX0NXdeRz+dxdHTk6XpBEJBIJMDzPHieH4qZMTDwf8ojNzc3OD09xeHhoaf84cyM9fV1 rK6uDuysGFj49dJ1HcViEdls1vOsGFgj6BDKMAyqKAoVRZEC8NREUaS5XI5altX33zGU8OuNIIRQ QRA8G0EIoZqmMfjtyrIsWigUqCRJvmZDoVBg8DshTdMoIcSzCYIg0Ewm07OQNJLwHZmmOdAmjDT8 2pCUyWQ85wXHBAa/jyZ0KycECn67JiSTyY6ujgIJv94EP0vUTuSDQMOvTcyyLHvOB+2GIga/RqVS yVcoMk2Twe9UKPK6URMEgeZyOQa/XwYAoLIse8oFDH6HDRAEwfWKiMFvkYj93LAD4CoMMfgt5Gcp 6nZJyuC7CD9+Rz8AKklSQwN+sdKl5gqFQkgkEr6vT6fT2N7ehm3b/332m+FtrXg83tb1TmHZ3t7e t/fZyHehn2pW/RhwcHDA4HuVU7varjY3N6v1sAy+S728vHSsr9raVgbfhfL5fMf6SqVS1dHP4LfQ 5eWl5zqhVjo+Pmbw3Wh3d7drM2loKtb6oWw2i42Nja70bVkWg98s3CwvL3etf03TWNhpBH5ra6vr 38N2uD0MNbXiOA7sxto/aZrm6/6930YppYEe+bZt4+LiAvv7+64f7OuEZFkOXtjRdR2WZeHq6gpn Z2c9BV6rtbW10YFfqVSws7NTfR64fkc5SCKEYGlp6e+LUYrbiqL0LGb7aclk8tvBCkYxcfp5YqXb jRASnGNEP7WY3WqNDtNHeqlpWZav+vxONUmSqGEYwT5AN02TKorSs5ngtq4/cPX5fp/bgoc6frdV a4Hd4ZqmSXO5HE0mk22PckJI0/DSSOyuZs0GrFwu4/X19duZrbNPqP9foenp6bb/8+EPPZ6n50/2 5+AAAAAASUVORK5CYII= \"/>\n";

        String apostrophosPath = "m 21.512397,15.643223 c -0.928182,-0.154081 -2.440182,-0.669529 -3.36,-1.14544 L 16.48,13.632491 17.92,13.355569 C 21.521365,12.663002 23.68,11.062106 23.68,9.0838122 23.68,6.1594733 15.774934,2.490307 6.24,0.98897002 1.5093256,0.24409479 2.8222828,0.14923394 8.64,0.81557059 16.651986,1.7332295 20.816411,3.0891656 25.89169,6.4327184 c 4.195996,2.7642886 5.164004,4.9137576 3.213398,7.1353746 -1.563792,1.781062 -4.511338,2.586644 -7.592691,2.07513 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + apostrophosPath + "\"\n" +
                "     id=\"apostrophos\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";


    }

    @Override
    public int getLength() {
        return APOSTROPHOS_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 -12;
    }

    public int getGorgonCorrection() {
        return getLength()/2 - 40;
    }

    public int getUnderGorgonCorrection() {
        return getLength()/2 - 35;
    }

    @Override
    public int getDieseCorrection() {
        return -30;
    }

    @Override
    public String toString() {
        return "Apostrophos{}";
    }
}
