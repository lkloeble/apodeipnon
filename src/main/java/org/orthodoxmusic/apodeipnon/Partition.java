package org.orthodoxmusic.apodeipnon;

public class Partition {

    private Lines partitionLines;
    private String fileName;

    public Partition(Lines partitionLines, String fileName) {
        this.partitionLines=partitionLines;
        this.fileName=fileName;
    }

    public Lines getPartitionLines() {
        return partitionLines;
    }
}
