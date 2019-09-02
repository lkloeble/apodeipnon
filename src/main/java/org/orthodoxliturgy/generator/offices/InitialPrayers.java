package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.InitialPrayerPriestBlessing;
import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.elementaryblocks.*;

public class InitialPrayers extends Office implements OfficeBlock {

    private static final String STRUCTURE = "INIPRY";

    public InitialPrayers(LiturgicalContext context) {
        if(context.isWithoutPriest()) {
            order.addBlock(new InitialPrayerPeopleBlessing());
        } else {
            order.addBlock(new InitialPrayerPriestBlessing());
        }
        order.addBlock(new ChoirAmen());
        order.addBlock(new SuperiorDoxology());
        order.addBlock(new SuperiorHeavenlyKing());
        order.addBlock(new ReaderTrisagion());
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ReaderHolyTrinity());
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ReaderOurFather());
        order.addBlock(new ReaderKyrieEleison(12));
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ReaderComeLetUs());
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
        return super.getInnerLiturgicalOrder();
    }
}
