package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class SuperiorDoxology implements OfficeBlock {

    private static final String STRUCTURE = "SUPDOX";

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

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        content.append("<div class=\"superior\">Le Supérieur</div>");
        content.append("<br>");
        content.append("<div class=\"prayer\">Gloire à toi, notre Dieu, gloire à toi.</div>");
        content.append("<br>");
        return content.toString();
    }

}
