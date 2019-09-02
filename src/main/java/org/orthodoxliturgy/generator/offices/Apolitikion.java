package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class Apolitikion extends Office implements OfficeBlock {

    private static final String STRUCTURE = "APOLITIK";
    private LiturgicalContext liturgicalContext;

    public Apolitikion(LiturgicalContext liturgicalContext) {
        this.liturgicalContext=liturgicalContext;
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
