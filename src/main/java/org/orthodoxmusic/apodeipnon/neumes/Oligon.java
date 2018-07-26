package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Oligon implements Neume {

    private static final int OLIGON_HORIZONTAL_SPACE = 60;

    private SVGPath svgPath;

    public Oligon(SVGPath svgPath) {
        this.svgPath = svgPath;
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
    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }
}
