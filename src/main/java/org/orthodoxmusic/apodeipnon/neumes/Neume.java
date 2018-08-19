package org.orthodoxmusic.apodeipnon.neumes;

import javafx.scene.shape.SVGPath;
import org.orthodoxmusic.apodeipnon.GraphicSymbol;

public abstract class Neume implements GraphicSymbol {

    protected SVGPath svgPath;
    protected String name;

    public Neume(String name) {
        this.name=name;
    }

    public String getNeumeName() {
        return name;
    }

    public SVGPath getSvgPath() {
        SVGPath newSVGPath = new SVGPath();
        newSVGPath.setContent(svgPath.getContent());
        newSVGPath.setTranslateX(svgPath.getTranslateX());
        newSVGPath.setTranslateY(svgPath.getTranslateY());
        newSVGPath.setScaleX(0.03);
        newSVGPath.setScaleY(0.03);
        return newSVGPath;
    }

    public double getCurrentY() {
        return svgPath.getTranslateY();
    }

    public double getCurrentX() {
        return svgPath.getTranslateX();
    }

    public Neume getNeumeWithShifting(double shift) {
        SVGPath newSvgPath = getSvgPath();
        System.out.println("Neume transfert de " + getCurrentX() + " à " + (getCurrentX()+shift));
        newSvgPath.setTranslateX(getCurrentX() + shift);
        Neume newNeume = getNeume(getCurrentX(), getCurrentY());
        newNeume.updateSvgPath(newSvgPath);
        return newNeume;
    }

    private Neume getNeume(double currentX, double currentY) {
        switch (getNeumeName().toLowerCase()) {
            case "ison":
                return new Ison(currentX, currentY);
            case "apostrophos":
                return new Apostrophos(currentX, currentY);
            case "oligon":
                return new Oligon(currentX, currentY);
            case "petastie":
                return new Petastie(currentX, currentY);
            case "kendimata":
                return new Kendimata(currentX, currentY);
            default:
                System.out.println("demande d'un neume inexistant " + getNeumeName());
                return null;
        }
    }

    protected void updateSvgPath(SVGPath newSvgPath) {
        this.svgPath = newSvgPath;
    }

}
