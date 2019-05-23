package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class PhtoraDiatoniqueDur7 extends Neume {

    private static int PHTORA_DIATONIQUE_DUR7_LENGTH = 0;

    public PhtoraDiatoniqueDur7() {
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height - 19;
        //return "<image bemol x=\"" + (currentXPosition+30) + "\" y=\"" + y + "\" width=\"30.4\" height=\"16.96\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAF8AAAA1CAYAAAAnIzfJAAAABmJLR0QA/wD/AP+gvaeTAAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4gsYFScR372tRAAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAARjSURBVHja7Vy9S+xAEB8fr0nhwZVC6rVSrjkRxFQi2NgYwVqb/AF2 AYurI1iKcILdgfcXyF1jYZFrhAOJYiFEcnbCHnjlvmKN+s58zObysYkOBB64vt39zezM7OxvnGOM Mfjpcn8PQGn4z1UVYGEh9Wn//iiQBwOA62uAx0eAuzv+bxFRFIBmE2B7G6DRAFhZAZifT74eVmXx PMbabcY0jTGAbD5C+ByeJ7y86oFPKQeDEDyAmvb5KUpyRRiGkBKgUlZumsyNAcj1Qer1uKKilGjb jJmmmCIB+O/8CPApZcyyYkFnisJYt5t8HsfhShM5TVHKLT34to1zE5aV3pyOgz8JhEQqoLzgW1b8 5hWFg5WFYE9BhALKCT5m4zFWl6sCdL0C4FOKSxvzAF5UAQFBGKpm8S5Adq4mzCCw6altlxR808Rt sNcrJvBj1qYo/53IcoDf6+HTu6IEmwF9ybzkB5/S+Bw+5FjnKt0uao0uwIf1/5G+GHZ2BipmnKbx oldRsrmJGqa+70n+wpqI1c9ye01LdB3v+6W3/MtLnNULWF6msrqKGzeZAIxGIDf4Fxe4cZo2W109 LdE0/NibG8nBxz52rK/LsV5VxY99epIY/MEAP7Zel2PNgk+N8oIf9aY6LY2GNMt+rgT4t7f4sbWa NMtWBfy+/Hl+VaVerwj4w2H51ry0JDH4In5cJDhnLS8vuLjQbEoMvogfx94H8pCHh/i4YBiS+3yR Os1kwllnRUu/jxu3v1+CgEsIfuzJSfHr7XZxe/INS+rCWrstxpdJwBpLlTckWPaW2/K3tsTGt1rF rXVvD1f7+epOpX9MwZZp/S/P91sRGkvAyZQffOz7aBHMBYEXrCDiVjnecEVoej4XUybgQ96WywE+ peJk1awVgHU1lWCsiWY+WSnAcfB8f11Pmatp2xwI0/zktOcR5JI2OBCSTgrqeWj35yLflAE1aVh3 h6JwJWSdXyex+mkwLCtZILZtMdAF5oFEmiYkP44MNqhhwYlrjLBtPqdhoGmASZULwsGk3ZYvjSvq I2Qmygp8yypCLjW5ElApjT/qhPD1eJ6wpRbVABcNftSG87L4mM4PN67TxO+lsiy+H03DE6+C8nNd 5/+Xbad+eZtj7L0J+vwc4OAguCahKABvb9nXR46PAQ4Po2sjnU7yhuTxGMBx4ukfGTQ8BwqKlpdm T1NYkItwGa4sdMCUhVc1r66iaXlZUTNGI4DdXd7JPZkEj7EsUCkF2Nmp3Bs6b//vdPKddTzmTN0o F2MYAEdH+bmAIoQxFh+QkE29qCwmrmdWsIu7zMJ9PpLSPOst1Y3y6XnclKUDH/v8laRIRSkPlGHB 1L+k5Fl/l87ysZcTw8ABFeFePqy8iBcnKcF3HPEi1TR4lPKaiWF8B90vwP0CHnLJ6vfheWMD1DSi OCEAy8v8AXxtDWBx8ZebGSCf4Pt5d6sFz6enOCVM/+UlVf0FOjH40/zH4RDg9fX7hatWK7bzryLy D61ej8h6WbvJAAAAAElFTkSuQmCC \"/>\n";

        String bemolPath = "M 0.35938383,18.358648 C 0.14854364,17.895904 0.01742948,17.480898 0.06801902,17.436411 0.16179203,17.353951 11.845829,11.929788 14.322623,10.818895 c 1.224408,-0.549172 1.326653,-0.678377 1.008,-1.2737852 C 15.13558,9.1806688 14.976,8.0584189 14.976,7.0512218 c 0,-3.4160138 1.810077,-5.6373069 5.34371,-6.55770145 5.36543,-1.39751693 10.887967,0.19394727 12.380347,3.56772285 0.524214,1.1850682 0.624896,1.9103363 0.493107,3.5521283 C 32.972978,10.356421 31.870049,11.956617 29.290228,13.275987 27.512603,14.185098 27.19277,14.24 23.674372,14.24 c -3.665619,0 -3.760646,-0.0185 -5.432656,-1.057884 l -1.701778,-1.057883 -1.469969,0.633498 c -0.808483,0.348423 -4.263554,1.94047 -7.6779353,3.537883 C 3.9776527,17.893026 1.0847668,19.2 0.96339879,19.2 0.84203073,19.2 0.57022398,18.821391 0.35938383,18.358648 Z M 26.655277,12.687666 c 1.322276,-0.552483 2.925758,-2.375789 3.428187,-3.8981649 0.908817,-2.7537411 -0.49696,-5.9775683 -3.25096,-7.4553338 -3.663303,-1.96568762 -9.024968,1.3078313 -9.016509,5.5049537 0.0043,2.1284208 1.682609,4.748938 3.784004,5.908317 0.893196,0.492794 3.815498,0.458241 5.055278,-0.05977 z";

        return "  <path\n" +
                "     style=\"fill:#FF0000;stroke-width:0.31999999\"\n" +
                "     d=\"" + bemolPath + "\"\n" +
                "     id=\"bemol\"\n" +
                "     transform=\"translate("+ (currentXPosition+30) +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return PHTORA_DIATONIQUE_DUR7_LENGTH;
    }

    @Override
    public String toString() {
        return "PhtoraDiatoniqueDur7{}";
    }


}
