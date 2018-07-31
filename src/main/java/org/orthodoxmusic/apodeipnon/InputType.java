package org.orthodoxmusic.apodeipnon;

public enum InputType {

    TEXT, NEUMES, NEW_BLOCK, UNKNOWN;

    public static InputType getValueByKeyboardInput(String keyboardInput) {
        if("1".equals(keyboardInput)) return TEXT;
        else if("2".equals(keyboardInput)) return NEUMES;
        else if("Up".equals(keyboardInput)) return NEUMES;
        else if("Right".equals(keyboardInput)) return NEW_BLOCK;

        return UNKNOWN;
    }
}
