package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class PrimeVerses extends Office implements OfficeBlock {

    private static final String STRUCTURE = "VERSTSPRIM";

    public PrimeVerses(LiturgicalContext liturgicalContext) {

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
