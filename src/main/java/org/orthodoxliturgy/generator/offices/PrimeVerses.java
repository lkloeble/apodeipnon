package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.OfficeType;

public class PrimeVerses extends Office implements OfficeBlock {

    private static final String STRUCTURE = "VERSTSPRIM";

    public PrimeVerses(LiturgicalContext liturgicalContext) {
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
        content.append("<div class=\"defaulttitle\">").append("Versets de Prime").append("</div>");
        String numberOfTimePrecision = "";
        if (liturgicalContext.isBigFeast()) {
            numberOfTimePrecision = " (2 fois)";
        }
        content.append("<div class=\"prayer\">");
        if(liturgicalContext.isBigFeastFourthWeek()) {
            content.append("Devant ta Croix nous nous prosternons, Ô Maître, et nous glorifions ta sainte Résurrection<br>");
        } else {
            content.append("Conduis mes pas selon ta parole, et qu'aucune iniquité ne domine sur moi.").append(numberOfTimePrecision).append("<br>");
            content.append("Rachète-moi des calomnies des hommes, et je garderai tes commandements.").append(numberOfTimePrecision).append("<br>");
            content.append("Fais resplendir ta Face sur ton serviteur, et apprends-moi tes jugements.").append(numberOfTimePrecision).append("<br>");
            content.append("Que ma bouche soit remplie de louanges, pour que je chante ta gloire, tout le jour ta magnificence!").append(numberOfTimePrecision).append("<br>");
        }
        content.append("</div>");
        return content.toString();
    }

}
