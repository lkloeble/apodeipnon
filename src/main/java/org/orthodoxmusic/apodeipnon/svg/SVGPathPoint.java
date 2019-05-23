package org.orthodoxmusic.apodeipnon.svg;

public class SVGPathPoint {

    private float left;
    private float right;

    public SVGPathPoint(String pointDescription) {
        String[] points = pointDescription.split(",");
        if(points != null && points.length == 2) {
            left = Float.parseFloat(points[0]);
            right = Float.parseFloat(points[1]);
        } else {
            left = Float.parseFloat(points[0]);
        }
    }

    public SVGPathPoint translateLeft(float translation) {
        String translatedValue = "" + (left+translation) + "," + right;
        return new SVGPathPoint(translatedValue);
    }


    @Override
    public String toString() {
        return "SVGPathPoint{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }

    public String getFullPathFromData() {
        return left + "," + right;
    }
}
