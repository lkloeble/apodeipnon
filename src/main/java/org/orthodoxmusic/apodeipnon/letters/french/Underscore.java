package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class Underscore implements Letter {

    private static final int UNDERSCORE_HORIZONTAL_SPACE = 20;

    private SVGPath svgPath;

    public Underscore(double currentLetterX, double currentLetterY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-200 72 c0 -19 7 -20 230 -20 223 0 230 1 230 20 0 19 -7 20 -230 20 -223 0 -230 -1 -230 -20z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("symbol underscore");
        this.svgPath = svgPath;
    }

    @Override
    public String getLetterName() {
        return "_";
    }

    public int getHorizontalSpace() {
        return UNDERSCORE_HORIZONTAL_SPACE;
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    public double getCurrentY() {
        return (int) svgPath.getTranslateY();
    }

    public double getCurrentX() {
        return (int) svgPath.getTranslateX() + UNDERSCORE_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return (int)(svgPath.getBoundsInLocal().getWidth()*getSvgPath().getScaleX()) + UNDERSCORE_HORIZONTAL_SPACE;
    }

}
