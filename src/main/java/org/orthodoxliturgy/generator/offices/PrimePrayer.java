package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.elementaryblocks.*;

public class PrimePrayer extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PRIMPRAYER";

    public PrimePrayer(LiturgicalContext liturgicalContext) {
        order.addBlock(new ReaderKyrieEleison(40));
        order.addBlock(new PrimePrayerMainPrayer());
        order.addBlock(new ReaderKyrieEleison(3));
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ItIsTrulyMeet());
        if (liturgicalContext.isWithoutPriest()) {
            order.addBlock(new InitialPrayerPeopleBlessing());
        } else {
            order.addBlock(new ReaderRequestsBlessing());
            order.addBlock(new TitleActor("Le Prêtre"));
            order.addBlock(new PriestPrimePrayerBlessing());
            order.addBlock(new TitleActor("Le Lecteur"));
        }
        order.addBlock(new ReaderAmen());
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
