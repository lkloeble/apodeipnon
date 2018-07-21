package org.orthodoxmusic.apodeipnon;

import javafx.scene.shape.SVGPath;

import java.sql.Timestamp;

public class UserInput {

    private SVGPath svgPath;
    private Timestamp timestamp;

    public UserInput(SVGPath svgPath) {
        this.svgPath = svgPath;
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    public SVGPath getSvgPath() {
        return svgPath;
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "svgPath=" + svgPath +
                ", timestamp=" + timestamp +
                '}';
    }
}
