package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Petastie extends Neume {
    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int horizontalIndice) {
        return "<svg version=\"1.0\" xmlns=\"http://www.w3.org/2000/svg\"\n" +
                " width=\"152.000000pt\" height=\"52.000000pt\" viewBox=\"0 0 152.000000 52.000000\"\n" +
                " preserveAspectRatio=\"xMidYMid meet\">\n" +
                "\n" +
                "<g transform=\"translate(0.000000,52.000000) scale(0.100000,-0.100000)\"\n" +
                "fill=\"#000000\" stroke=\"none\">\n" +
                "<path d=\"M1135 511 c-42 -9 -45 -37 -4 -45 17 -3 40 -6 51 -6 71 0 128 -73\n" +
                "128 -161 -1 -97 -49 -167 -145 -211 -45 -21 -64 -23 -180 -22 -112 1 -141 5\n" +
                "-206 27 -184 63 -428 203 -456 262 -14 29 -14 35 1 57 9 14 34 33 56 43 44 20\n" +
                "47 26 25 45 -12 10 -58 12 -202 7 -103 -4 -191 -11 -196 -16 -19 -19 7 -52 76\n" +
                "-94 519 -316 768 -409 1052 -394 184 10 306 67 358 167 26 49 28 62 23 114 -7\n" +
                "71 -42 136 -88 164 -74 45 -221 77 -293 63z\"/>\n" +
                "</g>\n" +
                "</svg>\n";
    }

    @Override
    public int getLength() {
        return 0;
    }
}
