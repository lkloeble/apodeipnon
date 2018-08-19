package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Apostrophos extends Neume {

    private static final int APOSTROPHOS_HORIZONTAL_SPACE = 35;

    public Apostrophos(double currentNeumeX,double currentNeumeY) {
        super("Apostrophos");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M89 269 c-19 -12 -6 -28 29 -36 39 -9 96 -74 110 -126 37 -138 -150 -238 -495 -266 -79 -6 -100 -11 -100 -23 0 -24 184 -18 317 9 309 63 478 174 478 314 0 43 -4 54 -34 81 -18 18 -51 37 -73 44 -46 14 -211 16 -232 3z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return APOSTROPHOS_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return APOSTROPHOS_HORIZONTAL_SPACE;
    }

}
