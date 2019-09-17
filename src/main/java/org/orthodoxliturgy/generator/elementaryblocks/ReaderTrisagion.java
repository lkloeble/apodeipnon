package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderTrisagion implements OfficeBlock {

    private static final String STRUCTURE = "READTRIS";

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
        content.append("<div class=\"prayer\">Saint Dieu, Saint Fort, Saint Immortel, aie pitié de nous. (3 fois)</div>");
        content.append("<br>");
        return content.toString();
    }

}
