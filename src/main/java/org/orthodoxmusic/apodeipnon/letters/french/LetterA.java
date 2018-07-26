package org.orthodoxmusic.apodeipnon.letters.french;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public class LetterA implements GraphicSymbol {

    private static final int A_HORIZONTAL_SPACE = 12;

    private SVGPath svgPath;

    public LetterA(SVGPath svgPath) {
        this.svgPath = svgPath;
    }

    public int getHorizontalSpace() {
        return A_HORIZONTAL_SPACE;
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    public int getCurrentY() {
        return (int) svgPath.getTranslateY();
    }


}
