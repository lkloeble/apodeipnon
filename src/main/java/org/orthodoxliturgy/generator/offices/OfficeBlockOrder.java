package org.orthodoxliturgy.generator.offices;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfficeBlockOrder {

    private Map<Integer, OfficeBlock> allBlocksMap = new HashMap<>();

    public void addBlock(OfficeBlock officeBlock) {
        allBlocksMap.put(getMaxIndice(),officeBlock);
    }

    private Integer getMaxIndice() {
        return allBlocksMap.size() == 0 ? 0 : allBlocksMap.size()+1;
    }

    public Set<Integer> getIndices() {
        return allBlocksMap.keySet();
    }

    public OfficeBlock getBlockByPosition(Integer indice) {
        return allBlocksMap.get(indice);
    }

    public boolean isLastIndice(Integer indice) {
        return indice >= getHigestIndice();
    }

    private Integer getHigestIndice() {
        Integer highest = -1;
        for(Integer currentIndice : allBlocksMap.keySet()) {
            if(currentIndice > highest) highest = currentIndice;
        }
        return highest;
    }
}
