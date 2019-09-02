package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderComeLetUs implements OfficeBlock {

    private static final String STRUCTURE = "READCOME";

    @Override
    public String getStructure() {
        return STRUCTURE;
    }

    @Override
    public String getLiturgicalStructure() {
        return STRUCTURE;
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return STRUCTURE;
    }


}
