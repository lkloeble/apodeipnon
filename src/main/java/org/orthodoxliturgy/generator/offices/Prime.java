package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.ApolitikionRepository;
import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;
import org.orthodoxliturgy.generator.elementaryblocks.*;

public class Prime extends Office implements OfficeBlock {

    private LiturgicalContext liturgicalContext;

    public Prime(LiturgicalContext context) {
        buildPrimeOffice(context);
        this.liturgicalContext = context;
    }

    private void buildPrimeOffice(LiturgicalContext context) {
        order.addBlock(new TitleOffice("Office de Prime",1));
        order.addBlock(new DateOffice(4,context.getOfficeDate()));
        order.addBlock(new InitialPrayers(context));
        order.addBlock(new TitleOffice("Psaumes de Prime",3));
        order.addBlock(new Psalm(context,5));
        order.addBlock(new Psalm(context,89));
        order.addBlock(new Psalm(context,100));
        order.addBlock(new ReaderDoxology());
        order.addBlock(new ReaderAlleluia());
        order.addBlock(new ReaderKyrieEleison(3));
        order.addBlock(new TitleActor("Le Lecteur"));
        if(context.isBigFeast() || context.withoutPrecedingOrthros()) {
            order.addBlock(new PrimeFeastPart(context));
        } else {
            order.addBlock(new ReaderGloryFather());
            order.addBlock(ApolitikionRepository.getApolitikion(liturgicalContext));
        }
        order.addBlock(new ReaderAndNow());
        order.addBlock(new Theotokion(context));
        order.addBlock(new TitleOffice("Versets de Prime",3));
        order.addBlock(new TitleActor("Le Lecteur"));
        order.addBlock(new PrimeVerses(context));
        order.addBlock(new TrisagionPrayer(context));
        order.addBlock(new TitleOffice("Kondakion de Prime",3));
        order.addBlock(new PrimeKondakion(context));
        order.addBlock(new PrimePrayer(context));
        order.addBlock(new PrimeEphremPrayer(context));
        order.addBlock(new TitleOffice("Congé",3));
        order.addBlock(new PrimeDismissal(context));
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
        return null;
    }

    @Override
    public String getContent() {
        return null;
    }

}
