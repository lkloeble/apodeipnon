package org.orthodoxmusic.apodeipnon;

import javafx.scene.shape.SVGPath;

public interface GraphicSymbol {

    int getHorizontalSpace();

    SVGPath getSvgPath();

    double getCurrentY();

    double getCurrentX();

    int getGraphicalSize();
}
