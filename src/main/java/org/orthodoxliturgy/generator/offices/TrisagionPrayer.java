package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.elementaryblocks.*;

public class TrisagionPrayer  extends Office implements OfficeBlock {

    private static final String STRUCTURE = "TRISAGPRAYER";

    public TrisagionPrayer(LiturgicalContext liturgicalContext) {
        buildTrisagionPrayer(liturgicalContext);
        this.liturgicalContext=liturgicalContext;
    }

    private void buildTrisagionPrayer(LiturgicalContext liturgicalContext) {
        order.addBlock(new TitleActor("Le Lecteur"));
        order.addBlock(new ReaderTrisagion());
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ReaderHolyTrinity());
        order.addBlock(new ReaderKyrieEleison(3));
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ReaderOurFather());
        order.addBlock(new PriestOurFatherResponse());
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

    @Override
    public String getContent() {
        return super.getAllContent();
    }

}
