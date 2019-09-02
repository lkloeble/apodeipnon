package org.orthodoxliturgy.generator;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class InitialPrayerPriestBlessing implements OfficeBlock {

    private static final String STRUCTURE = "INPRPRIEBLES";

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
