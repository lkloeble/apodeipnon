package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class LetterU extends Letter {

    private static final int U_HORIZONTAL_SPACE = 15;

    public LetterU(double currentLetterX, double currentLetterY) {
        super("U");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-103 242 c-34 -29 -44 -79 -45 -219 l0 -108 -30 0 c-38 0 -39 -18 -2 -25 15 -3 43 -10 63 -15 20 -6 38 -10 41 -10 2 0 4 66 4 148 -1 101 3 154 12 169 17 31 75 40 118 20 57 -28 65 -51 62 -173 l-3 -109 -32 -3 c-50 -5 -39 -19 24 -32 32 -7 63 -15 70 -17 10 -4 13 30 13 158 0 197 3 209 41 209 16 0 29 5 29 10 0 6 -30 10 -70 10 l-70 0 0 -37 0 -37 -32 31 c-46 42 -70 53 -122 53 -32 0 -52 -6 -71 -23z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("letter U");
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return U_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return U_HORIZONTAL_SPACE;
    }

}

