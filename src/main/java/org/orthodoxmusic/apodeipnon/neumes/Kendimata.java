package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Kendimata extends Neume {

    private static int KENDIMATA_LENGTH = 32;

    public Kendimata() {
        height = 14;
        xSpaceBetweenNeume = 8;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 14;
        return "<image kendimata x=\"" + currentXPosition + "\" y=\"" + y  + "\" width=\"32\" height=\"14.4\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAGQAAAAtCAYAAABYtc7wAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKCBIQ2QXZ4wAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAQpSURBVHja7Vy/SytBEP5MF7ES7WKhhSgEEXFtLLS1OhHsxGrLYHeV 9VUWFvcXnIWNbGElB2J1hRhhLWwulXhi5aXSSzmvysMXXn55O5s73ltYCJdkmOGbb2Z2dvemlFJU r9cBAMvLyyjTeHp6wtfXF+bn57GwsIBqtYqyj6k4juno6AjNZhMAIITA7u4u6vU6ZmZmUK/XC2ts p9PB+fk5Tk9Pfz+TUmJxcRErKytYWlrC3NwcarVaeRAhIkrTlKSUBKDvFEKQ67qklCKtNaVpSkUZ vu8P1B0ASSnJ930Kw5CSJKGiDnQ/ZFk2FJTe6TgO+b5PURRNHKBRQOmdXQeL47h4gHSZIoQY27Be gLTWlGVZKUD5Pj3PozAMJ+pc6H0Qx3Euo3oNjKLIGjg/YfmgEBcEgXVw8LeHQRAYA6U7fd+3EhqS JDGuu5SSwjC04ljo52mO4xg3rAsM91BKsejuOA57QYB+X0RRxGKUDVCyLMuVC4dVm5ygYNCXXCwB QEEQlJIlXaZwha+BgHCyBABprUvJkm7JbB0QbpYIIVgTJSdLAFAURfYB4TaKM3SlacqqO0fowqSN AsBa63uex6q7UsqovpVhva7Z2Vl4nsfaT7u8vGSTvbOzw6r7xcWF+ebisMGd3AGw5hLO5G46l1RG AW1jY4O963xzc8Mm+/j4mFX36+truwyxEYsdx2FjiA2Gm8qDlVGB29zcZPeyt7c3Ftk2GP74+GhE TmEAAYC7uzsWudVqlb0wubq6shuyiMhYa/t/2DIQsgBgb2+PPWy1220W2aurq6UIW2MBsrW1VZpY /Lf1lJSSVffb21u7IYu7t8XZtCMiCsOw8OupsQHh2E20tUjk2E00vUisjMuotbU19rAVxzGL3Fqt BsdxWHXXWtvLIQCwvr4OIQSrUVEUsck+ODgodG+r8pM/7e/vl6thZ5HhzWYz1wL3R4Bwd1DzGjVp hj88PNgFxEYrIo9Rk2425mqUFnXjR0rJVv5qrQu7ase/0EGdxB5JGIZ2yt7u2N7eZo/FXKt2AGg0 GsVsNubxMu5FImfYKupZARTdKM5Tgq7rFu5EDfIaxZ1LpJSsrRTuXDLuAXOYMIwbFM6zwCavMMDA YUCUxdt+WrWMCgpnGT8Oy2HasLy3mGD56Gbv+oTLqUYFBRyGxXHMljBtXGXgqh6llEOLFHAaF8cx SyhwXZf9qlmapqSUMs4YIcTAU/+sgHw3LgxDo8lTCEFKKSvXzLTW5Pu+UXD6OZUVQHrBiaKIfN83 sh0shKAgCKzdPddaUxAExpzL87w/GDNFRIQJjna7jY+PDzw/P+P9/R2vr69otVpjH88UQqDRaODw 8NDqWydarRZeXl7w+fmJ+/t7AMDZ2dnYclzXxcnJCSYOyKiA9RvT09OFfXVGp9NBkiQDf9P7fplf cYP91sFB/o4AAAAASUVORK5CYII= \"/>\n";
    }

    @Override
    public int getGorgonCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public int getLength() {
        return KENDIMATA_LENGTH;
    }

    @Override
    public String toString() {
        return "Kendimata{}";
    }

}
