package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Klasma extends Neume  {

    private static final int KLASMA_HORIZONTAL_SPACE = 15;

    public Klasma(double currentNeumeX,double currentNeumeY) {
        super("Klasma");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-15 143 c-135 -48 -288 -143 -288 -178 0 -37 30 -31 113 24 122 82 143 91 229 96 72 4 78 3 103 -22 22 -22 26 -33 20 -54 -4 -15 -7 -40 -8 -57 -2 -29 0 -30 35 -28 74 4 158 67 158 118 0 31 -40 87 -75 105 -19 9 -66 16 -125 18 -80 2 -106 -1 -162 -22z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return KLASMA_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return KLASMA_HORIZONTAL_SPACE;
    }

}
