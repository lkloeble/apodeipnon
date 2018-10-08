package org.orthodoxmusic.apodeipnon;

import java.util.List;
import java.util.Set;

public class Line {

    private TextualSymbols textualSymbols = new TextualSymbols();
    private NeumeVerticalBlocks neumeVerticalBlocks = new NeumeVerticalBlocks();

    public Line(List<String> contentList) {
        InputType inputType = InputType.UNKNOWN;
        InputType formerType = inputType;
        for(String content : contentList) {
            inputType = tryNewInputType(content);
            formerType = getOnlyTextOrNeume(formerType,inputType);
            switch (formerType) {
                case TEXT:
                    addTextualContent(content);
                    break;
                case NEUMES:
                    addNeumeContent(content);
                    break;
                case UNKNOWN:
                    break;
            }
        }
    }

    private InputType getOnlyTextOrNeume(InputType formerType, InputType inputType) {
        if(formerType.equals(InputType.UNKNOWN)) {
            formerType = inputType;
        } else if(!inputType.equals(InputType.UNKNOWN)) {
            formerType = inputType;
        }
        return formerType;
    }

    private void addNeumeContent(String content) {
        if(contentIsNeumeDelimiter(content)) return;
        neumeVerticalBlocks.addNeumes(content);

    }

    private void addTextualContent(String content) {
        if(contentIsTextDelimiter(content)) return;
        textualSymbols.addText(content);
    }

    private boolean contentIsNeumeDelimiter(String content) {
        return InputType.getInputType(content).equals(InputType.NEUMES);
    }

    private boolean contentIsTextDelimiter(String content) {
        return InputType.getInputType(content).equals(InputType.TEXT);
    }

    private InputType tryNewInputType(String content) {
        return InputType.getInputType(content);
    }

    public List<String> getWords() {
        return textualSymbols.getWords();
    }

    public TextualSymbols getTextualSymbols() {
        return textualSymbols;
    }

    public NeumeVerticalBlocks getNeumeVerticalBlocks() {
        return neumeVerticalBlocks;
    }

    @Override
    public String toString() {
        return "Line{" +
                "signs=" + textualSymbols.size() +
                '}';
    }

    public void adjustTextForUnspokenNeumes() {
        if(hasNoUnspokenNeumes()) return;
        List<Integer> unSpokenNeumesPositionsIndices = neumeVerticalBlocks.getUnSpokenNeumesPositions();
        textualSymbols.insertSpacesForUnspokenNeumes(unSpokenNeumesPositionsIndices);
    }

    private boolean hasNoUnspokenNeumes() {
        return neumeVerticalBlocks.hasNoUnspokenNeumes();
    }
}
