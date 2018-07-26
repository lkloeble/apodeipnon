package org.orthodoxmusic.apodeipnon.Neumes;

import javafx.scene.shape.SVGPath;

public class Ison implements Neume {

    private static final int ISON_HORIZONTAL_SPACE = 60;

    private SVGPath svgPath;

    public Ison(SVGPath svgPath) {
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return ISON_HORIZONTAL_SPACE;
    }

    @Override
    public SVGPath getSvgPath() {
        return svgPath;
    }

    @Override
    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }

    @Override
    public int getLength() {
        return 150;
    }

}
