package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.OfficeType;
import org.orthodoxliturgy.generator.elementaryblocks.PrimeSuperiorDismissalPrayer;
import org.orthodoxliturgy.generator.elementaryblocks.ReaderPrimeKondakionDismissal;
import org.orthodoxliturgy.generator.elementaryblocks.TitleActor;

public class PrimeDismissal  extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PRIMDISMIS";

    public PrimeDismissal(LiturgicalContext liturgicalContext) {
        order.addBlock(new PrimeSuperiorDismissalPrayer());
        if(!liturgicalContext.willCelebrate(OfficeType.TIERCE)) {
            order.addBlock(new ReaderPrimeKondakionDismissal());
            order.addBlock(new TitleActor("Le Prêtre"));
        }
    }

    @Override
    public String getLiturgicalStructure() {
        return STRUCTURE;
    }

    @Override
    public String getStructure() {
        return STRUCTURE;
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return null;
    }

    @Override
    public String getContent() {
        return null;
    }

}
