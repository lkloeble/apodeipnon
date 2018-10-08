package org.orthodoxmusic.apodeipnon;

public class SVGProducer {

    public SVGPartition produceSvg(Partition partition) {
        SVGPartition svgPartition = new SVGPartition();
        Lines partitionLines = partition.getPartitionLines();
        for(Integer lineNumber : partitionLines.getAllLineNumbers()) {
            Line currentLine = partitionLines.getLine(lineNumber);
            TextualSymbols textualSymbols = currentLine.getTextualSymbols();
            NeumeVerticalBlocks neumeVerticalBlocks = currentLine.getNeumeVerticalBlocks();
            svgPartition.addNewLine();
            svgPartition.addNeumes(neumeVerticalBlocks, textualSymbols.getPositions());
            svgPartition.addText(textualSymbols, neumeVerticalBlocks.getPositions());
        }
        svgPartition.endFile();
        return svgPartition;
    }
}
