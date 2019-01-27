package org.orthodoxmusic.apodeipnon.neumes;

public class BasseNoteIson {

    private BassIsonValue value;

    public BasseNoteIson(String note) {
        switch (note) {
            case "ga":
                value = BassIsonValue.GA;
                break;
            case "pa":
                value = BassIsonValue.PA;
                break;
            case "nh":
                value = BassIsonValue.NH;
                break;
            default:
        }
    }

    public boolean hasIsonNote() {
        return value != null;
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public String getSVG(int currentXPosition) {
        return "<text x=\"" + currentXPosition + "\" y=\"25\" fill=\"red\" font-size=\"25\">( &#" + value.getUnicode() + "; )</text>\n";
    }

    public static int getAdditionalHeightForIson() {
        return 25;
    }
}
