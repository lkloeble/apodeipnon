package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderHolyTrinity implements OfficeBlock {

    private static final String STRUCTURE = "READHOLY";

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
        content.append("<div class=\"prayer\">Très sainte Trinité, aie pitié de nous. Seigneur, purifie-nous de nos péchés. Maître, pardonne nos iniquités. Saint, visite-nous et guéris nos infirmités, à cause de ton Nom.</div>");
        content.append("<br>");
        return content.toString();
    }

}
