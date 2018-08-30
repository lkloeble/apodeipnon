package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class Underscore extends Letter {

    private static final int UNDERSCORE_HORIZONTAL_SPACE = 20;

    public Underscore(double currentLetterX, double currentLetterY) {
        super("_");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-200 92 c0 -19 7 -20 230 -20 223 0 230 1 230 20 0 19 -7 20 -230 20 -223 0 -230 -1 -230 -20z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("symbol underscore");
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return UNDERSCORE_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return UNDERSCORE_HORIZONTAL_SPACE;
    }

}
