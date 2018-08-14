package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;
import sun.nio.cs.ext.ISCII91;

public class Kendimata implements Neume {

    private static final int KENDIMATA_HORIZONTAL_SPACE = 25;

    private SVGPath svgPath;

    public Kendimata(double currentNeumeX, double currentNeumeY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-148 212 c-45 -6 -66 -37 -108 -163 -29 -87 -43 -115 -67 -134 -44 -34 -29 -46 55 -45 127 2 127 2 165 99 47 124 83 198 99 204 7 3 13 12 13 19 0 22 -69 31 -157 20z M250 212 c-47 -7 -60 -26 -105 -153 -33 -94 -48 -125 -72 -144 -50 -39 -30 -49 80 -44 107 6 109 8 138 87 43 116 79 195 96 210 10 8 18 21 18 27 0 19 -79 28 -155 17z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        svgPath.setId("kendimata");
        this.svgPath = svgPath;
    }

    @Override
    public String getNeumeName() {
        return "Kendimata";
    }

    @Override
    public int getHorizontalSpace() {
        return KENDIMATA_HORIZONTAL_SPACE;
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
        return svgPath.getTranslateX() + KENDIMATA_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return (int)(svgPath.getBoundsInLocal().getWidth()*getSvgPath().getScaleX()) + KENDIMATA_HORIZONTAL_SPACE;
    }

}
