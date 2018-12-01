package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class SVGPartition {

    private String title;
    private String toneLabel;
    private String tone;

    StringJoiner stringJoiner = new StringJoiner("");

    public SVGPartition(String title, String toneLabel) {
        this.title = title;
        this.toneLabel = toneLabel;
        addTitle();
    }

    private void addTitle() {
        stringJoiner.add("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<center><h1>" + title + " - " + toneLabel  + "</h1></center>\n");
    }

    public void addNewLine() {
        stringJoiner.add("<br><br>\n");
        stringJoiner.add("<svg version=\"1.0\" height=\"150\" width=\"1500\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid meet\" transform=\"scale(0.8)\">\n");

    }

    public void addNeumes(NeumeVerticalBlocks neumeVerticalBlocks, TextLinePositions textLinePositions) {
        stringJoiner.add(neumeVerticalBlocks.getAllSvgData(textLinePositions));
    }

    public void addText(TextualSymbols textualSymbols, NeumesLinePositions neumesLinePositions) {
        stringJoiner.add(textualSymbols.getSvgData(neumesLinePositions));
        stringJoiner.add("</svg>\n");
    }

    public void endFile() {
        stringJoiner.add("\n</body>\n</html>");

    }

    public String getStringJoiner() {
        return stringJoiner.toString();
    }

}
