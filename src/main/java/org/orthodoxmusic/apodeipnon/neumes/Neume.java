package org.orthodoxmusic.apodeipnon.neumes;


import org.orthodoxmusic.apodeipnon.TextLinePositions;

public abstract class Neume {

    protected Neume() {

    }

    public static Neume getMartyrie(String note, String diatonique) {
        return new Martyrie(new Note(note), new Diatonique(diatonique));
    }

    public static Neume getNeume(String neumeName, Neume previousNeume) {
        switch (neumeName.toLowerCase()) {
            case "ison":
                return new Ison();
            case "apostrophos":
                return new Apostrophos();
            case "oligon":
                return new Oligon();
            case "petastie":
                return new Petastie();
            case "andikenoma":
                return new Andikenoma(previousNeume);
            case "elaphron":
                return new Elaphron();
            case "kendimata":
                return new Kendimata();
            case "bareia":
                return new Bareia();
            case "pause1":
                return new Pause1();
            case "psefeston":
                return new Psefeston();
            case "omalon":
                return new Omalon();
            case "respiration":
                return new Respiration();
            case "stavros":
                return new Stavros();
            case "klasma":
                return new Klasma(previousNeume);
            case "diplie":
                return new Diplie(previousNeume);
            case "startklasma":
                return new StartKlasma(previousNeume);
            case "diese":
                return new Diese(previousNeume);
            case "dies4":
                return new Diese4(previousNeume);
            case "gorgon":
                return new Gorgon(previousNeume);
            case "startgorgon":
                return new StartGorgon(previousNeume);
            case "2b":
                return new TwoBars();
            case "markni":
                return new MarkNi();
            case "oligon+2":
                return new AscendingTwoOligon();
            case "oligon+3":
                return new TriAscendingOligon();
            case "oligon+4":
                return new TetraAscendingOligon();
            case "oligon+6":
                return new HexaAscendingOligon();
            case "oligon+kendimata":
                return new OligonAndKendimata();
            case "oligon+2+kendimata":
                return new AscendingTwoOligonAndKendimata();
            case "kendimata+oligon":
                return new KendimataAndOligon();
            case "oligon+apostrophos":
                return new OligonAndApostrophos();
            case "bemol":
                return new Bemol();
            case "phtoradiatdur7":
                return new PhtoraDiatoniqueDur7();
            case "+2oligon":
                return new AscendingOligonBeforeDown();
            case "elaphron+3":
                return new TriAscendingElaphron();
            case "petastie+1":
                return new DiAscendingPetastie();
            case "petastie+ison":
                return new PetastieAndIson();
            case "petastie+apostrophos":
                return new PetastieAndApostrophos();
            case "petastie+3":
                return new TriAscendingPetastie();
            case "petastie+4":
                return new TetraAscendingPetastie();
            case "petastie+5":
                return new PentaAscendingPetastie();
            case "petastie+6":
                return new HexaAscendingPetastie();
            case "apostrophos+elaphron":
                return new ApostrosAndElaphron();
            case "apostrophos->elaphron":
                return new ApostrophosWithElaphron();
            case "petastie+oligon":
                return new PetastieAndOligon();
            case "hyporroie":
                return new Hyporroie();
            case "oligon+apostrophos+kendimata":
                return new OligonAndApostrophosAndKendimata();
            case "oligon+ison+kendimata":
                return new OligonAndIsonAndKendimata();
            default:
                System.out.println("demande d'un neume inexistant " + neumeName);
                return new NullNeume();
        }
    }

    protected String name;

    protected int xStart;
    protected int xEnd;
    protected int xSpaceBetweenNeume;
    protected int lengthCorrection;
    protected int height;

    public Neume(String name) {
        this.name=name;
    }

    public String getNeumeName() {
        return name;
    }

    public abstract String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeightForNeumes);

    public int getLength() {
        return xEnd - xStart + lengthCorrection;
    }

    public int getXStart() {
        return xStart;
    }

    public int getXSpace() {
        return xSpaceBetweenNeume ;
    }

    public int getXEnd() {
        return xStart + getLength();
    }

    public int getHeight() {
        return height;
    }

    public boolean isUnspoken() {
        return false;
    }

    public int getLengthWithWordSpaceCorrection() {
        return getLength() + lengthCorrection;
    }

    public int getKlasmaCorrection() {
        return getLength()/2;
    }

    public int getDiplieCorrection() {
        return getLength()/2;
    }

    public boolean hasName(String name) {
        return this.toString().equals(name);
    }

    public int getGorgonCorrection() {
        return getLength()/2;
    }

    public int getAndikenomaCorrection() {
        return getLength()/2;
    }

    public int getUnderGorgonCorrection() {
        return getLength()/2;
    }

    public int getHeightCorrection() {
        return 0;
    }

    public int getDieseCorrection() {
        return 0;
    }
}
