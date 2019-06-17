package org.orthodoxmusic.apodeipnon.pdfutils;

import org.apache.pdfbox.multipdf.PDFMergerUtility;
import org.orthodoxmusic.apodeipnon.pdfutils.PDFCleaner;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PDFMerger {

    static List<URL> matines_ton1_files;
    static List<URL> matines_ton2_files;
    static List<URL> matines_ton3_files;
    static List<URL> matines_ton4_files;
    static List<URL> matines_ton5_files;
    static List<URL> matines_ton6_files;
    static List<URL> matines_ton7_files;
    static List<URL> matines_ton8_files;

    static List<URL> vepres_ton1_files;
    static List<URL> vepres_ton2_files;
    static List<URL> vepres_ton3_files;
    static List<URL> vepres_ton4_files;
    static List<URL> vepres_ton5_files;
    static List<URL> vepres_ton6_files;
    static List<URL> vepres_ton7_files;
    static List<URL> vepres_ton8_files;

    static List<URL> liturgie_ton1_files;
    static List<URL> liturgie_ton2_files;
    static List<URL> liturgie_ton3_files;
    static List<URL> liturgie_ton4_files;
    static List<URL> liturgie_ton5_files;
    static List<URL> liturgie_ton6_files;
    static List<URL> liturgie_ton7_files;
    static List<URL> liturgie_ton8_files;


    private static final String MATINES_TON1 = "matines_completes_ton1.pdf";
    private static final String MATINES_TON2 = "matines_completes_ton2.pdf";
    private static final String MATINES_TON3 = "matines_completes_ton3.pdf";
    private static final String MATINES_TON4 = "matines_completes_ton4.pdf";
    private static final String MATINES_TON5 = "matines_completes_ton5.pdf";
    private static final String MATINES_TON6 = "matines_completes_ton6.pdf";
    private static final String MATINES_TON7 = "matines_completes_ton7.pdf";
    private static final String MATINES_TON8 = "matines_completes_ton8.pdf";

    private static final String VEPRES_TON1 = "vepres_completes_ton1.pdf";
    private static final String VEPRES_TON2 = "vepres_completes_ton2.pdf";
    private static final String VEPRES_TON3 = "vepres_completes_ton3.pdf";
    private static final String VEPRES_TON4 = "vepres_completes_ton4.pdf";
    private static final String VEPRES_TON5 = "vepres_completes_ton5.pdf";
    private static final String VEPRES_TON6 = "vepres_completes_ton6.pdf";
    private static final String VEPRES_TON7 = "vepres_completes_ton7.pdf";
    private static final String VEPRES_TON8 = "vepres_completes_ton8.pdf";

    private static final String LITURGIE_TON1 = "liturgie_complete_ton1.pdf";
    private static final String LITURGIE_TON2 = "liturgie_complete_ton2.pdf";
    private static final String LITURGIE_TON3 = "liturgie_complete_ton3.pdf";
    private static final String LITURGIE_TON4 = "liturgie_complete_ton4.pdf";
    private static final String LITURGIE_TON5 = "liturgie_complete_ton5.pdf";
    private static final String LITURGIE_TON6 = "liturgie_complete_ton6.pdf";
    private static final String LITURGIE_TON7 = "liturgie_complete_ton7.pdf";
    private static final String LITURGIE_TON8 = "liturgie_complete_ton8.pdf";


    static {
        try {
            matines_ton1_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\theos_kurios_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\apolytikion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\theotokion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\cathisme1_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\cathisme2_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\antiennes_orthros_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\magnificat_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\laudes_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\grande_doxologie_ton1.pdf").toURI().toURL()
            ));

            liturgie_ton1_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\antienne2_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\beatitudes_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\venez_adorons_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\apolytikion_liturgie_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_2\\tropaire_saints_joachim_anne_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_3\\tropaire_saint_martin_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\kondakion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\trisagion_grec_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\alleluia_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\cherubikon_byzantion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_5\\ectenie_apres_cherubikon_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_5\\liturgika_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\anaphore_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\il_est_digne_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\memoires_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\un_seul_est_saint_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\kinonikon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\appel_communion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\laurent.kloeble\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
                    ));


        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    static List<URL> files = liturgie_ton1_files;
    static final String FILE_NAME = LITURGIE_TON1;

    public static void main(String... args) throws IOException {

        PDFPageCounter pageCounter = new PDFPageCounter();
        PDFMergerUtility merger = new PDFMergerUtility();
        for (URL file : files) {
            File pdfFile = new File(PDFCleaner.cleanPartition(file.getPath()));
            merger.addSource(pdfFile);
        }
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(FILE_NAME));
        merger.setDestinationStream(outputStream);
        merger.mergeDocuments();
        File finalFile = new File(FILE_NAME);
        pageCounter.dostuff(finalFile.getAbsolutePath());
    }

}
