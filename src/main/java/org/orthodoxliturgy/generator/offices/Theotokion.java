package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.OfficeType;

public class Theotokion extends Office implements OfficeBlock {

    private static final String STRUCTURE = "THEOTOK";

    public Theotokion(LiturgicalContext liturgicalContext) {
        this.liturgicalContext = liturgicalContext;
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
        return null;
    }

    @Override
    public String getContent() {
        StringBuilder content = new StringBuilder();
        content.append("<div class=\"theotokion\">").append("Theotokion").append("</div>");
        if(liturgicalContext.getOfficeType() == OfficeType.PRIME) {
            content.append("<div class=\"prayer\">");
            content.append("Comment te nommerons-nous, Pleine de grâce? Ciel, car tu as fait resplendir le Soleil de Justice; Paradis, car tu as produit la fleur d'incorruptibilité; Vierge, car tu es demeurée sans corruption; Mère très pure, car tu as porté dans tes bras, le Fils, le Dieu de l'univers. Supplie-le de sauver nos âmes.");
            content.append("</div>");
        } else if(liturgicalContext.getOfficeType() == OfficeType.TIERCE) {
            content.append("<div class=\"prayer\">");
            content.append("Mère de Dieu, tu es la vraie vigne qui a produit le fruit de vie. Nous t'en supplions, ô notre Souveraine, intercède avec les apôtres et tous les saints, pour que nos âmes obtiennent miséricorde.");
            content.append("</div>");
        }
        return content.toString();
    }

}
