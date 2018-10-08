package org.orthodoxmusic.apodeipnon;

import java.util.HashMap;
import java.util.Map;

public class NeumesLinePositions {

    private double ratio;

    public NeumesLinePositions(double ratio) {

        this.ratio=ratio;
    }

    private Map<Integer, NeumeLength> orderAndWidthMap = new HashMap<>();

    public void setWidthForOrder(int orderInSentence, int xSvgStartCoordinate, int xSvgEndCoordinate) {
        orderAndWidthMap.put(orderInSentence,new NeumeLength(xSvgStartCoordinate,xSvgEndCoordinate));
    }

    public int getXPosition(int currentPosition) {
        NeumeLength neumeLength = orderAndWidthMap.get(currentPosition);
        return neumeLength != null ? neumeLength.getTextCenterCoordinate(ratio) : 0;
    }
}
