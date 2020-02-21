package org.orthodoxmusic.apodeipnon.pdfutils;

import org.apache.pdfbox.multipdf.PDFMergerUtility;

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

    static List<URL> canon_noel_symeon_ton1_files;


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

    private static final String CANON_NOEL_SYMEON_TON1 = "canon_noel_symeon_ton1.pdf";


    static {
        try {

            canon_noel_symeon_ton1_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode1_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode3_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\canon_noel_cathisme_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode4_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode5_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode6_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode7_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode8_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\canon_noel_ode9_ton1.pdf").toURI().toURL()
            ));

            vepres_ton1_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieA.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anixandaria_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme_vepres_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieB.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\lucernaire_symeon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieC.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\lumiere_joyeuse_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\prokimeinon_vepres_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieD.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieE.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\apolytikion_symeon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\theotokion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieF.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieG.pdf").toURI().toURL()
                    ));

            vepres_ton2_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\vepres-ton2-partieA.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anixandaria_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme_vepres_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieB.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\lucernaire_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\vepres-ton2-partieC.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\lumiere_joyeuse_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\prokimeinon_vepres_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieD.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\vepres-ton2-partieE.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\apolytikion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\theotokion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieF.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieG.pdf").toURI().toURL()
            ));

            vepres_ton3_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\vepres-ton3-partieA.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anixandaria_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme_vepres_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieB.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\lucernaire_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\vepres-ton3-partieC.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\lumiere_joyeuse.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\prokimeinon_vepres_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieD.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\vepres-ton3-partieE.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\apolytikion_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\theotokion_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieF.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieG.pdf").toURI().toURL()
            ));

            vepres_ton4_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\vepres-ton4-partieA.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anixandaria_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme_vepres_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieB.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\lucernaire_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\vepres-ton4-partieC.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\lumiere_joyeuse.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\prokimeinon_vepres_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieD.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\vepres-ton4-partieE.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\apolytikion_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\theotokion_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieF.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieG.pdf").toURI().toURL()
            ));

            vepres_ton5_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\vepres-ton5-partieA.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anixandaria_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme_vepres_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieB.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\lucernaire_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\vepres-ton5-partieC.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\lumiere_joyeuse_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\prokimeinon_vepres_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieD.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\vepres-ton5-partieE.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\apolytikion_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\theotokion_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieF.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieG.pdf").toURI().toURL()
            ));

            vepres_ton7_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\vepres-ton7-partieA.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anixandaria_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme_vepres_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieB.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\lucernaire_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\vepres-ton7-partieC.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\lumiere_joyeuse_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\prokimeinon_vepres_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieD.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\vepres-ton7-partieE.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\apolytikion_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\theotokion_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieF.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\vepres-ton1-partieG.pdf").toURI().toURL()
            ));

            matines_ton1_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\theos_kurios_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\apolytikion_symeon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\theotokion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\cathisme1_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\cathisme2_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\antiennes_orthros_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\magnificat_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\magnificat_symeon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\laudes_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\laudes_symeon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\theotokion_des_laudes_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\grande_doxologie_ton1.pdf").toURI().toURL()
            ));

            matines_ton2_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\theos_kurios_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\apolytikion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\theotokion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\cathisme1_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\cathisme2_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\antiennes_orthros_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\magnificat_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\magnificat_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\laudes_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\grande_doxologie_ton2.pdf").toURI().toURL()
            ));

            matines_ton3_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\theos_kurios_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\apolytikion_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\theotokion_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\cathisme1_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\cathisme2_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\antiennes_orthros_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\magnificat_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\laudes_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\grande_doxologie_ton3.pdf").toURI().toURL()
            ));

            matines_ton4_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\theos_kurios_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\apolytikion_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\theotokion_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\cathisme1_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\cathisme2_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\antiennes_orthros_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\magnificat_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\laudes_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\grande_doxologie_ton4.pdf").toURI().toURL()
            ));

            matines_ton5_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\theos_kurios_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\apolytikion_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\theotokion_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\cathisme1_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\cathisme2_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\antiennes_orthros_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\magnificat_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\laudes_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\grande_doxologie_ton5.pdf").toURI().toURL()
            ));

            matines_ton7_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\theos_kyrios_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\apolytikion_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\theotokion_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\cathisme1_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\cathisme2_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\antiennes_orthros_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\magnificat_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\laudes_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\grande_doxologie_ton7.pdf").toURI().toURL()
            ));

            matines_ton8_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\matines_completes_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\grande_ectenie_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\theos_kyrios_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\apolytikion_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\theotokion_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme1_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cathisme2_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\evlogitaires_2019_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\matines_completes_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\antiennes_orthros_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\matines_completes_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\tropaire_resurrection_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\matines_completes_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\glorificat_matines_symeon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\matines_completes_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\magnificat_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\matines_completes_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\laudes_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\matines_completes_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_doxologie_ton8.pdf").toURI().toURL()
            ));


            liturgie_ton1_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\psaume145_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\antienne2_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\beatitudes_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\venez_adorons_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\apolytikion_symeon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\tropaire_saints_joachim_anne_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\tropaire_saint_martin_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\kondakion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\trisagion_grec_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\alleluia_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\cherubikon_byzantion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\ectenie_apres_cherubikon_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\liturgika_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\anaphore_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\il_est_digne_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\memoires_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\un_seul_est_saint_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\kinonikon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\appel_communion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
                    ));


            /*
            liturgie_ton2_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\psaume145_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\antienne2_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\beatitudes_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\venez_adorons_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\apolytikion_liturgie_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\tropaire_saints_joachim_anne_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\tropaire_saint_martin_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\kondakion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\trisagion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\alleluia_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\cherubikon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\ectenie_apres_cherubikon_ton52.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\liturgika_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\anaphore_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\il_est_digne_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\memoires_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\un_seul_est_saint_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\kinonikon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\appel_communion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
            ));
            */

            liturgie_ton2_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\antienne1_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\antienne2_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\beatitudes_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\venez_adorons_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\apolytikion_liturgie_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\tropaire_sainte_clotilde_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\tropaire_sainte_rencontre_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\kondakion_sainte_clotilde_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\trisagion_grec_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\alleluia_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\cherubikon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\ectenie_apres_cherubikon_ton52.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\liturgika_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\anaphore_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\il_est_digne_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\memoires_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\un_seul_est_saint_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\kinonikon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\appel_communion_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_communion_ton135.pdf").toURI().toURL()
            ));


            liturgie_ton3_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\psaume145_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\antienne2_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\beatitudes_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\venez_adorons_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\apolytikion_liturgie_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\tropaire_saints_joachim_anne_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\tropaire_saint_martin_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\kondakion_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\trisagion_grec_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\alleluia_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\cherubikon_bref_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\cherubikon_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\ectenie_apres_cherubikon_ton53.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\liturgika_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\anaphore_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\il_est_digne_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\memoires_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\un_seul_est_saint_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\kinonikon_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\appel_communion_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\o_vierge_pure.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
            ));

            liturgie_ton4_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_symeon_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\psaume145_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\antienne2_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\beatitudes_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\venez_adorons_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\apolytikion_liturgie_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\tropaire_saints_joachim_anne_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_3\\tropaire_saint_martin_ton3.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\trisagion_grec_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\alleluia_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\cherubikon_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\ectenie_apres_cherubikon_ton54.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\liturgika_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\anaphore_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\il_est_digne_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\memoires_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\un_seul_est_saint_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kinonikon_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\appel_communion_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_communion_ton135.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
            ));

            liturgie_ton5_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_symeon_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_7\\psaume145_ton7.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\antienne2_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\beatitudes_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\venez_adorons_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\apolytikion_liturgie_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\tropaire_sainte_clotilde_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\kondakion_sainte_clotilde_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\kondakion_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\trisagion_grec_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\alleluia_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\cherubikon_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\ectenie_apres_cherubikon_ton55.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\liturgika_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\anaphore_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\il_est_digne_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\memoires_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\un_seul_est_saint_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\kinonikon_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\appel_communion_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_communion_ton135.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
            ));

            //pour la liturgie ton 6, prendre l'alleluia du père syméon
            //pour la liturgie ton 7, prendre l'alleluia du père syméon

            liturgie_ton8_files = new ArrayList<URL>(Arrays.asList(
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\liturgie_complete_A.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\roi_celeste_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_B.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\grande_ectenie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_C.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\psaume_102_liturgie.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_D.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\antienne2_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_E.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\beatitudes_symeon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_F.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\venez_adorons_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\apolytikion_liturgie_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\tropaire_sainte_clotilde_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_6\\kondakion_sainte_clotilde_ton6.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\kondakion_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_4\\kondakion_theotokos_ton4.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_G.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\trisagion_grec_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\liturgie_complete_H.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\alleluia_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_I.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\reponses_apres_evangiles_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_J.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\cherubikon_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_K.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\ectenie_apres_cherubikon_ton58.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\liturgika_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_L.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\anaphore_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_M.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\il_est_digne_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_N.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\memoires_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\ectenie_avant_notre_pere_ton1.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_O.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\un_seul_est_saint_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_P.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\kinonikon_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_Q.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_8\\appel_communion_ton8.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_symeon_ton168.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\nous_avons_vu_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_R.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_5\\que_nos_levres_ton5.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_S.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_2\\que_le_nom_du_seigneur_ton2.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\polyeleos_communion_ton135.pdf").toURI().toURL(),
                    new File("C:\\Users\\kloeblel\\Desktop\\perso\\partitions_lili\\ton_1\\liturgie_complete_T.pdf").toURI().toURL()
            ));

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    static List<URL> files = liturgie_ton2_files;
    static final String FILE_NAME = LITURGIE_TON2;

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

    public void printAllFiles(List<String> fileNames, String fileName) throws IOException {
        PDFPageCounter pageCounter = new PDFPageCounter();
        PDFMergerUtility merger = new PDFMergerUtility();
        for (String file : fileNames) {
            File pdfFile = new File(PDFCleaner.cleanPartition(file));
            merger.addSource(pdfFile);
        }
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(fileName));
        merger.setDestinationStream(outputStream);
        merger.mergeDocuments();
        File finalFile = new File(fileName);
        pageCounter.dostuff(finalFile.getAbsolutePath());

    }

}
