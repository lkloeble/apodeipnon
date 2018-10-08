package org.orthodoxmusic.apodeipnon;

public enum InputType {

    TEXT, NEUMES, UNKNOWN;

    public static InputType getInputType(String value) {
        if(value == null) return UNKNOWN;
        else if(value.toLowerCase().startsWith("text")) return TEXT;
        else if(value.toLowerCase().startsWith("neum")) return NEUMES;
        return UNKNOWN;

    }

}
