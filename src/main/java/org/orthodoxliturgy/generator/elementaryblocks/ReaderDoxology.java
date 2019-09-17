package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderDoxology implements OfficeBlock {

    private static final String STRUCTURE = "READDOX";

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
        content.append("<div class=\"prayer\">Gloire au Père et au Fils et au Saint-Esprit, maintenant et toujours et dans les siècles des siècles. Amen.</div>");
        content.append("<br>");
        return content.toString();
    }

}
