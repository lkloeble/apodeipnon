package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Elaphron implements Neume {

    private static final int ELAPHRON_HORIZONTAL_SPACE = 45;

    private SVGPath svgPath;

    public Elaphron(SVGPath svgPath) {
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
    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }
}
