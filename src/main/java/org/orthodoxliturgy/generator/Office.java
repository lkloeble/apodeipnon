package org.orthodoxliturgy.generator;

import org.orthodoxliturgy.generator.offices.OfficeBlockOrder;

public abstract class Office {

    protected LiturgicalContext liturgicalContext;

    public Office(LiturgicalContext liturgicalContext) {
        this.liturgicalContext=liturgicalContext;
    }

    protected OfficeBlockOrder order = new OfficeBlockOrder();

    protected Office() {
    }

    protected String getStructuralOrder() {
        StringBuilder structureBuilder = new StringBuilder();
        for(Integer indice : order.getIndices()) {
            structureBuilder.append(order.getBlockByPosition(indice).getStructure());
            if(!order.isLastIndice(indice)) {
                structureBuilder.append("/");
            }
        }
        return structureBuilder.toString();
    }

    protected String getLiturgicalOrder() {
        StringBuilder structureBuilder = new StringBuilder();
        for(Integer indice : order.getIndices()) {
            String liturgicalStructure = order.getBlockByPosition(indice).getLiturgicalStructure();
            structureBuilder.append(liturgicalStructure);
            if(!order.isLastIndice(indice) && liturgicalStructure.length() > 0) {
                structureBuilder.append("/");
            }
        }
        return structureBuilder.toString();
    }

    protected String getInnerLiturgicalOrder() {
        StringBuilder structureBuilder = new StringBuilder();
        for(Integer indice : order.getIndices()) {
            String liturgicalStructure = order.getBlockByPosition(indice).getLiturgicalStructure();
            structureBuilder.append(liturgicalStructure);
            if(!order.isLastIndice(indice) && liturgicalStructure.length() > 0) {
                structureBuilder.append("/");
            }
        }
        return structureBuilder.toString();
    }

    protected String getAllContent() {
        StringBuilder contentBuilder = new StringBuilder();
        for(Integer indice : order.getIndices()) {
            String content = order.getBlockByPosition(indice).getContent();
            contentBuilder.append(content);
            contentBuilder.append("\n");
        }
        return contentBuilder.toString();
    }

    public OfficeBlockOrder getOrder() {
        return order;
    }

    public void injectLiturgicalOrder(LiturgicalContext liturgicalContext) {
        this.liturgicalContext=liturgicalContext;
    }
}
