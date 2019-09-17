package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class PrimeFeastPart extends Office implements OfficeBlock {

    private static final String STRUCTURE = "GRCARPRIM";

    public PrimeFeastPart(LiturgicalContext liturgicalContext) {
        this.liturgicalContext = liturgicalContext;
    }

    @Override
    public String getStructure() {
        return STRUCTURE;
    }

    @Override
    public String getLiturgicalStructure() {
        if (liturgicalContext.isBigFeast()) {
            return STRUCTURE;
        }
        return "";
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return null;
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        content.append("<div class=\"prayer\">Au matin tu exauceras ma voix, ô mon Roi et mon Dieu</div>");
        content.append("<div class=\"verse\">verset : prête l'oreille à mes paroles, Seigneur, comprends mon cri</div>");
        content.append("<div class=\"prayer\">Au matin tu exauceras ma voix, ô mon Roi et mon Dieu</div>");
        content.append("<div class=\"verse\">verset : car c'est vers toi que je prie, Seigneur.</div>");
        content.append("<div class=\"prayer\">Au matin tu exauceras ma voix, ô mon Roi et mon Dieu</div>");
        content.append("<div class=\"verse\">Gloire au Père et au Fils et au Saint-Esprit</div>");
        content.append("<div class=\"prayer\">Au matin tu exauceras ma voix, ô mon Roi et mon Dieu</div>");
        content.append("<br>");
        return content.toString();
    }
}
