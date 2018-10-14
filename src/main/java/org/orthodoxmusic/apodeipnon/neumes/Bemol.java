package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Bemol extends Neume {

    private static int BEMOL_LENGTH = 0;

    public Bemol() {
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height - 19;
        return "<image bemol x=\"" + (currentXPosition+30) + "\" y=\"" + y + "\" width=\"33.28\" height=\"19.52\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAGgAAAA9CAYAAABBXyzlAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKDhAyOt6GNwAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAUPSURBVHja7Zy/S/NcFMePL89SeYZaFCdFO9QORUSMOCg4CZ2y6Nop /0LA1SEgOmZx6NIO3QJ1UQIiinFqMRRKMR1USHBLp3I73nd43zxIH2tOfrU3bb5QkHJMTvrhnJyc e27mKKUUZliDwQBM04R2uw39fh/a7TYAAFxeXqL+n+d5yOVykE6nIZ/Pw/LyMiwtLUEulwvFv7lZ BGRZFtzf38PT0xOUy+XIziMIAhwcHMDm5iZsbW0lgH5Sr9eDh4cHqFarcH197Sk69vb2AAAgm83C /Pw8AAAQQuDt7Q1eX1+hXq9Do9FwPVapVIJisQipVArvOJ1yEUKoLMsUAFAfQRCoqqrUtm1P59E0 jYqi6Hp8juOooiiUEII67lQDUlWVchyHAiNJEjVNM/A5dV1HnZPneWoYxmwCIoRQSZJQYLA/VFTn r1QqswWIEEIFQUD9OLIso1ONHymKgk6ro/yAWYWjqupYfNI0DR3J36VYmEU4mqaN1TcvkIYjaWoA YXP+uOE4wlaSoihOHyBVVdH3nEnKT/qFaUht2LI2yoIAI9u2Ub5yHPfH19gDwlZKYZfSUfvrRBHM QvQM5/W4RHzsAWHvPaxEj9coMk2T/hPnBujd3R2qoxxW6z8sFYtFlF2n04FYA8Ks2ZycnDDndyqV AkmSXO2azWZ8AXW7XZTdzs4Ok/5j/Hp/f48voI+PD9R6TiaTYdL/tbU1V5tyuRxfQP1+39Vmd3eX Wf9XVlZQdlMNKJ/PM+s/dlU1toCc4Y5pV2wBpdPpBBDLwqSvz89PZv23LGu6AWHUarWY9Y0QMt2A stksqkwdDAaxfUzgOC6+gFZXV1F2Ly8vTPrfbDZdbQ4PD+MLKJPJAM/zrnaPj49M+l+v111tCoVC vAcXscvIXocQo5au6yi/dV2Pdzd7f38fZVer1Zjy++bmBmW3sbER/9FfnudRS8isRJFt2+hJV0op jX2ZXSqVXG0ajQYzUXR1dYWyOz4+/u+PuEaObdu0UqmgZ6+BgZVVwzA8j15BHMF42a0AI6ZlWJ1F gP+XumMHyDAM1PYOCDAHHaWwviuKEq/BRey+Gy8f5wbM2uPAd34By2AwFRrrkYSFM8ofpgARQqii KL7BiKKIntF2fpQwNm2NuhZs5EuSxPb2E9u2qaIoniqyYTBfKzQvRQTHcaFvRdE0DX0tbvPiMGkw fisy5+JGPYB6Pe4w5KjTMsdxqJ0WEwFkGEagUvknMH4mOGFo5FZRFFTqs22b6rpOZVn2FP2iKKI7 G2Pdht/tdqFcLqNfEjG8NnJ6eup5G7tlWXB2dub7fQiCIMDCwsJf3/u5Bp7n4eLiwtukK+sVGc/z VNO0wBVX1FWhWxHgN31GBogQQlVVDQwmqvTqtyDxAkXTtMBN2tBT3GAwgNvbWzg/P3d9+8Z3EkVx bAPvlmVBp9OBbrcLrVYrUBpcX1+HfD4PhUIhVN9DA9Tr9aBWq0G1WvUFRpZlODo6mvhOBOflSl9n B74OSf7+/fvP2O7i4mL0o8VBU4ZpmpGVyokC3IOCNC+d99UkYCIApGkaerfyqGeMSW/mnUpAYZTK iUIG5DQvg/TIEjARAPKznBx2XyvRN4CibF4mCgDIMAxP6yh+m5eJfAAKWionFVm0+uWnIyuKImxv b3t7OWoif/LyLrOkIpvQPein55ukIpus5iil9Pn5+a9BdFaalzMvh5QTRUlFxmAEOcvRY2mfJ/Kk fwGK7oioCXAVOAAAAABJRU5ErkJggg== \"/>\n";
    }

    @Override
    public int getLength() {
        return BEMOL_LENGTH;
    }

    @Override
    public String toString() {
        return "Bemol{}";
    }

}
