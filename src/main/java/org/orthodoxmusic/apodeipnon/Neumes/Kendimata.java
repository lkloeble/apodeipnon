package org.orthodoxmusic.apodeipnon.Neumes;

import javafx.scene.shape.SVGPath;

public class Kendimata implements Neume {

    private static final int KENDIMATA_HORIZONTAL_SPACE = 25;

    private SVGPath svgPath;

    public Kendimata(SVGPath svgPath) {
        this.svgPath = svgPath;
    }

    @Override
    public int getHorizontalSpace() {
        return KENDIMATA_HORIZONTAL_SPACE;
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
        return 50;
    }
}
