package org.orthodoxmusic.apodeipnon.pdfutils;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.util.Matrix;

import java.io.File;
import java.io.IOException;

public class PDFPageCounter {

    public void dostuff(String fileName) throws IOException {
        try (PDDocument doc = PDDocument.load(new File(fileName))) {
            PDFont font = PDType1Font.HELVETICA_BOLD;
            float fontSize = 10.0f;
            int pageNumber = 0;

            for (PDPage page : doc.getPages()) {
                pageNumber++;
                String pageNumberString = new Integer(pageNumber).toString();
                PDRectangle pageSize = page.getMediaBox();
                float stringWidth = font.getStringWidth(pageNumberString) * fontSize / 1000f;
                // calculate to center of the page
                int rotation = page.getRotation();
                boolean rotate = rotation == 90 || rotation == 270;
                float pageWidth = rotate ? pageSize.getHeight() : pageSize.getWidth();
                float pageHeight = rotate ? pageSize.getWidth() : pageSize.getHeight();
                float centerX = rotate ? pageHeight / 2f : (pageWidth - stringWidth) / 2f;
                float centerY = rotate ? (pageWidth - stringWidth) / 2f : pageHeight / 2f;

                centerX = pageWidth - 10;
                if(pageNumber >= 10) {
                    centerX -= 5;
                }
                centerY = 10;

                // append the content to the existing stream
                try (PDPageContentStream contentStream = new PDPageContentStream(doc, page, PDPageContentStream.AppendMode.APPEND, true, true)) {
                    contentStream.beginText();
                    // set font and font size
                    contentStream.setFont(font, fontSize);
                    // set text color to red
                    contentStream.setNonStrokingColor(0, 0, 0);
                    if (rotate) {
                        // rotate the text according to the page rotation
                        contentStream.setTextMatrix(Matrix.getRotateInstance(Math.PI / 2, centerX, centerY));
                    } else {
                        contentStream.setTextMatrix(Matrix.getTranslateInstance(centerX, centerY));
                    }
                    contentStream.showText(pageNumberString);
                    contentStream.endText();
                }
            }

            doc.save(fileName);
        }
    }
}
