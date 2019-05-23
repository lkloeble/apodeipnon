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
        //return "<image bemol x=\"" + (currentXPosition+30) + "\" y=\"" + y + "\" width=\"33.28\" height=\"19.52\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAGgAAAA9CAYAAABBXyzlAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKDhAyOt6GNwAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAUPSURBVHja7Zy/S/NcFMePL89SeYZaFCdFO9QORUSMOCg4CZ2y6Nop /0LA1SEgOmZx6NIO3QJ1UQIiinFqMRRKMR1USHBLp3I73nd43zxIH2tOfrU3bb5QkHJMTvrhnJyc e27mKKUUZliDwQBM04R2uw39fh/a7TYAAFxeXqL+n+d5yOVykE6nIZ/Pw/LyMiwtLUEulwvFv7lZ BGRZFtzf38PT0xOUy+XIziMIAhwcHMDm5iZsbW0lgH5Sr9eDh4cHqFarcH197Sk69vb2AAAgm83C /Pw8AAAQQuDt7Q1eX1+hXq9Do9FwPVapVIJisQipVArvOJ1yEUKoLMsUAFAfQRCoqqrUtm1P59E0 jYqi6Hp8juOooiiUEII67lQDUlWVchyHAiNJEjVNM/A5dV1HnZPneWoYxmwCIoRQSZJQYLA/VFTn r1QqswWIEEIFQUD9OLIso1ONHymKgk6ro/yAWYWjqupYfNI0DR3J36VYmEU4mqaN1TcvkIYjaWoA YXP+uOE4wlaSoihOHyBVVdH3nEnKT/qFaUht2LI2yoIAI9u2Ub5yHPfH19gDwlZKYZfSUfvrRBHM QvQM5/W4RHzsAWHvPaxEj9coMk2T/hPnBujd3R2qoxxW6z8sFYtFlF2n04FYA8Ks2ZycnDDndyqV AkmSXO2azWZ8AXW7XZTdzs4Ok/5j/Hp/f48voI+PD9R6TiaTYdL/tbU1V5tyuRxfQP1+39Vmd3eX Wf9XVlZQdlMNKJ/PM+s/dlU1toCc4Y5pV2wBpdPpBBDLwqSvz89PZv23LGu6AWHUarWY9Y0QMt2A stksqkwdDAaxfUzgOC6+gFZXV1F2Ly8vTPrfbDZdbQ4PD+MLKJPJAM/zrnaPj49M+l+v111tCoVC vAcXscvIXocQo5au6yi/dV2Pdzd7f38fZVer1Zjy++bmBmW3sbER/9FfnudRS8isRJFt2+hJV0op jX2ZXSqVXG0ajQYzUXR1dYWyOz4+/u+PuEaObdu0UqmgZ6+BgZVVwzA8j15BHMF42a0AI6ZlWJ1F gP+XumMHyDAM1PYOCDAHHaWwviuKEq/BRey+Gy8f5wbM2uPAd34By2AwFRrrkYSFM8ofpgARQqii KL7BiKKIntF2fpQwNm2NuhZs5EuSxPb2E9u2qaIoniqyYTBfKzQvRQTHcaFvRdE0DX0tbvPiMGkw fisy5+JGPYB6Pe4w5KjTMsdxqJ0WEwFkGEagUvknMH4mOGFo5FZRFFTqs22b6rpOZVn2FP2iKKI7 G2Pdht/tdqFcLqNfEjG8NnJ6eup5G7tlWXB2dub7fQiCIMDCwsJf3/u5Bp7n4eLiwtukK+sVGc/z VNO0wBVX1FWhWxHgN31GBogQQlVVDQwmqvTqtyDxAkXTtMBN2tBT3GAwgNvbWzg/P3d9+8Z3EkVx bAPvlmVBp9OBbrcLrVYrUBpcX1+HfD4PhUIhVN9DA9Tr9aBWq0G1WvUFRpZlODo6mvhOBOflSl9n B74OSf7+/fvP2O7i4mL0o8VBU4ZpmpGVyokC3IOCNC+d99UkYCIApGkaerfyqGeMSW/mnUpAYZTK iUIG5DQvg/TIEjARAPKznBx2XyvRN4CibF4mCgDIMAxP6yh+m5eJfAAKWionFVm0+uWnIyuKImxv b3t7OWoif/LyLrOkIpvQPein55ukIpus5iil9Pn5+a9BdFaalzMvh5QTRUlFxmAEOcvRY2mfJ/Kk fwGK7oioCXAVOAAAAABJRU5ErkJggg== \"/>\n";

        String bemolPath = "M 0.35938383,18.358648 C 0.14854364,17.895904 0.01742948,17.480898 0.06801902,17.436411 0.16179203,17.353951 11.845829,11.929788 14.322623,10.818895 c 1.224408,-0.549172 1.326653,-0.678377 1.008,-1.2737852 C 15.13558,9.1806688 14.976,8.0584189 14.976,7.0512218 c 0,-3.4160138 1.810077,-5.6373069 5.34371,-6.55770145 5.36543,-1.39751693 10.887967,0.19394727 12.380347,3.56772285 0.524214,1.1850682 0.624896,1.9103363 0.493107,3.5521283 C 32.972978,10.356421 31.870049,11.956617 29.290228,13.275987 27.512603,14.185098 27.19277,14.24 23.674372,14.24 c -3.665619,0 -3.760646,-0.0185 -5.432656,-1.057884 l -1.701778,-1.057883 -1.469969,0.633498 c -0.808483,0.348423 -4.263554,1.94047 -7.6779353,3.537883 C 3.9776527,17.893026 1.0847668,19.2 0.96339879,19.2 0.84203073,19.2 0.57022398,18.821391 0.35938383,18.358648 Z M 26.655277,12.687666 c 1.322276,-0.552483 2.925758,-2.375789 3.428187,-3.8981649 0.908817,-2.7537411 -0.49696,-5.9775683 -3.25096,-7.4553338 -3.663303,-1.96568762 -9.024968,1.3078313 -9.016509,5.5049537 0.0043,2.1284208 1.682609,4.748938 3.784004,5.908317 0.893196,0.492794 3.815498,0.458241 5.055278,-0.05977 z";

        return "  <path\n" +
                "     style=\"fill:#FF0000;stroke-width:0.31999999\"\n" +
                "     d=\"" + bemolPath + "\"\n" +
                "     id=\"bemol\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

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
