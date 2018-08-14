package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Elaphron implements Neume {

    private static final int ELAPHRON_HORIZONTAL_SPACE = 45;

    private SVGPath svgPath;

    @Override
    public String getNeumeName() {
        return "Elafron";
    }

    public Elaphron(double currentNeumeX, double currentNeumeY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-474 287 c-60 -12 -147 -49 -173 -73 -36 -33 -63 -93 -69 -152 -4 -42 -1 -63 17 -99 64 -134 241 -196 502 -176 212 16 383 84 772 305 188 107 236 145 220 172 -10 16 -29 18 -201 21 -155 2 -192 0 -202 -12 -10 -11 -4 -18 31 -38 23 -12 49 -35 57 -50 14 -25 14 -29 -5 -55 -53 -73 -341 -228 -499 -269 -44 -11 -108 -18 -175 -18 -101 -1 -108 0 -175 34 -86 43 -125 93 -133 169 -6 69 4 112 36 149 23 27 38 35 97 45 48 9 71 18 73 29 5 27 -82 36 -173 18z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return ELAPHRON_HORIZONTAL_SPACE;
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
        return svgPath.getTranslateX() + ELAPHRON_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return (int)(svgPath.getBoundsInLocal().getWidth()*getSvgPath().getScaleX()) + ELAPHRON_HORIZONTAL_SPACE;
    }

}
