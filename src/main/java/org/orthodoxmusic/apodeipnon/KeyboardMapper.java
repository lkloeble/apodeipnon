package org.orthodoxmusic.apodeipnon;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class KeyboardMapper {
/*
    private boolean enableMapping;
    private Map<String, String> keyboardMapping = new HashMap<String, String>();

    public KeyboardMapper(boolean enableMapping) throws IOException {
        this.enableMapping = enableMapping;
        if(enableMapping) init();
    }

    private void init() throws IOException {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("mapping.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
        while(bufferedReader.ready()) {
            String line = bufferedReader.readLine();
            if(line == null || line.indexOf("=>") <= 0) continue;
            String[] elements = line.split("=>");
            keyboardMapping.put(elements[0],elements[1]);
        }
    }

    public String getMapping(KeyCode keyCode) {
        if(!enableMapping || !keyboardMapping.containsKey(keyCode.getName())) return keyCode.getName();
        return keyboardMapping.get(keyCode.getName());
    }
    */
}
