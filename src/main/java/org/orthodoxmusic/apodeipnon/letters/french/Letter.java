package org.orthodoxmusic.apodeipnon.letters.french;

import org.orthodoxmusic.apodeipnon.GraphicSymbol;

import java.util.Objects;

public abstract class Letter implements GraphicSymbol {

    /*
    public Letter(String letterName) {
        this.name = letterName;
    }

    protected String name;
    //protected SVGPath svgPath;

    /*
    public SVGPath getSvgPath() {
        SVGPath newSVGPath = new SVGPath();
        newSVGPath.setContent(svgPath.getContent());
        newSVGPath.setTranslateX(svgPath.getTranslateX());
        newSVGPath.setTranslateY(svgPath.getTranslateY());
        newSVGPath.setScaleX(0.03);
        newSVGPath.setScaleY(0.03);
        return newSVGPath;
    }

    public String getLetterName() {
        return name;
    }

    public double getCurrentY() {
        return svgPath.getTranslateY();
    }

    public double getCurrentX() {
        return svgPath.getTranslateX();
    }

    abstract public int getGraphicalSize();

    public Letter getLetterWithShifting(double shift) {
        SVGPath newSvgPath = getSvgPath();
        newSvgPath.setTranslateX(getCurrentX() + shift);
        Letter newLetter = getLetter(getCurrentX(),getCurrentY());
        newLetter.updateSvgPath(newSvgPath);
        return newLetter;
    }

    private Letter getLetter(double currentX, double currentY) {
        switch(getLetterName()) {
            case "A":
                return new LetterA(currentX,currentY);
            case "L":
                return new LetterL(currentX,currentY);
            case "E":
                return new LetterE(currentX,currentY);
            case "I":
                return new LetterI(currentX,currentY);
            case "U":
                return new LetterU(currentX,currentY);
            case "_":
                return new Underscore(currentX,currentY);
                default:
                    return null;
        }
    }

    protected void updateSvgPath(SVGPath newSvgPath) {
        this.svgPath = newSvgPath;
    }
    */

    /*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Letter letter = (Letter) o;
        return Objects.equals(name, letter.name) &&
                Objects.equals(svgPath, letter.svgPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, svgPath);
    }

    @Override
    public String toString() {
        return "Letter{" +
                "name='" + name + '\'' +
                ", currentX=" + getCurrentX() +
                ", graphicalSize=" + (getCurrentX() + getGraphicalSize()) +
                '}';
    }
    */
}
