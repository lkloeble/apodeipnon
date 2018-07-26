package org.orthodoxmusic.apodeipnon.Neumes;

import javafx.scene.shape.SVGPath;

public interface Neume {

    int getHorizontalSpace();

    SVGPath getSvgPath();

    int getCurrentY();

    int getLength();
}
