package org.orthodoxmusic.apodeipnon;

import java.util.*;

public class Lines {

    private List<String> acceptedMetadata = Arrays.asList(new String[]{"title","tonelabel","tone"});
    private Map<String,String> metadata = new HashMap<>();
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

    public void addMetadata(String key, String value) {
        if(!acceptedMetadata.contains(key.toLowerCase())) return;
        metadata.put(key.toLowerCase(),value.toLowerCase());
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

    public Map<String,String> getMetadata() {
        return metadata;
    }
}
