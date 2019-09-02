package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Eteron  extends Neume  {

    private Neume neumeWithEteron;

    public Eteron(Neume neumeWithEteron) {
        this.neumeWithEteron = neumeWithEteron;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        currentXPosition += neumeWithEteron.getGorgonCorrection();
        this.xStart = currentXPosition;
        currentXPosition += 60;
        int y = maxHeight - height + 17;

        String eteronPath = "M 58.719999,17.478358 C 53.837996,16.420793 48.824364,14.733503 42.293955,11.95033 35.696742,9.1386872 34.390803,8.816276 30.565219,9.0547336 26.608745,9.3013499 24.190843,10.108106 17.138262,13.534764 l -6.061737,2.945235 -2.8982627,-0.0135 C 5.6761087,16.454841 5.0547068,16.33602 3.6315686,15.597104 1.6963569,14.592311 0.7743255,13.527235 0.29333599,11.740977 -0.3459783,9.3667448 0.7210518,5.6166813 2.7025789,3.2737237 3.6965161,2.0984926 5.7553836,0.82675711 7.1999999,0.4957258 8.0558527,0.29960867 7.9994591,0.38267566 6.6801798,1.2614133 4.3998086,2.7803093 2.88,5.4692467 2.88,7.9849208 c 0,1.6683132 1.3937427,4.2665292 2.8105948,5.2395132 1.4862525,1.020643 3.885415,1.635126 5.4149902,1.38691 0.641763,-0.104144 3.697546,-1.40727 6.790629,-2.895836 3.093082,-1.488567 6.508179,-3.0017878 7.589103,-3.3627136 4.475768,-1.4944796 8.94298,-1.6056786 13.086871,-0.3257612 1.103815,0.340934 4.636237,1.7809765 7.849824,3.2000948 9.024173,3.985069 14.009827,5.413052 20.627997,5.908235 4.735609,0.354327 12.693846,-0.765066 16.375468,-2.303346 L 84.558572,14.35858 83.254978,13.713613 C 82.504463,13.342287 80.636885,11.64913 78.853135,9.7228712 75.818098,6.4453619 74.035666,5.0885738 72.206303,4.6632996 70.661247,4.3041191 68.512556,4.8213693 66.821023,5.9596886 l -1.602787,1.0785942 0.63743,-1.0391417 c 0.350586,-0.5715276 1.316756,-1.5071413 2.147047,-2.0791413 1.361318,-0.9378346 1.733971,-1.0393096 3.793449,-1.0329721 3.473421,0.010688 4.505722,0.621943 9.163837,5.4261597 3.427792,3.5353056 4.181098,4.1581716 5.265965,4.3541246 0.940361,0.169852 1.515245,0.0856 2.235171,-0.327582 l 0.969203,-0.556246 -0.634781,0.701423 c -1.508288,1.666638 -6.473843,3.817703 -11.195558,4.849884 -2.1192,0.463264 -4.5284,0.6661 -9.12,0.767833 -5.684333,0.125944 -6.553452,0.07035 -9.76,-0.624266 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + eteronPath + "\"\n" +
                "     id=\"eteron\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";


    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public String toString() {
        return "Eteron{}";
    }

}
