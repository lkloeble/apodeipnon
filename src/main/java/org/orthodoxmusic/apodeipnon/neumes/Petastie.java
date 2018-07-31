package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Petastie implements Neume {

    private static final int PETASTIE_HORIZONTAL_SPACE = 50;

    private SVGPath svgPath;

    public Petastie(int currentNeumeX,int currentNeumeY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M205 290 c-179 -25 -459 -154 -842 -387 -69 -42 -95 -75 -76 -94 5 -5 93 -12 196 -16 144 -5 190 -3 202 7 22 19 19 25 -25 45 -98 44 -87 101 36 184 93 61 256 142 363 178 65 22 94 26 206 27 116 1 135 -1 180 -22 96 -44 144 -114 145 -211 0 -88 -57 -161 -128 -161 -40 0 -82 -13 -82 -26 0 -22 21 -28 96 -26 76 1 174 28 232 64 46 28 81 93 88 164 12 116 -66 208 -214 255 -76 24 -272 34 -377 19z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public String getNeumeName() {
        return "Petastie";
    }

    @Override
    public int getHorizontalSpace() {
        return PETASTIE_HORIZONTAL_SPACE;
    }

    @Override
    public SVGPath getSvgPath() {
        return svgPath;
    }

    @Override
    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }
}
