package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Varea extends Neume  {
    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int currentXPosition) {
        this.xStart = currentXPosition;
        return "<path varea d=\"M" + currentXPosition + " 863 c-13 -13 -7 -31 12 -36 21 -5 21 -2 45 -187 21 -151 47 -251 102 -380 84 -200 199 -347 317 -405 80 -39 191 -65 208 -48 7 7 -13 16 -63 28 -40 9 -89 25 -109 35 -55 29 -132 103 -162 158 -53 97 -84 285 -96 571 -8 174 -9 185 -30 203 -37 29 -209 77 -224 61z\"/>";
    }

    @Override
    public boolean isUnspoken() {
        return true;
    }

    @Override
    public int getLength() {
        return 650;
    }

    @Override
    public String toString() {
        return "Varea{}";
    }

}
