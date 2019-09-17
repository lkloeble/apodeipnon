package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class SuperiorHeavenlyKing implements OfficeBlock {

    private static final String STRUCTURE = "SUPHEAKIN";

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
        content.append("<div class=\"prayer\">Roi céleste, Paraclet, Esprit de vérité, partout présent et remplissant tout, Trésor de tous biens et Dispensateur de vie, viens et demeure en nous, purifie-nous de toute souillure et sauve nos âmes, toi qui es bon.</div>");
        content.append("<br>");
        return content.toString();
    }
}
