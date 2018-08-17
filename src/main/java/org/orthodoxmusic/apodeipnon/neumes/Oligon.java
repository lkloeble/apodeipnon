package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Oligon implements Neume {

    private static final int OLIGON_HORIZONTAL_SPACE = 60;

    private SVGPath svgPath;

    public Oligon(double currentNeumeX, double currentNeumeY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M910 150 c-31 -14 -124 -16 -820 -21 l-785 -5 -41 -22 c-50 -26 -134 -118 -134 -144 0 -26 23 -34 52 -17 18 10 181 14 808 18 883 6 823 0 908 83 58 56 79 95 60 112 -10 10 -20 9 -48 -4z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public String getNeumeName() {
        return "Oligon";
    }

    @Override
    public int getHorizontalSpace() {
        return OLIGON_HORIZONTAL_SPACE;
    }

    @Override
    public SVGPath getSvgPath() {
        return svgPath;
    }

    @Override
    public double getCurrentY() {
        return svgPath.getTranslateY();
    }

    @Override
    public double getCurrentX() {
        return svgPath.getTranslateX();
    }

    @Override
    public int getGraphicalSize() {
        return OLIGON_HORIZONTAL_SPACE;
    }

}
