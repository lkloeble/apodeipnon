package org.orthodoxmusic.apodeipnon;

import java.util.HashMap;
import java.util.Map;

public class NeumesLinePositions {

    private Map<Integer, NeumeLength> orderAndWidthMap = new HashMap<>();
    private int neumeHeight = 0;

    public void setWidthForOrder(int orderInSentence, int xSvgStartCoordinate, int xSvgEndCoordinate, int spaceWithNextNeume) {
        orderAndWidthMap.put(orderInSentence,new NeumeLength(xSvgStartCoordinate,xSvgEndCoordinate, spaceWithNextNeume));
    }

    public void setNeumeHeight(int neumeHeight) {
        this.neumeHeight = neumeHeight;
    }

    public int getXPosition(int currentPosition) {
        NeumeLength neumeLength = orderAndWidthMap.get(currentPosition);
        return neumeLength != null ? neumeLength.getTextCenterCoordinate() : 0;
    }

    public int getNeumeHeight() {
        return neumeHeight;
    }
}
