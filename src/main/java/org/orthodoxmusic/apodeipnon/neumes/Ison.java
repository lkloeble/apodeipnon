package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Ison extends Neume {

    private static final int ISON_HORIZONTAL_SPACE = 60;

    public Ison(double currentNeumeX,double currentNeumeY) {
        super("Ison");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M890 300 c-36 -13 -127 -17 -465 -23 -493 -9 -710 -29 -970 -87 -182 -40 -315 -147 -338 -270 -13 -67 29 -138 89 -149 54 -10 184 62 184 101 0 7 -19 20 -41 31 -68 30 -89 51 -89 89 0 63 90 115 235 136 48 7 246 5 654 -6 321 -9 598 -13 615 -9 55 12 104 42 161 101 83 85 68 121 -35 86z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return ISON_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return ISON_HORIZONTAL_SPACE;
    }

}
