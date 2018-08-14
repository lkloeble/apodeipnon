package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class LetterA implements Letter {

    private static final int A_HORIZONTAL_SPACE = 12;
    private double x,y;

    private SVGPath svgPath;

    public LetterA(double currentLetterX,double currentLetterY) {
        SVGPath svgPath = new SVGPath();
        svgPath.setContent("M-110 250 c-34 -19 -53 -64 -44 -107 16 -70 51 -94 173 -118 57 -12 62 -15 62 -39 -1 -85 -140 -114 -170 -35 -14 35 -30 29 -30 -11 0 -33 4 -38 43 -55 50 -23 127 -26 167 -5 54 28 60 47 60 195 0 140 5 160 42 160 10 0 18 5 18 10 0 6 -28 10 -64 10 l-65 0 -3 -31 -3 -31 -45 36 c-50 39 -95 46 -141 21z m161 -65 c28 -20 30 -26 30 -85 l0 -63 -42 9 c-99 21 -118 39 -118 108 0 27 6 43 18 51 24 15 76 5 112 -20z");
        svgPath.setScaleX(0.03);
        svgPath.setScaleY(0.03);
        svgPath.setTranslateX(currentLetterX);
        svgPath.setTranslateY(currentLetterY);
        svgPath.setId("letter A");
        this.svgPath = svgPath;
        this.x = currentLetterX;
        this.y = currentLetterY;
    }

    @Override
    public String getLetterName() {
        return "A";
    }

    public int getHorizontalSpace() {
        return A_HORIZONTAL_SPACE;
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    public double getCurrentY() {
        return svgPath.getTranslateY();
    }

    public double getCurrentX() {
        return svgPath.getTranslateX() + A_HORIZONTAL_SPACE;
    }

    @Override
    public int getGraphicalSize() {
        return (int)(svgPath.getBoundsInLocal().getWidth()*getSvgPath().getScaleX()) + A_HORIZONTAL_SPACE;
    }

    @Override
    public String toString() {
        return "LetterA{" +
                " getBoundsInLocal=" + svgPath.getBoundsInLocal() +
                '}';
    }
}
