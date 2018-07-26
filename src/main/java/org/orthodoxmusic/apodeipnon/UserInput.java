package org.orthodoxmusic.apodeipnon;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.sql.Timestamp;

public class UserInput {

    private GraphicSymbol graphicSymbol;
    private Timestamp timestamp;

    public UserInput(GraphicSymbol graphicSymbol) {
        this.graphicSymbol = graphicSymbol;
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "graphicSymbol=" + graphicSymbol +
                ", timestamp=" + timestamp +
                '}';
    }

    public GraphicSymbol getGraphicSymbol() {
        return graphicSymbol;
    }

    public SVGPath getSvgPath() {
        return graphicSymbol.getSvgPath();
    }

    public int getCurrentY() {
        return getGraphicSymbol().getCurrentY();
    }

    public int getHorizontalSpace() {
        return getGraphicSymbol().getHorizontalSpace();
    }
}
