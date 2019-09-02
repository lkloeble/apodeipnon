package org.orthodoxmusic.apodeipnon.pdfutils;

import java.awt.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;


import java.io.File;
import java.io.IOException;


public class PDFCleaner {

    public static String cleanPartition(String filePath) throws IOException {
        PDDocument document = PDDocument.load(new File(filePath));
        String savePath = changePath(filePath);
        document = cleanBottom(document, savePath);
        cleanUp(document, savePath);
        return savePath;
    }

    private static String changePath(String path) {
        String withoutPdfExtension = path.substring(0, path.length() - 4);
        return withoutPdfExtension + "_merge.pdf";
    }

    private static PDDocument cleanBottom(PDDocument document, String savePath) throws IOException {
        int pageNumbers = document.getNumberOfPages();
        PDPage page = null;
        page = document.getPage(pageNumbers - 1);
        int yInDocument = 0;
        if (pageNumbers == 0) {
            yInDocument = 1100;
        }
        PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, false);
        contentStream.setNonStrokingColor(Color.WHITE);
        if (savePath.contains("antienne2")) {
            System.out.println("cas de l'antienne");
            yInDocument -= 20;
        } else if (savePath.contains("cathisme2")) {
            System.out.println("cas du cathisme2");
            yInDocument -= 20;
        } else if (savePath.contains("kinonikon")) {
            System.out.println("cas du kinonikon");
            yInDocument -= 20;
        }
        contentStream.addRect(0, yInDocument, 1000, 50);
        contentStream.fill();
        contentStream.close();
        document.save(savePath);
        return document;
    }

    private static PDDocument cleanUp(PDDocument document, String savePath) throws IOException {
        int pageNumbers = document.getNumberOfPages();
        PDPage page = null;
        for(int indicePage=1;indicePage<=pageNumbers;indicePage++) {
            page = document.getPage(indicePage-1);
            PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, false);
            contentStream.setNonStrokingColor(Color.WHITE);
            contentStream.addRect(25, 818, 10, 10);
            contentStream.fill();
            contentStream.close();
        }
        document.save(savePath);
        document.close();
        return document;
    }

}

