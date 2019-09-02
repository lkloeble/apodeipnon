package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderKyrieEleison implements OfficeBlock {

    private static final String STRUCTURE = "READKYR";

    private int kyrieNumber;

    public ReaderKyrieEleison(int kyrieNumber) {
        this.kyrieNumber = kyrieNumber;
    }

    @Override
    public String getStructure() {
        return STRUCTURE + kyrieNumber;
    }

    @Override
    public String getLiturgicalStructure() {
        return STRUCTURE + kyrieNumber;
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return STRUCTURE + kyrieNumber;
    }


}
