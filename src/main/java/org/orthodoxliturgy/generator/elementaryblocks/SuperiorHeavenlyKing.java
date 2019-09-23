package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class SuperiorHeavenlyKing implements OfficeBlock {

    private static final String STRUCTURE = "SUPHEAKIN";
    private LiturgicalContext context;

    public SuperiorHeavenlyKing(LiturgicalContext context) {
        this.context = context;
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
        return STRUCTURE;
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        if(context.isFromEasterToPentecost()) {
            content.append("<div class=\"prayer\">Le Christ est ressuscité des morts, par sa mort il a terrassé la mort et à ceux qui gisaient aux tombeaux, il a fait le don de la vie.</div>");
        } else {
            content.append("<div class=\"prayer\">Roi céleste, Paraclet, Esprit de vérité, partout présent et remplissant tout, Trésor de tous biens et Dispensateur de vie, viens et demeure en nous, purifie-nous de toute souillure et sauve nos âmes, toi qui es bon.</div>");
        }
        content.append("<br>");
        return content.toString();
    }
}
