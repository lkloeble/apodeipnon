package org.orthodoxmusic.apodeipnon.neumes;

import org.orthodoxmusic.apodeipnon.TextLinePositions;

public class Hyporroie extends Neume {

    private static int HYPORROIE_LENGTH = 27;

    public Hyporroie() {
        height = 18;
        xSpaceBetweenNeume = 15;
    }

    @Override
    public String getNeumeSVG(TextLinePositions textLinePositions, int positionInSentence, int currentXPosition, int maxHeight) {
        this.xStart = currentXPosition;
        int y = maxHeight - height + 20;
        return "<image hyporroie x=\"" + currentXPosition + "\" y=\""  + y + "\" width=\"26.56\" height=\"18.24\" image-rendering=\"optimizeQuality\" preserveAspectRatio=\"none\" xlink:href=\"data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAFMAAAA5CAYAAABK3Rc8AAAABmJLR0QAAAAAAAD5Q7t/AAAACXBI WXMAAC4jAAAuIwF4pT92AAAAB3RJTUUH4goKDCsiGF+tBQAAABl0RVh0Q29tbWVudABDcmVhdGVk IHdpdGggR0lNUFeBDhcAAAMzSURBVHja7ZwxSyNBFMf/HjZpRfEDCKlEJDBgYWpJNRCstrCar7Dg F9jKclubtbBLIaTZYOekXgg2YyHCgli4lrPlXJWIB3c5c/N2ZnbvQSAhZDL74//mzcx7M1vGGIOO 2sfHB97f3wEAWms8Pz+v/c3h4eHq/e7uLnZ2dlaft9sOrK5rlGWJl5cXvL294fHxEU9PT7i7u7PS PmMMFxcXiKKofTDruoZSCovFAg8PD7i+vrb+H5xzjMdjHB0d4fj4+PML0wLTWhsppUmSxAAgeXHO TZZlpizL3/YjaJhFUZACZIyZNE3/CDB4mFJKwzkngyiEMFLKb/cL/yF+dWWl1Mb9CwKmUsoIIUgh bqLE4GBmWUYGEYDJssxora301VuYVVWRqpEx9k8uHQzMsiwNY4w0wNhSo9cwpZRBgvQOZqiK9A6m 1po8YlOC9AomZdRmjP31KiZ4mEop0ulPnueNPIcXMCndO0mSxp7DOUwpJal7V1XVHZiUa+2m3NsL mJSqFEI0/jxoqyptLxW9hkmpyjiOnTyTM5iUEbzJoOMcJuW8ssmp0K/2w0UGcTabkbV9fn7uLjXq Yp+ybWOlM2VOp1OytqMocpu0b3pniGqLjXPufFncKEzK6ZCNhFhQMKkm6T6oslGYlNMhH1TZaACi KKBaVqENBgM/qsZCnw5NJhNvcliNKPP29pZMlaPRyJtyRnKYdV3j5uaGpO3Ly0v0ej1/ikOppT+Z TMhcnDrb6J2bU6kyTVO/VAlgyxi6AwLz+Rynp6ckbVdV9aU4v/Vj5tXVFZkqfQNJOmZSLR0ZY96N leRjJpUqvYvg1MrM8zzYeiGv1uaU22xFURifzTpMqqMkLnM7TmAWRdG5oEMCs8vubR0mVR7cp12h RmCmaUp2rCQkg48gGWPBuLY1mBQgbR5yCgKm1tr6FChNU2c1Qs5gKqWsZhnbAPHbMKuqsqZGzrnJ 8zxYd94YplLKytgohFh7k0DotrqjY3mTyvIWldfXV9zf3298MYgQAsPhEAcHBxgMBv7u9Fi07dls hrOzs40biOMYAHBycoL9/X3s7e2h3++ji/YlbbG8tmaddRXWOvsJHlDI0tkeVVkAAAAASUVORK5C YII= \"/>\n";
    }

    @Override
    public int getGorgonCorrection() {
        return  -20;
    }

    @Override
    public int getLength() {
        return HYPORROIE_LENGTH;
    }

    @Override
    public String toString() {
        return "Hyporroie{}";
    }

}
