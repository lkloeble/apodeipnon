package org.orthodoxmusic.apodeipnon;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Lines {

    private Map<Integer,Line> lineMap = new HashMap<>();

    public boolean hasLines() {
        return !lineMap.isEmpty();
    }

    public void addLineContentFromFile(List<List<String>> delimitedLists) {
        for(List<String> delimitedList : delimitedLists) {
            if(delimitedList.isEmpty()) continue;
            lineMap.put(getNextIndice(), new Line(delimitedList));
        }
        adjustTextForUnspokenNeumes();
    }

    private void adjustTextForUnspokenNeumes() {
        for(Integer indice : lineMap.keySet()) {
            Line line = lineMap.get(indice);
            line.adjustTextForUnspokenNeumes();
        }
    }

    public int getNextIndice() {
        return lineMap.size() + 1;
    }

    public Line getLine(int indice) {
        return lineMap.get(indice);
    }

    public Set<Integer> getAllLineNumbers() {
        return lineMap.keySet();
    }
}
