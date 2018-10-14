package org.orthodoxmusic.apodeipnon.neumes;


import org.orthodoxmusic.apodeipnon.TextLinePositions;

public abstract class Neume {

    protected Neume() {

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
            case "elaphron":
                return new Elaphron();
            case "kendimata":
                return new Kendimata();
            case "varea":
                return new Varea();
            case "psefeston":
                return new Psefeston();
            case "klasma":
                return new Klasma(previousNeume);
            case "diese":
                return new Diese();
            case "2b":
                return new TwoBars();
            case "markni":
                return new MarkNi();
            case "1c":
                return new Croche();
            case "oligon+4":
                return new TetraAscendingOligon();
            case "oligon+kendimata":
                return new OligonAndKendimata();
            case "oligon+apostrophos":
                return new OligonAndApostrophos();
            case "bemol":
                return new Bemol();
            case "+2oligon":
                return new AscendingOligonBeforeDown();
            case "elaphron+3":
                return new TriAscendingElaphron();
            case "petastie+1":
                return new DiAscendingPetastie();
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

    public boolean hasName(String name) {
        return this.toString().equals(name);
    }
}
