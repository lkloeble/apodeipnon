package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class ReaderOurFather implements OfficeBlock {

    private static final String STRUCTURE = "READOURFAT";

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
        content.append("<div class=\"prayer\">Notre Père qui es aux cieux, </div>");
        content.append("<div class=\"prayer\">que ton Nom soit sanctifié, </div>");
        content.append("<div class=\"prayer\">que ton règne vienne, </div>");
        content.append("<div class=\"prayer\">que ta volonté soit faite sur la terre comme au ciel.</div>");
        content.append("<div class=\"prayer\">Donne-nous aujourd'hui notre pain essentiel, </div>");
        content.append("<div class=\"prayer\">Remets-nous nos dettes comme nous les remettons nous aussi à nos débiteurs,</div>");
        content.append("<div class=\"prayer\">et ne nous laisse pas succomber à la tentation, mais délivre-nous du Malin.</div>");
        content.append("<br>");
        return content.toString();

    }

}
