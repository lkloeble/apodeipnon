package org.orthodoxmusic.apodeipnon;

public class NeumeLength {

    private int xStartCoordinate;
    private int xEndCoordinate;

    public NeumeLength(int xStartCoordinate, int xEndCoordinate) {
        this.xStartCoordinate = xStartCoordinate;
        this.xEndCoordinate = xEndCoordinate;
    }

    public int getxStartCoordinate() {
        return xStartCoordinate;
    }

    public int getxEndCoordinate() {
        return xEndCoordinate;
    }

    public int getTextCenterCoordinate(double ratio) {
        return (int)(getLength(ratio)/2 + getxStartCoordinate()*ratio);
    }

    public int getLength(double ratio) {
        return (int)(getxEndCoordinate()*ratio - getxStartCoordinate()*ratio);
    }

    @Override
    public String toString() {
        return "NeumeLength{" +
                "xStartCoordinate=" + xStartCoordinate +
                ", xEndCoordinate=" + xEndCoordinate +
                '}';
    }
}
