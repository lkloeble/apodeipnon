package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class Underscore implements GraphicSymbol {

    private static final int UNDERSCORE_HORIZONTAL_SPACE = 20;

    private SVGPath svgPath;

    public Underscore(SVGPath svgPath) {
        this.svgPath = svgPath;
    }

    public int getHorizontalSpace() {
        return UNDERSCORE_HORIZONTAL_SPACE;
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }

}
