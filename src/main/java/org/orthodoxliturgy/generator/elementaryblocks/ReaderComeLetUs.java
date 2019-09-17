package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderComeLetUs implements OfficeBlock {

    private static final String STRUCTURE = "READCOME";

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
        content.append("<div class=\"prayer\">Venez, adorons, prosternons-nous devant Dieu, notre Roi.</div>");
        content.append("<div class=\"prayer\">Venez, adorons, prosternons-nous devant le Christ, notre Roi et notre Dieu.</div>");
        content.append("<div class=\"prayer\">Venez, adorons, prosternons-nous devant le Christ lui-même, notre Roi et notre Dieu.</div>");
        content.append("<br>");
        return content.toString();
    }

}
