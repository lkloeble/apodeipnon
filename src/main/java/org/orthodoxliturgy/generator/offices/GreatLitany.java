package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class GreatLitany extends Office implements OfficeBlock{

    private static final String STRUCTURE = "";

    public GreatLitany(LiturgicalContext liturgicalContext) {
    }

    @Override
    public String getStructure() {
        return STRUCTURE;
    }

    @Override
    public String getLiturgicalStructure() {
        return null;
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return null;
    }
}
