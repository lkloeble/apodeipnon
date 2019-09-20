package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.OfficeType;

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

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        content.append("<div class=\"apolitikion\">").append("Apolitikion").append("</div>");
        content.append("<div class=\"prayer\">texte de l'apolitikion</div>");
        return content.toString();
    }

}
