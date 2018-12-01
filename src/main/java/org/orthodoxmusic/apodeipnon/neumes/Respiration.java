package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Respiration extends Neume {

    private static int RESPIRATION_LENGTH = 9;

    public Respiration() {
        height = 17;
        xSpaceBetweenNeume = 6;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - 15;
        return "<image respiration x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"9.28\" height=\"16.64\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAB0AAAA0CAYAAAB2MDPxAAAACXBIWXMAAC4jAAAuIwF4pT92AAAA B3RJTUUH4godDQ4TbX54yQAAABl0RVh0Q29tbWVudABDcmVhdGVkIHdpdGggR0lNUFeBDhcAAAJ9 SURBVFjDvZi/yvIwFMbP11GcvABxEkeF5l28iIDX0FsouDr0Cjq7OLhlcOwoZBAtBCf/TEJBEKk6 SB3PN0h962tNUm37wAHlDD9zTHLOk3+IiPBGp9MJfN8H3/dhPp/DZDJ55Cil8PPzA6ZpgmmaUKvV QFuYojAM0XVdBADtcF0XwzBEHb1AOedICMkETAZjLBuUc/4xLBm2bWMURWpoXsA4LMt6CwZExCAI cgWqwICIaNt2IVAAQMdxXqFFrTIZnuc9QxljhUMJIU9lNmazGRStxWIBw+Hw8d04n89QhkajEdxu t99LqazgnN/La1kWlKXpdHr/UORxSQtERKNer0OZ2m63YHQ6nVKhu90OjG63C4SQ0qDX6xUMAIB+ v18adL1e36G9Xg9s2y4Ferlc7lAAgMFg8BGYUgqMMRBCgPbx+9sBGGNakwOl9HHYk6KUKht86owU RRFyztFxHLQs6+nidhwnFZb80R9Bv5EQQtlfjbw3SqVSkeZbrRbkDj0ej9J8tVrNH3o4HKT5RqOR P3S/30vzzWYzf+hyuXybe9wDee7cMAy1BrRcV7paraR50zTvM1Ke0KSrSyvtw9mVVVohxO8Imtcq x+OxtCm02225P80qlUvYbDZyf/qJZMOdbdtqU5xVnudJ7USaO4dvyyrrvX+N09fQKIqeeq2ORfwa KgPKXPjHUNnLCyEEgyDI9rqiKqnjOF8BM0HDMJSWVBeoDRVCSHepZVnaQCVUVc54l8o2jTY0iiLl /EsIeXsOM0F1YPHVpvsOKH28cl1XCSOESAdtbajKBsQwxljm/+4ttEyYFBqbo7xhL1BCCLqu+9Jw C4HGLqyoVaXpP1JS/sNz1yyXAAAAAElFTkSuQmCC \"/>\n";
    }

    @Override
    public int getLength() {
        return RESPIRATION_LENGTH;
    }

    @Override
    public boolean isUnspoken() {
        return true;
    }

    @Override
    public String toString() {
        return "Respiration{}";
    }


}
