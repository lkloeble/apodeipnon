package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class GreatLitany extends Office implements OfficeBlock {

    private static final String STRUCTURE = "";
    private LiturgicalContext liturgicalContext;

    public GreatLitany(LiturgicalContext liturgicalContext) {
        this.liturgicalContext = liturgicalContext;
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

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        content.append(liturgicalContext.getOmophoreText());
        content.append("l'ordre vénérable");
        return content.toString();
    }

}
