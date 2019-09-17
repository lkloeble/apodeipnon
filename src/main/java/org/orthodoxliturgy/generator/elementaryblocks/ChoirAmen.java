package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ChoirAmen  implements OfficeBlock {

    private static final String STRUCTURE = "CHAM";

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
        content.append("<div class=\"choir\">Le Choeur</div>");
        content.append("<br>");
        content.append("<div class=\"prayer\">Amen.</div>");
        content.append("<br>");
        return content.toString();
    }

}
