package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Klasma extends Neume  {

    private Neume neumeWithKlasma;

    public Klasma(Neume neumeWithKlasma) {
        this.neumeWithKlasma = neumeWithKlasma;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        currentXPosition += neumeWithKlasma.getKlasmaCorrection();
        int y = maxHeight - 18;
        //return "<image klasma x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"20.16\" height=\"10.56\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAD8AAAAhCAYAAABug3M0AAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goLExAr8vd5sQAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAJtSURBVGje3Vkhk/IwEH33OSyaOYHAosJUorD9E7EIRPgH/IIiMf0B Ecj6CBwGkwoE1QHDxO6Zr0yvVy4tLdDezqyAYba8l83u2+3HarWixWKBXq+Htttyufz22fM8DIdD fH5+ot/vVw8ohKAgCKgLliQJcc4JwA/nnJNSiqy1pePBGEOMMYqiqBMEpP+3iAAAlbCAiCiKIgJA SqlOELDf7++Cz2aCMcYNnohICEGMMUqSpBMECCGcBDDGSGvtBm+tJcZYZwjQWjvBp34vo1EUsCsE +L5fiwDkv0jvfxcICMOwNHgAP/CgKGgQBJ0goErqp3iyrbAQvLX21k9dReOdZq2tBB7AN02D3wJn 71Rb22BV8ABuLRAuRZUVFGEY/gnw6emjjKTMEiCEqCQh23Tn86ePMg/JE9CWOlC12mddSlkOfBEB 6TV4VxakouxR8Jzz8uDvEcAYIynly0mQUj4M/OaPjJVFyuqVJCil6gN/BHxeBxSREATB08RRqkDf Bj4lwDVZcc5JSkla61oZYYyhKIoqafky/vG/Vz5s6/Ua8/m81G8ZY5hOp7cV1G92vV5xOBwQxzG2 2+1z9mKtS8UXOeec/jVB4Gw2g9YajDF0xcbjcTMnX6UOtMWVUoRnVeQ6AuTZno62eFYvNsa0Nguk lOUGmyYESZuyILvQwCukqLW2GTnagGcHMrxSjxtjbiuydxU55w7vr5Hg+36h3H4L+Px1aFq25oct 50uLNryEDMOwESJ836coipzzRG1t/ww7n884nU44Ho/Y7Xa4XC7YbDbOmcHzPEwmEwwGg1LPaSV4 l8VxDAAYjUa14nwBaKphIia6JOcAAAAASUVORK5CYII= \"/>\n";

        String klasmaPath = "M 11.586492,9.8925848 C 8.1214568,9.0759378 3.2892411,5.4964982 0.60756588,1.76 -0.18588832,0.65444474 -0.02056242,0.75387834 1.8206558,2.4896007 4.3677364,4.8907418 6.8122129,6.097863 9.5769698,6.319791 13.277737,6.6168528 15.116893,5.3888861 14.776144,2.8484093 14.680384,2.1344634 14.351513,1.2735025 14.04532,0.93516284 c -0.539168,-0.5957734 -0.521342,-0.6151628 0.565558,-0.6151628 1.354281,0 3.007661,1.04859996 4.018515,2.54860586 0.948578,1.4075944 1.160688,2.2992347 0.89009,3.7416459 -0.528818,2.818841 -3.929479,4.2258902 -7.932991,3.282333 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + klasmaPath + "\"\n" +
                "     id=\"klasma\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";


    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String toString() {
        return "Klasma{}";
    }

}
