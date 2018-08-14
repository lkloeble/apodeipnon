package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class LetterE implements Letter {

    private static final int E_HORIZONTAL_SPACE = 11;

    private SVGPath svgPath;

    public LetterE(double currentLetterX, double currentLetterY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-45 248 c-74 -35 -110 -106 -101 -199 7 -67 31 -109 85 -147 30 -21 56 -30 94 -33 94 -7 157 44 166 135 5 61 3 62 -157 62 l-114 0 6 37 c13 78 79 128 156 118 25 -3 56 -12 69 -21 27 -17 35 -15 26 9 -18 47 -160 71 -230 39z m166 -247 c0 -83 -62 -127 -134 -94 -42 19 -74 110 -43 122 6 3 49 6 95 6 l82 1 0 -35z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("letter E");
        this.svgPath = svgPath;
    }

    @Override
    public String getLetterName() {
        return "E";
    }

    public int getHorizontalSpace() {
        return E_HORIZONTAL_SPACE;
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    public double getCurrentY() {
        return svgPath.getTranslateY();
    }

    public double getCurrentX() {
        return svgPath.getTranslateX() + E_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return (int)(svgPath.getBoundsInLocal().getWidth()*getSvgPath().getScaleX()) + E_HORIZONTAL_SPACE;
    }

}

