package org.orthodoxliturgy.generator.elementaryblocks;

import org.orthodoxliturgy.generator.offices.OfficeBlock;

public class InitialPrayerPeopleBlessing implements OfficeBlock {

    private static final String STRUCTURE = "INPRPEOBLE";

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
        return STRUCTURE;
    }

    @Override
    public String getContent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Par les prières de nos saints pères, Seigneur Jésus-Christ notre Dieu, aie pitié de nous !<br>");
        stringBuilder.append("Amen.<br>");
        return stringBuilder.toString();
    }

}
