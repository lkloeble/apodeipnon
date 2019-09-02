package org.orthodoxliturgy.generator;

import org.orthodoxliturgy.generator.offices.OfficeBlock;
import org.orthodoxliturgy.generator.offices.Prime;

public class Generator {

    private LiturgicalContext liturgicalContext;

    public Generator(LiturgicalContext liturgicalContext) {
        this.liturgicalContext = liturgicalContext;
    }

    public OfficeBlock buildOffice() {
        switch(liturgicalContext.getOfficeType()) {
            case PRIME:
            return new Prime(liturgicalContext);
        }
        return null;
    }
}
