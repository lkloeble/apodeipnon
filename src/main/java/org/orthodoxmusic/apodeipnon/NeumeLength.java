package org.orthodoxmusic.apodeipnon;

public class NeumeLength {

    private int xStartCoordinate;
    private int xEndCoordinate;
    private int xSpaceWithNextName;

    public NeumeLength(int xStartCoordinate, int xEndCoordinate, int xSpaceNextNeume) {
        this.xStartCoordinate = xStartCoordinate;
        this.xEndCoordinate = xEndCoordinate;
        this.xSpaceWithNextName = xSpaceNextNeume;
    }

    public int getxStartCoordinate() {
        return xStartCoordinate;
    }

    public int getxEndCoordinate() {
        return xEndCoordinate;
    }

    public int getTextCenterCoordinate() {
        return getLength()/2 + getxStartCoordinate();
    }

    public int getLength() {
        return getxEndCoordinate() - getxStartCoordinate();
    }

    public int getLengthAndSpaceForNextNeume() {
        return getLength() + xSpaceWithNextName;
    }

    @Override
    public String toString() {
        return "NeumeLength{" +
                "xStartCoordinate=" + xStartCoordinate +
                ", xEndCoordinate=" + xEndCoordinate +
                ", xSpaceWithNextName=" + xSpaceWithNextName +
                '}';
    }
}
