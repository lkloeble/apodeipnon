package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Petastie extends Neume {

    private static int PETASTIE_LENGTH = 52;

    public Petastie() {
        height = 19;
        xSpaceBetweenNeume = 15;
    }


    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        int y = maxHeight - height + 13;
        int wordUnderNeumeLength = textLinePositions.getLengthForThisWord(positionInSentence);
        if(wordUnderNeumeLength > getLength()) {
            lengthCorrection = (wordUnderNeumeLength - PETASTIE_LENGTH)*2;
            currentXPosition += lengthCorrection;
            xSpaceBetweenNeume += lengthCorrection;
        }
        this.xStart = currentXPosition;
        //return "<image petastie x=\"" + currentXPosition + "\" y=\"" + y + "\" width=\"52.48\" height=\"19.52\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAKQAAAA9CAYAAAAj3MLKAAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKCBAsxFzH5gAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAYmSURBVHja7Z09aNtaFMf/DW9xpiY0ZDGBdEhMKcQdVAJNIFOhULjg sYOzaEwLHURDO2VwCXSrVmdwhmSySZdQQ4eGKFAwxCEUagsKBXkxjksnebxvyHOeU/vasqxr6+P8 QRDH1pWl+/M595z7dYdzzkEiDZBpmmg0GqjX65ifn8fc3Bzu3buH2dlZT6/zDz1qkki/f//G7u4u Pnz4IPyMoijY2NjA6uoqHj9+jHg8PtI175CFJIksYjabvXn99etXlEqlgecxxpBKpfD8+XNX1pOA JDlSq9XC3t4eXr586fgcTdOgqiqWlpacA6lpmhQgFxYWsLW1RTUZMiinp6eHPk/TNGxvbzuzmIZh cACeHIwxrus6L5fLnBROZTIZ13zk8/mB5YNzzkeBMpPJcMMweLPZpNqKgEY1YKqq9mUF7T90XR/K EhqGwW3bphqKmJrN5sieVFEUbllWfyCdQlksFqlWIi6vmniGYfQH0gmU5JpJqqpKg3Lq7yBna2sL hmEIg6A3b96g1WpRyBlhzczMeFbW2toazs7Obl5P9frQkydPYBgGFEXpei+bzeLVq1cEJckzvX79 GrVa7fpFP9NsWRZXFEUYLVFQE00xxjxz2Z2Bjm3bHIMublmWsM3AGBNGSyQKatykEOHkC9i2LYSy XwhPCp9s25YGJAA+5cTHx2IxfPz4EZlMpuu9UqmEVCr1fxuAFGpZliW1/CmnH4zFYnj79i10XSco I6zv37/7A8jOtFCxWBRCaZom1VqIValUpJWtqurwQALA06dPUS6Xu9JCpVIJy8vLt/JKpHDp6OhI WtmLi4vugASAZDKJQqEAxljPZOf+/j7VXshkmqajQbpulUgk3AMJAPF4HIeHh9A0reu9zc1NvH// nhLoIdK3b9+klv/w4UPAq3RAPp8XJtApLUQJcSeHo8T4MCqXyz17dhRFoUG7AVe5XJYKo6qqvQdX jKJkMonPnz9DVdWuYOfRo0coFArk9wKq4+NjqeWvr69f/yHrF5XL5Xr+EjRNoz7wgMmLQbmDjrYH hcwbqVarQhderVappgOiYWYTwOXAipt+8nH0fYomBuVyOaptso5c1/XxAdlWsVjsaS0pCo+2dQRw q/4x7l/bf/PAaa5OAGRZlnQYGWO3rolJ3KjIWmqaRnN2fCSR8fDy+HtODSZ1syJrqSiKownlJPlG QzaM7VHivgCS2pb+DmREU1e8PHoZHvjlAYjcQy6Xo7zlmOXlNNdhrKNvgGyrX9djr0nlJO8l6tAY h3X0HZCcX+ct+/XykBuXJy8XHnNjHX0JZFvValXoOsiNy0nxjKPdCMESKr4HclDQoygK5S4DCGN7 VE9ggWy7cVGPAWOM+sUDAuPfvTKBBdKJG6f2pf9hdLxgaRAb36IHqes69fb4EMZBrjrQQA6KxglM d+k1mVG1U++FoD/cfkl1ArNborlPk4qqQwdkZ/uy3ySkqINp2/ZYBkv0G+sYKSAHpYk6g5+oTTgb t4vGCEs2IqzWYJBrYozxfD4faqs5qDkzqd6YyAHZWSFORjy3tzYJS++P0/v2QxATKSA7K8jphj9B hnPSIMKD9UIjAWRn4DOMC8tkMrxYLPrardu2zQ3DmJhrhseL10YKSLdgomPbPD/sWtZsNrlhGCNt 8yYjgPGipyzSu8HWajUcHR0NtcNpW537RLc3NB9m19NhVx379esXTNPEly9f8OnTJ189R03TsLOz g1gsNnJZtD0xrjcqPzg4cAWmCFQAWF1dvfn//fv3++6k2rkybaVSwZ8/fxzvUT1J5fN5pFIp7wqk vovudJHsVb7CcMia80RACuSXQMFvh+xZoQSkgwAil8tNpKfDb8c4RupTG3IIXVxc4Pj4GO/evYvM PSuKgnQ6jRcvXmB2dlb69QhIF2q1Wjg/P8fJyUlo4WSMIZ1O49mzZ55EzwQkwenaGq6trSGZTE7k OxCQEtz65eUlCoWC7/KFgyBcXl4eqzUkICeQ3/zx4wd+/vyJ09NTZLPZiX8nVVWxsrKCpaUlPHjw APF43FfPjIAcs0zTRKPRQL1el5YAbyfn7969i0QiIb0niYAMuVW9uroa+rzp6WnfWTs3+hf3wmDR n/hACAAAAABJRU5ErkJggg== \"/>\n";
        String petastiePath = "M 29.460903,19.054555 C 21.965639,17.584437 9.4593818,10.594521 2.4000001,3.9298509 l -2.56000002,-2.4168627 3.68000002,0.00667 c 2.2837024,0.00414 3.4371657,0.1085375 3.04,0.2751422 -0.352,0.1476584 -1.108,0.4433826 -1.68,0.6571649 -0.572,0.2137822 -1.04,0.4977824 -1.04,0.6311116 0,0.5923874 4.7409366,4.628892 7.8429639,6.6776174 6.495397,4.2898677 11.42667,6.2225657 16.962576,6.6480887 5.25503,0.403934 9.247817,-0.93252 12.496492,-4.182785 2.37191,-2.3730723 3.732512,-5.0061526 3.918989,-7.5841574 0.18928,-2.6167673 -0.07983,-3.4788253 -1.086003,-3.4788253 -0.460372,0 -0.727037,-0.1387483 -0.615018,-0.32000001 0.30455,-0.49277479 2.751398,-0.37948983 4.472912,0.20708841 0.941626,0.3208445 2.166259,1.1240531 3.129738,2.0527246 1.545283,1.4894539 1.577344,1.5585371 1.351865,2.9129115 -0.549629,3.3014787 -2.821571,7.4911192 -5.189849,9.5704952 -1.569764,1.378269 -4.605309,2.763506 -7.312685,3.337062 -2.396154,0.507623 -8.065668,0.579515 -10.351078,0.131256 z";

        return "  <path\n" +
                "     style=\"fill:#000000;stroke-width:0.31999999\"\n" +
                "     d=\"" + petastiePath + "\"\n" +
                "     id=\"petastie\"\n" +
                "     transform=\"translate("+ currentXPosition +","  + y + ")\"" +
                "     inkscape:connector-curvature=\"0\" />\n";

    }

    @Override
    public int getLength() {
        return PETASTIE_LENGTH;
    }

    public int getKlasmaCorrection() {
        return getLength()/2 - 10;
    }

    @Override
    public String toString() {
        return "Petastie{}";
    }
}
