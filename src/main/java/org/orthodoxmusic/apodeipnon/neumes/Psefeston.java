package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Psefeston  extends Neume  {

    private static final int PSEFESTON_HORIZONTAL_SPACE = 60;

    public Psefeston(double currentNeumeX,double currentNeumeY) {
        super("Psefeston");
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-30 305 c-181 -17 -368 -91 -638 -252 -211 -127 -294 -187 -291 -212 6 -41 48 -30 154 44 345 238 610 350 830 351 104 0 169 -15 261 -60 69 -34 103 -61 226 -179 79 -76 158 -146 177 -156 26 -14 64 -17 194 -18 154 -2 161 -1 161 18 0 15 -9 21 -36 25 -43 7 -65 22 -234 160 -71 58 -153 123 -181 143 -74 53 -189 105 -269 121 -91 18 -248 25 -354 15z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentNeumeX);
        svgPath.setTranslateY(currentNeumeY);
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return PSEFESTON_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return PSEFESTON_HORIZONTAL_SPACE;
    }

}
