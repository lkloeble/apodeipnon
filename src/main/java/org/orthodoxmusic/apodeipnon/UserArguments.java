package org.orthodoxmusic.apodeipnon;

public class UserArguments {

    private boolean withMapping;

    public UserArguments(String[] args) {
        if(args == null) return;
        for(String arg : args) {
            if("mapping".equals(arg)) {
                withMapping = true;
            }
        }
    }

    public boolean hasMapping() {
        return withMapping;
    }
}
