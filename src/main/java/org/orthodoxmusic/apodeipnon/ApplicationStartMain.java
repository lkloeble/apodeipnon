package org.orthodoxmusic.apodeipnon;

import java.io.File;

public class ApplicationStartMain {

    GrammarFileReader grammarFileReader = new GrammarFileReader();
    DirectoryHolder directoryHolder = new DirectoryHolder();
    SVGProducer svgProducer = new SVGProducer();
    PDFProducer pdfProducer = new PDFProducer();

    public static void main(String[] args) {
        System.out.println("this is the new Apodeipnon");
        ApplicationStartMain Main = new ApplicationStartMain();
        if(args == null || args.length == 0) {
            System.out.println("nothing to process. Exiting...");
            return;
        }
        Main.processScore(args);
    }

    public void processScore(String[] args) {
        for(String arg : args) {
            System.out.println("processing " + arg);
            if(!directoryHolder.exist(arg)) {
                System.out.println(arg + " is unreachable");
                continue;
            }
            Partition partition = grammarFileReader.process(arg);
            SVGPartition svgPartition = svgProducer.produceSvg(partition);
            System.out.println(svgPartition.getStringJoiner());
            File pdfPartitionResult = pdfProducer.producePdf(svgPartition);
            if(!directoryHolder.exist(pdfPartitionResult)) {
                System.out.println("problem creating pdf score file for " + arg);
            } else {
                System.out.println("score created");
            }
        }
    }

}
