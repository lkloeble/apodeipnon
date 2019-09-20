package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class InitialPrayerPriestBlessing  implements OfficeBlock {


    private static final String STRUCTURE = "INPRPRIEBLES";

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
        content.append("<br>");
        content.append("<div class=\"priest\">Le Prêtre</div>");
        content.append("<br>");
        content.append("<div class=\"prayer\">Béni soit notre Dieu en tout temps, maintenant et toujours et dans les siècles des siècles. Amen.</div>");
        content.append("<br>");
        return content.toString();
    }

    @Override
    public String toString() {
        return "InitialPrayerPriestBlessing{}";
    }

}
