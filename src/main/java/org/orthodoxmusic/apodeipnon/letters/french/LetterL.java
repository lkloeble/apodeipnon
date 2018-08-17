package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class LetterL extends Letter {

    private static final int L_HORIZONTAL_SPACE = 7;

    public LetterL(double currentLetterX, double currentLetterY) {
        super("L");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-75 351 c0 -5 13 -11 29 -14 26 -5 29 -11 34 -59 9 -69 9 -294 1 -391 -7 -76 -7 -77 -35 -77 -36 0 -38 -18 -4 -25 14 -3 37 -7 52 -10 16 -3 36 -8 46 -11 16 -5 17 13 17 281 l0 286 30 6 c61 12 27 23 -70 23 -55 0 -100 -4 -100 -9z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("letter L");
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return L_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return L_HORIZONTAL_SPACE;
    }

}
