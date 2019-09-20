package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.OfficeType;
import org.orthodoxliturgy.generator.elementaryblocks.*;

public class PrimeDismissal  extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PRIMDISMIS";

    public PrimeDismissal(LiturgicalContext liturgicalContext) {
        order.addBlock(new PrimeSuperiorDismissalPrayer());
        if(!liturgicalContext.willCelebrate(OfficeType.TIERCE)) {
            order.addBlock(new ReaderPrimeKondakionDismissal());
            if(liturgicalContext.isWithoutPriest()) {
                order.addBlock(new ChoirDialogEndOffice());
                order.addBlock(new TitleActor("Le Supérieur"));
                order.addBlock(new PriestFathersBlessing());
                order.addBlock(new ChoirAmen());
            } else {
                order.addBlock(new TitleActor("Le Prêtre"));
                order.addBlock(new GloryToYou());
                order.addBlock(new TitleActor("Le Lecteur"));
                order.addBlock(new ReaderDoxology());
                order.addBlock(new ReaderKyrieEleison(3));
                order.addBlock(new ReaderCallsPriestsBlessing());
                order.addBlock(new PriestFinalPrimePrayer(liturgicalContext));
                order.addBlock(new ChoirDialogEndOffice());
                order.addBlock(new TitleActor("Le Prêtre"));
                order.addBlock(new PriestFathersBlessing());
                order.addBlock(new ChoirAmen());
            }
        }
    }

    @Override
    public String getStructure() {
        return super.getStructuralOrder();
    }

    @Override
    public String getLiturgicalStructure() {
        return super.getLiturgicalOrder();
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return super.getInnerLiturgicalOrder();
    }

    @Override
    public String getContent() {
        return super.getAllContent();
    }

}
