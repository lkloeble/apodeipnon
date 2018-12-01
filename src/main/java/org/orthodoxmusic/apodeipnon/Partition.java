package org.orthodoxmusic.apodeipnon;

public class Partition {

    private Lines partitionLines;
    private String fileName;
    private String title;
    private String toneLabel;

    public Partition(Lines partitionLines, String fileName) {
        this.partitionLines=partitionLines;
        this.fileName=fileName;
        extractMetaData();
    }

    private void extractMetaData() {
        this.title = partitionLines.getMetadata().get("title");
        this.toneLabel = partitionLines.getMetadata().get("tonelabel");
    }

    public Lines getPartitionLines() {
        return partitionLines;
    }


    public String getTitle() {
        return title;
    }

    public String getToneLabel() {
        return toneLabel;
    }
}
