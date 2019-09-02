package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class Psalm extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PS";

    private int psalmNumber;

    public Psalm(LiturgicalContext context, int psalmNumber) {
        this.psalmNumber = psalmNumber;
    }

    @Override
    public String getStructure() {
        return STRUCTURE + psalmNumber;
    }

    @Override
    public String getLiturgicalStructure() {
        return STRUCTURE + psalmNumber;
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return null;
    }
}
