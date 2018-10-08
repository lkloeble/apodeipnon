package org.orthodoxmusic.apodeipnon;

import org.orthodoxmusic.apodeipnon.neumes.Neume;

import java.util.List;
import java.util.Set;
import java.util.StringJoiner;

public class SVGPartition {

    StringJoiner stringJoiner = new StringJoiner("");

    public SVGPartition() {
        addTitle();
    }

    private void addTitle() {
        stringJoiner.add("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<h1>SVG tests</h1>");
    }

    public void addNewLine() {
        stringJoiner.add("<br><br>");
    }

    public void addNeumes(NeumeVerticalBlocks neumeVerticalBlocks, TextLinePositions textLinePositions) {
        stringJoiner.add("<table border=\"0\">\n" +
                "<tr>\n" +
                "<td>\n<svg version=\"1.0\" height=\"70\" width=\"1000\" xmlns=\"http://www.w3.org/2000/svg\" preserveAspectRatio=\"xMidYMid meet\">\n");
        stringJoiner.add("<g transform=\"translate(0.000000,45.000000) scale(0.030000,-0.030000)\" fill=\"#000000\" stroke=\"none\">\n");
        stringJoiner.add(neumeVerticalBlocks.getAllSvgData(textLinePositions));
        stringJoiner.add("</g>");
        stringJoiner.add("</svg>\n" +
                "</tr>\n");
    }

    public void addText(TextualSymbols textualSymbols, NeumesLinePositions neumesLinePositions) {
        stringJoiner.add("<tr>\n" +
                "<td>\n");
        stringJoiner.add(textualSymbols.getSvgData(neumesLinePositions));
        stringJoiner.add("</td></tr>\n" +
                "</table>\n");
    }

    public void endFile() {
        stringJoiner.add("\n</body>\n</html>");

    }

    public String getStringJoiner() {
        return stringJoiner.toString();
    }

}
