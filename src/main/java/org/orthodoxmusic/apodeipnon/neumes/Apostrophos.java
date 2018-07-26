package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;

public class Apostrophos implements Neume {

    private static final int APOSTROPHOS_HORIZONTAL_SPACE = 35;

    private SVGPath svgPath;

    public Apostrophos(SVGPath svgPath) {
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return APOSTROPHOS_HORIZONTAL_SPACE;
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
