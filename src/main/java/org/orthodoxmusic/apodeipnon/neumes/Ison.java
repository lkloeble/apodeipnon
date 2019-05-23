package org.orthodoxmusic.apodeipnon.neumes;


import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Ison extends Neume {

    private static int ISON_LENGTH = 65;

    public Ison() {
        height = 26;
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 13;
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = (wordUnderNeumeLength - ISON_LENGTH)*2;
            if(lengthCorrection > 15) lengthCorrection = 15;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        //return "<image ison x=\"" + currentXPosition + "\" y=\""  + y + "\" width=\"66.56\" height=\"26.24\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAANAAAABSCAYAAAAl3FqnAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKCAUSMog8WQAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAcCSURBVHja7Z0xaBNfHMe/ikscAyJIFh1SN6PwQDAFBykUhEBcJQ6e WyJkiC12KhjQZhB6HYo1QzpkKQntpClBWriAmEA7lGJukGKDUGquDuUy3n/wn9rGNCbp3eWu+X7g txzpu3fvvW9/7373e+9dMAzDgMmoqor9/X3s7e2d+purV6/iypUr8Pv9IMStXDKjEE3TUKlUUCwW kUqlev57SZIwOjqKu3fvUlDEVVw4iwfa3NxENpvtSzSnIYRANBrFw4cP4fV62UPk/AlIVVWkUim8 f//e0solEglIkkSvRM6HgBqNBtLpNGKxmK2VpJCI6wVUq9UQjUaxsrIysMrKsoynT5/C4/Gw54h7 BFQqlRCPx1Eulwde4VAohOXlZfYccYeASqUSgsGgoyqtKAru3bvH3iMD56LbxAPA1KgfIZZ4IFVV MTIy4tiK53I5hMNh9iBxngfSNA2PHz92dMVfv36NRqPBHiTOE9DExIQjAgadKJfL+PDhA3uQOGsK l8/n8ejRI1dUXgiB9fV1hrWJMzyQpmmuEU/TC6XTafYicYaA5ufnXfcAsVgMmqaxJ8lgBaSqKqam plz5ENlslj1JBiug1dVV1z5ELBaDqqrsTTIYAWmaZnuCqNlYnRlOyKkCqlQqrn+QVCpFL0Rs5xIA LC0tDbQSkiTh+vXruHnz5onrP378wPfv37tO3UmlUlhYWGCvEtu4oOu6cfnyZdtvLMsygsEgAoFA V7+v1WrY3t7G0tJSx+kaE02JrWxsbBgAbLNcLmfoum6chXq9bmQyGUMI8Vf5oVDIIMQukMvlbBFO IpEw6vW6qZXXdd1oV39FUdizxBYufv782XIvl8lkMDMzY/omIR6PB+FwGPV6HYlE4uh6PB5noimx Jwp3cHBg6Q0URUEkErH0Hl6vFzMzM8jlcgCYaEpsDCL8P+2xhEKhgLGxMVsfSFXVo6UYTDQllnsg qwpOJpO2iwcA/H4/8vk8gMGH5wk9UF84YZlBrVZDOBzGx48fuUEjcZcHmpycHPjUyefzIZ/PM9GU uEtAQgiMj4874uF8Ph9u377N5Q7EPQKKRCKOenFnVgKxVEChUMjUAp24DRbfgYhlAnrw4IGpBTp5 KyxCTBeQmR5DCMHvLmS4BBQIBCCEMKWw+/fvs0XJ8AURJicn2RKE9Cug8fFx07wQIUMnII/Hg1ev XrE1COlHQAAwNjYGSZLYIoT0IyAAJ9bUEEJ6FJDf70cmk+m7sLW1NbYoGSrang/07NmzvvdZ03Wd 34LIcHqgJm/evOk7Kre7u8tWJcMtIK/Xi3fv3vVVoB17LBDiaAEBQCAQQKFQ6LnA5mpQQob2Heg4 c3NzPe+bvbu7C5/Px9Ylw+uBmkSjUciy3FOhy8vLbFlCAR0XUS/fiBYXF7kvG6GAjjM9Pd11pkK5 XOaOOITvQK00Gg08f/68629EfBci9EDH8Hg8mJ2d7doTTU9Ps4UJPVA7T5ROp7uKzsmyjGg0ypYm FFAr3Ya4KSJiNY1Go20WzM7ODkZHRy1LLzuTgIDfEbcnT55QROTMA/3w8PDEtcPDQ2xtbf3127W1 NZTL5a7vmUwm8fLlS2cKCABKpVJX21klk0nE43Emm3Kg204ul0M4HHamgIA/e1H/q8GEEHj79i03 PORAt51qtQq/3+9MAQGApmmYmJjoKswdCoWQSCRw586dofBImqbh58+ff11vN6CHfaBbhRDC9MMG TBVQr+9FzYeKRCIIBoMYGRkZuJh6GejNU8Rb6fZUcWI/kiRhdnbWtHFmiYCAPwdd9fofU5Ik3Lp1 C9euXcONGzfQPEG8k+tVVfWfA/7r16/49esXBzoxN6Bl5QGsuq4byWTS1lPAabRurFAomHNKtx0n GW9sbBihUIgdR3OUVatVdwio05H0NNqgTAhh1Ot1dwioSb1e57SO5hiTJMnQdd09AmpSrVaNRCLB TqQN3GRZdp+AKCTaeQgqDFxAx6d2siyzM2muCio4RkCtwQZG7WhuCCo4TkCt0ztZlg0hBDuY5sig gqMFdNwrKYrC6B3NcUEFy1J5rGRzcxOKomBxcZHJlcQSFEXpasWAKwV0nFqthu3tbRSLRea2EVPp ZlMc1wuoXWLpzs4OKpUKvnz5gpWVFY4E0hdCCKyvr3fM3D53AmqlueBsa2vraPkBPRXpFkmSsLCw MLwCOo3mup/9/X3s7e2dWMSmqio9Fzmi0/KHoRUQOb+0Wx+m6zq+ffsG4PcRPAcHBz0dIndaUIEC IkNNMwilqiqKxWLHmUe7oAIFREiLoD59+oR8Pv+XmNoFFSggQjpMBVdXV09sHtoaVKCACPkHmqYh m80eCel4UIECIqQHIc3Pz2NqauooqEABEdLH1O7FixeYm5ujgAjph+YJJf8B7NuB6q1XLuMAAAAA SUVORK5CYII= \"/>\n";

        String isonPath = "M 65.118468,25.269861 C 62.682808,23.7573 61.543089,23.680121 41.612767,23.678114 21.672032,23.676106 19.345447,23.537394 14.56,22.065217 8.5483213,20.215808 2.4339868,15.486498 0.54906626,11.228053 -1.0650917,7.58132 1.7269941,1.8861247 5.7147016,0.6913785 7.8322007,0.05696021 10.436363,0.22802129 12.439985,1.1331461 c 1.770125,0.7996434 1.831254,0.8727073 3.681316,4.4000001 1.668956,3.1820004 1.77397,3.4862176 0.930382,2.6952541 C 16.036755,7.276784 13.260325,6.0788365 12.076567,6.0817846 8.1699473,6.0915142 5.5153314,9.4518784 6.3760238,13.297858 7.2037553,16.996551 9.3513575,18.596822 13.76,18.799976 15.256,18.868913 25.957386,18.48312 37.540856,17.942658 49.124331,17.402196 58.730593,16.96 58.888113,16.96 c 0.21953,0 4.555792,5.210631 7.123591,8.56 0.391129,0.510181 0.281792,0.479562 -0.893236,-0.250139 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + isonPath + "\"\n" +
                "     id=\"ison\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 5;
    }

    public int getGorgonCorrection() {
        return getLength()/2 -5;
    }

    public int getUnderGorgonCorrection() {
        return getLength()/2 - 40;
    }

    @Override
    public int getLength() {
        return ISON_LENGTH;
    }

    @Override
    public String toString() {
        return "Ison{}";
    }
}
