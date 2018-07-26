package org.orthodoxmusic.apodeipnon;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.Neumes.Neume;

import java.sql.Timestamp;

public class UserInput {

    private Neume neume;
    private Timestamp timestamp;

    public UserInput(Neume neume) {
        this.neume = neume;
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Neume getNeume() {
        return neume;
    }

    @Override
    public String toString() {
        return "UserInput{" +
                "neume=" + neume +
                ", timestamp=" + timestamp +
                '}';
    }

    public SVGPath getSvgPath() {
        return neume.getSvgPath();
    }
}
