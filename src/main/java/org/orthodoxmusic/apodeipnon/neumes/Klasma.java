package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Klasma extends Neume  {

    private Neume neumeWithKlasma;

    public Klasma(Neume neumeWithKlasma) {
        this.neumeWithKlasma = neumeWithKlasma;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        currentXPosition += neumeWithKlasma.getKlasmaCorrection();
        this.xStart = currentXPosition;
        int y = maxHeight - 18;
        return "<image klasma x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"20.16\" height=\"10.56\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAD8AAAAhCAYAAABug3M0AAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goLExAr8vd5sQAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAJtSURBVGje3Vkhk/IwEH33OSyaOYHAosJUorD9E7EIRPgH/IIiMf0B Ecj6CBwGkwoE1QHDxO6Zr0yvVy4tLdDezqyAYba8l83u2+3HarWixWKBXq+Htttyufz22fM8DIdD fH5+ot/vVw8ohKAgCKgLliQJcc4JwA/nnJNSiqy1pePBGEOMMYqiqBMEpP+3iAAAlbCAiCiKIgJA SqlOELDf7++Cz2aCMcYNnohICEGMMUqSpBMECCGcBDDGSGvtBm+tJcZYZwjQWjvBp34vo1EUsCsE +L5fiwDkv0jvfxcICMOwNHgAP/CgKGgQBJ0goErqp3iyrbAQvLX21k9dReOdZq2tBB7AN02D3wJn 71Rb22BV8ABuLRAuRZUVFGEY/gnw6emjjKTMEiCEqCQh23Tn86ePMg/JE9CWOlC12mddSlkOfBEB 6TV4VxakouxR8Jzz8uDvEcAYIynly0mQUj4M/OaPjJVFyuqVJCil6gN/BHxeBxSREATB08RRqkDf Bj4lwDVZcc5JSkla61oZYYyhKIoqafky/vG/Vz5s6/Ua8/m81G8ZY5hOp7cV1G92vV5xOBwQxzG2 2+1z9mKtS8UXOeec/jVB4Gw2g9YajDF0xcbjcTMnX6UOtMWVUoRnVeQ6AuTZno62eFYvNsa0Nguk lOUGmyYESZuyILvQwCukqLW2GTnagGcHMrxSjxtjbiuydxU55w7vr5Hg+36h3H4L+Px1aFq25oct 50uLNryEDMOwESJ836coipzzRG1t/ww7n884nU44Ho/Y7Xa4XC7YbDbOmcHzPEwmEwwGg1LPaSV4 l8VxDAAYjUa14nwBaKphIia6JOcAAAAASUVORK5CYII= \"/>\n";
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
