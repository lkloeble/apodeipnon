package org.orthodoxmusic.apodeipnon.neumes;

public enum BassIsonValue {

    GA("ga",915),
    PA("pa",928),
    NH("nh",925);

    private String value;
    private Integer unicode;

    BassIsonValue(String value, Integer unicode) {
        this.unicode = unicode;
        this.value=value;
    }

    public String getValue() {
        return value;
    }

    public Integer getUnicode() {
        return unicode;
    }
}
