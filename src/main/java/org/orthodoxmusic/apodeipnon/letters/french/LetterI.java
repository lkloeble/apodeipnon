package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class LetterI implements Letter {

    private static final int I_HORIZONTAL_SPACE = 4;

    private SVGPath svgPath;

    public LetterI(int currentLetterX, int currentLetterY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-78 251 c0 -5 13 -11 29 -14 29 -6 29 -6 36 -100 4 -52 4 -122 0 -156 -7 -59 -8 -61 -36 -61 -37 0 -38 -18 -2 -25 16 -3 44 -10 64 -15 20 -6 39 -10 43 -10 3 0 6 81 6 180 l0 181 30 6 c61 12 27 23 -70 23 -55 0 -100 -4 -100 -9z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("letter I");
        this.svgPath = svgPath;
    }

    @Override
    public String getLetterName() {
        return "I";
    }


    public int getHorizontalSpace() {
        return I_HORIZONTAL_SPACE;
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }
}
