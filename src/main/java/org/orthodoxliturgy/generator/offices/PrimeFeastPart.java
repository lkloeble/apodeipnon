package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class PrimeFeastPart  extends Office implements OfficeBlock {

    private static final String STRUCTURE = "GRCARPRIM";

    public PrimeFeastPart(LiturgicalContext liturgicalContext) {
        this.liturgicalContext=liturgicalContext;
    }

    @Override
    public String getStructure() {
        return STRUCTURE;
    }

    @Override
    public String getLiturgicalStructure() {
        if(liturgicalContext.isBigFeast()) {
            return STRUCTURE;
        }
        return "";
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return null;
    }
}
