package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.elementaryblocks.*;

public class PrimeEphremPrayer extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PRIMEPHREMPRAY";

    public PrimeEphremPrayer(LiturgicalContext liturgicalContext) {
        this.liturgicalContext=liturgicalContext;
        if(liturgicalContext.isBigFeast()) {
            order.addBlock(new EphremPrayer());
            order.addBlock(new ReaderTrisagion());
            order.addBlock(new ReaderTrisagion());
            order.addBlock(new ReaderDoxology());
            order.addBlock(new ReaderHolyTrinity());
            order.addBlock(new ReaderKyrieEleison(3));
            order.addBlock(new ReaderDoxology());
            order.addBlock(new ReaderOurFather());
            order.addBlock(new PriestOurFatherResponse());
            order.addBlock(new TitleActor("Le lecteur"));
            order.addBlock(new ReaderDoxology());
            order.addBlock(new ReaderKyrieEleison(12));
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
