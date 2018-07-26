package org.orthodoxmusic.apodeipnon.Neumes;

import javafx.scene.shape.SVGPath;

public class Petastie implements Neume {

    private static final int PETASTIE_HORIZONTAL_SPACE = 50;

    private SVGPath svgPath;

    public Petastie(SVGPath svgPath) {
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return PETASTIE_HORIZONTAL_SPACE;
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
        return 120;
    }

}
