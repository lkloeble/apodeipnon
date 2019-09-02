package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class Theotokion extends Office implements OfficeBlock {

    private static final String STRUCTURE = "THEOTOK";

    public Theotokion(LiturgicalContext liturgicalContext) {

    }

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
        return null;
    }
}
