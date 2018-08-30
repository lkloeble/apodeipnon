package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Varea extends Neume  {

    private static final int VAREA_HORIZONTAL_SPACE = 20;

    public Varea(double currentNeumeX,double currentNeumeY) {
        super("Varea");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M 255 560 c-83 -22 -167 -72 -221 -130 -73 -80 -145 -197 -194 -314 -55 -129 -81 -229 -102 -380 -24 -185 -24 -182 -45 -187 -12 -3 -19 -12 -17 -22 5 -21 50 -18 139 9 114 34 111 27 120 241 12 286 43 474 96 571 30 55 107 129 162 158 20 10 69 26 108 35 40 10 70 22 67 26 -7 13 -50 10 -113 -7z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return VAREA_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return VAREA_HORIZONTAL_SPACE;
    }

}
