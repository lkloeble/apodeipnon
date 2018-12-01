package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Stavros extends Neume {

    private static int STAVROS_LENGTH = 57;

    public Stavros() {
        height = 24;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight + 18;
        return "<image stavros x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"56.96\" height=\"23.68\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAALIAAABKCAYAAAAfSw4cAAAACXBIWXMAAC4jAAAuIwF4pT92AAAA B3RJTUUH4godDQs6UrsU4AAAABl0RVh0Q29tbWVudABDcmVhdGVkIHdpdGggR0lNUFeBDhcAAAMM SURBVHja7dy/SzJxAMfxTw8udzjkQQhhEg3a0HrQZltjYDS76Faj/4KDjrblv2DQ2pTQcODaEDdF RRD5a5AcfaaL89TMNJ+O5/2a8hLU773v+/0ekWvD4XAoLIXrunIcRycnJzIMgwFZoT8MwXLlcjll MhldX18zGIQcbs1mU4eHhyoUCnJdlwEh5HCr1WpKp9M6Pz/XYDBgQAg53M7OzpTJZHR5eclgEHL4 txvHx8cqlUoMBiGHX6/XYxAIGSBkEDJAyAAhA4QMQgYIGSBkgJBByAAhA4QMEDJAyCBkgJABQgYI GYQMEDJAyMAMa3yJodTpdNRqtUaOPTw8qN/vjxy7v78f+3f+SqWy8OsfHR0plUp9+fnJZFKbm5sz nxePx7WxsTH19/O8JiH/oOfnZ72/v388fnt70+vr68hzHMcZeey6rq6urpjCprBtWwcHB2PH9/f3 Rx5Ho1Ftb2//mgvjn4fs/5K/YIjBGXAZs9+yFYvFj5+73a5qtdq3QvGsr69rd3d3rvcwaaWY5ebm Rs1mc2VjE/xcOzs7Mk1TkrS1tbXw1/AuPWT/Mu1fnv0z408Emc/nFYvFPp1FggMYtOiAuq6rdDo9 8+SWy+VQbrc8d3d3Y8f6/f7E4/Oea/959M6ff4s0bdaPfOfDeTOn/80vcoX7r1xJ2tvbUzQanRqf aZpKJBLsA36QZVmyLGvhvXXwoh0MBnp6evr0fsRbYRzHmbrKecF79wuRSS/ihfry8qLHx8cv7Stt 2x4J0j8bBm86lrGUIJwMwxi7EGZdGBcXFxPvi7xO4/G4IqVSSb1eb+IS4N1Np1Ip1ev1sU0+MyNW zd+b/wKIeBvw29vbmfsQ4LeKZLNZRgGhx1/2QMgAIQOEDBAyCBkgZICQAUIGIQOEDBAyQMggZICQ AUIGCBmEDBAyQMgAIQOEDEIGCBkgZICQQcgAIQOEDBAyCBkg5P+VaZqybZuBIORwSyQSajQaqtfr BE3I4WYYhrLZrBqNhqrVKgNCyOEP+vT0VO12m6AJOfwsyyLoFfgLemcxwowPKVkAAAAASUVORK5C YII= \"/>\n";
    }

    @Override
    public int getLength() {
        return STAVROS_LENGTH;
    }

    @Override
    public boolean isUnspoken() {
        return true;
    }

    @Override
    public String toString() {
        return "Stavros{}";
    }

}
