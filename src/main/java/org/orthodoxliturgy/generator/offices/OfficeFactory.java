package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class OfficeFactory {

    public Office createOffice(LiturgicalContext liturgicalContext) {
        switch(liturgicalContext.getOfficeType()) {
            case PRIME:
                return new Prime(liturgicalContext);
        }
        return null;
    }
}
