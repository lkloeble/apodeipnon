package org.orthodoxmusic.apodeipnon.neumes;


import org.orthodoxmusic.apodeipnon.TextLinePositions;

public abstract class Neume {

    protected Neume() {

    }

    public static Neume getNeume(String neumeName) {
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
                return new Klasma();
            case "diese":
                return new Diese();
            case "2b":
                return new TwoBars();
            default:
                System.out.println("demande d'un neume inexistant " + neumeName);
                return new NullNeume();
        }
    }

    protected String name;

    protected int xStart;
    protected int xEnd;

    public Neume(String name) {
        this.name=name;
    }

    public String getNeumeName() {
        return name;
    }

    public abstract String getNeumeSVG(TextLinePositions textLinePositions, int horizontalIndice);

    public abstract int getLength();

    public int getXStart() {
        return xStart;
    }

    public int getXEnd() {
        return xStart + getLength();
    }

    public boolean isUnspoken() {
        return false;
    }
}
