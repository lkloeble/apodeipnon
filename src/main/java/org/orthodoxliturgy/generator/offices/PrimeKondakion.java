package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.HypakoiRepository;
import org.orthodoxliturgy.generator.KondakionRepository;
import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.elementaryblocks.Kondakion;
import org.orthodoxliturgy.generator.elementaryblocks.WeekTone;

public class PrimeKondakion extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PRIMKONDAK";

    public PrimeKondakion(LiturgicalContext liturgicalContext) {
        this.liturgicalContext=liturgicalContext;
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
        StringBuilder stringBuilder = new StringBuilder();
        if(!liturgicalContext.isBigFeast() && liturgicalContext.isSunday()) {
            WeekTone weekTone = liturgicalContext.getWeekTone();
            stringBuilder.append(HypakoiRepository.getSundayHypakoiByTone(weekTone));
        } else {
            Kondakion kondakion = KondakionRepository.getPrimeKondakion(liturgicalContext);
            stringBuilder.append(kondakion.getTitle()).append("<br>");
            stringBuilder.append(kondakion.getText()).append("<br>");
        }
        return stringBuilder.toString();
    }

}
