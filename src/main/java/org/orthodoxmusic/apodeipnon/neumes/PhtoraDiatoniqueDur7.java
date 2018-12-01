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
        return "<image bemol x=\"" + (currentXPosition+30) + "\" y=\"" + y + "\" width=\"30.4\" height=\"16.96\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAF8AAAA1CAYAAAAnIzfJAAAABmJLR0QA/wD/AP+gvaeTAAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4gsYFScR372tRAAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAARjSURBVHja7Vy9S+xAEB8fr0nhwZVC6rVSrjkRxFQi2NgYwVqb/AF2 AYurI1iKcILdgfcXyF1jYZFrhAOJYiFEcnbCHnjlvmKN+s58zObysYkOBB64vt39zezM7OxvnGOM Mfjpcn8PQGn4z1UVYGEh9Wn//iiQBwOA62uAx0eAuzv+bxFRFIBmE2B7G6DRAFhZAZifT74eVmXx PMbabcY0jTGAbD5C+ByeJ7y86oFPKQeDEDyAmvb5KUpyRRiGkBKgUlZumsyNAcj1Qer1uKKilGjb jJmmmCIB+O/8CPApZcyyYkFnisJYt5t8HsfhShM5TVHKLT34to1zE5aV3pyOgz8JhEQqoLzgW1b8 5hWFg5WFYE9BhALKCT5m4zFWl6sCdL0C4FOKSxvzAF5UAQFBGKpm8S5Adq4mzCCw6altlxR808Rt sNcrJvBj1qYo/53IcoDf6+HTu6IEmwF9ybzkB5/S+Bw+5FjnKt0uao0uwIf1/5G+GHZ2BipmnKbx oldRsrmJGqa+70n+wpqI1c9ye01LdB3v+6W3/MtLnNULWF6msrqKGzeZAIxGIDf4Fxe4cZo2W109 LdE0/NibG8nBxz52rK/LsV5VxY99epIY/MEAP7Zel2PNgk+N8oIf9aY6LY2GNMt+rgT4t7f4sbWa NMtWBfy+/Hl+VaVerwj4w2H51ry0JDH4In5cJDhnLS8vuLjQbEoMvogfx94H8pCHh/i4YBiS+3yR Os1kwllnRUu/jxu3v1+CgEsIfuzJSfHr7XZxe/INS+rCWrstxpdJwBpLlTckWPaW2/K3tsTGt1rF rXVvD1f7+epOpX9MwZZp/S/P91sRGkvAyZQffOz7aBHMBYEXrCDiVjnecEVoej4XUybgQ96WywE+ peJk1awVgHU1lWCsiWY+WSnAcfB8f11Pmatp2xwI0/zktOcR5JI2OBCSTgrqeWj35yLflAE1aVh3 h6JwJWSdXyex+mkwLCtZILZtMdAF5oFEmiYkP44MNqhhwYlrjLBtPqdhoGmASZULwsGk3ZYvjSvq I2Qmygp8yypCLjW5ElApjT/qhPD1eJ6wpRbVABcNftSG87L4mM4PN67TxO+lsiy+H03DE6+C8nNd 5/+Xbad+eZtj7L0J+vwc4OAguCahKABvb9nXR46PAQ4Po2sjnU7yhuTxGMBx4ukfGTQ8BwqKlpdm T1NYkItwGa4sdMCUhVc1r66iaXlZUTNGI4DdXd7JPZkEj7EsUCkF2Nmp3Bs6b//vdPKddTzmTN0o F2MYAEdH+bmAIoQxFh+QkE29qCwmrmdWsIu7zMJ9PpLSPOst1Y3y6XnclKUDH/v8laRIRSkPlGHB 1L+k5Fl/l87ysZcTw8ABFeFePqy8iBcnKcF3HPEi1TR4lPKaiWF8B90vwP0CHnLJ6vfheWMD1DSi OCEAy8v8AXxtDWBx8ZebGSCf4Pt5d6sFz6enOCVM/+UlVf0FOjH40/zH4RDg9fX7hatWK7bzryLy D61ej8h6WbvJAAAAAElFTkSuQmCC \"/>\n";
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
