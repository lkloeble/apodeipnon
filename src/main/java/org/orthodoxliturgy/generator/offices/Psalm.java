package org.orthodoxliturgy.generator.offices;

import org.orthodoxliturgy.generator.LiturgicalContext;
import org.orthodoxliturgy.generator.Office;

public class Psalm extends Office implements OfficeBlock {

    private static final String STRUCTURE = "PS";

    private int psalmNumber;

    public Psalm(LiturgicalContext context, int psalmNumber) {
        this.psalmNumber = psalmNumber;
    }

    @Override
    public String getStructure() {
        return STRUCTURE + psalmNumber;
    }

    @Override
    public String getLiturgicalStructure() {
        return STRUCTURE + psalmNumber;
    }

    @Override
    public String getInnerLiturgicalStructure() {
        return null;
    }

    @Override
    public String getContent() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<div class=\"psalmtitle\">").append("Psaume ").append(psalmNumber).append("</div>");
        stringBuilder.append("<br>");
        stringBuilder.append("<div class=\"psalmcontent\">");
        stringBuilder.append(getPsalmContentByNumber(psalmNumber));
        stringBuilder.append("</div>");
        return stringBuilder.toString();
    }

    private String getPsalmContentByNumber(int psalmNumber) {
        StringBuilder stringBuilder = new StringBuilder();
        switch (psalmNumber) {
            case 5:
                stringBuilder.append("2. Prête l’oreille à mes paroles, Seigneur, comprends mon cri;<br>");
                stringBuilder.append("3. sois attentif à la voix de ma supplication, ô mon Roi et mon Dieu, c’est toi que je prie, Seigneur.<br>");
                stringBuilder.append("4. Dès le matin, tu écouteras ma voix, dès le matin, je me présenterai devant toi et j’attendrai.<br>");
                stringBuilder.append("5. Car toi, tu n’es pas un Dieu qui aime l’iniquité, celui qui fait le mal ne saurait demeurer près de toi ;<br>");
                stringBuilder.append("6. ceux qui transgressent ta Loi ne sauraient tenir sous ton regard, tu détestes tous ceux qui commettent l’iniquité ;<br>");
                stringBuilder.append("7. tu fais périr tous les menteurs, le Seigneur exècre l’homme de sang et de ruse.<br>");
                stringBuilder.append("8. Mais moi, selon la surabondance de ta miséricorde, j’entrerai dans ta maison, pénétré de ta crainte, je me prosternerai en m’approchant de ton temple saint.<br>");
                stringBuilder.append("9. Seigneur, conduis-moi dans ta justice ; à cause de mes ennemis, rends droite devant moi la voie qui mène jusqu’à toi.<br>");
                stringBuilder.append("10. Car ils ne savent pas parler avec sincérité, leur gosier est un sépulcre béant, ils rusent avec leur langue.<br>");
                stringBuilder.append("11. Condamne-les, ô Dieu, qu’ils échouent dans leurs intrigues. À cause de la multitude de leurs impiétés, chasse-les, Seigneur, puisqu’ils t’ont irrité.<br>");
                stringBuilder.append("12. Et que se réjouissent tous ceux qui espèrent en toi, ils exulteront pour les siècles et tu habiteras au milieu d’eux ; qu’en toi se glorifient tous ceux qui aiment ton Nom,<br>");
                stringBuilder.append("13. car toi, tu béniras le juste ; comme d’une armure, Seigneur, tu nous as entourés de ta bienveillance.<br>");
                break;
            case 16:
                stringBuilder.append("1. Écoute, Seigneur, ma juste cause, sois attentif à ma supplication, prête l’oreille à ma prière qui ne vient pas de lèvres menteuses.<br>");
                stringBuilder.append("2. Qu’en ta présence me soit rendu un jugement favorable, puissent mes yeux voir ton équité.<br>");
                stringBuilder.append("3. Car tu as éprouvé mon coeur, tu l’as visité la nuit ; tu m’as éprouvé par le feu sans trouver en moi d’iniquité.<br>");
                stringBuilder.append("4. Ma bouche n’a pas parlé selon les oeuvres des hommes ; à cause des paroles de tes lèvres, j’ai suivi des voies difficiles.<br>");
                stringBuilder.append("5. Affermis mes pas sur tes sentiers pour que mes pieds ne chancellent pas.<br>");
                stringBuilder.append("6. J’ai crié, ô Dieu, car tu m’as exaucé ; incline vers moi ton oreille, écoute ce que je dis.<br>");
                stringBuilder.append("7. Que tes miséricordes se révèlent admirables, toi qui sauves ceux qui espèrent en toi contre ceux qui résistent à ta droite.<br>");
                stringBuilder.append("8. Garde-moi comme la prunelle de l’oeil, à l’abri de tes ailes, abrite-moi<br>");
                stringBuilder.append("9. loin des impies qui m’affligent, de mes ennemis qui ont cerné mon âme ;<br>");
                stringBuilder.append("10. ils se sont rengorgés dans leur graisse, et leur bouche parle avec arrogance.<br>");
                stringBuilder.append("11. Après m’avoir rejeté, maintenant ils me cernent, ils sont sur mes traces<br>");
                stringBuilder.append("12. pour se jeter sur moi comme un lion en chasse, comme un lionceau tapi en embuscade.<br>");
                stringBuilder.append("13. Lève-toi, Seigneur, devance-les et fais-les trébucher, délivre mon âme de l’impie, arrache ton épée des mains de tes ennemis.<br>");
                stringBuilder.append("14. Seigneur, retranche-les en plein milieu de leur vie, ceux dont tu as rempli le sein de tes trésors, qui ont été rassasiés de fils et qui ont laissé leur surplus à leurs petits-enfants.<br>");
                stringBuilder.append("15. Moi, dans la justice, je paraîtrai devant ta face, et je serai rassasié quand paraîtra ta gloire.<br>");
                break;
            case 24:
                stringBuilder.append("1. Vers toi, Seigneur, j’élève mon âme, ô mon Dieu !<br>");
                stringBuilder.append("2. En toi je me confie, que je ne sois pas couvert de honte et que mes ennemis ne se moquent pas de moi !<br>");
                stringBuilder.append("3. Car ceux qui t’attendent avec persévérance ne seront jamais confondus, mais que soient couverts de honte ceux qui commettent l’iniquité sans raison.<br>");
                stringBuilder.append("4. Seigneur, fais-moi connaître tes voies, enseigne-moi tes sentiers.<br>");
                stringBuilder.append("5. Conduis-moi selon ta vérité, enseigne-moi que tu es Dieu, le Dieu qui me sauve, toi que je n’ai cessé d’attendre.<br>");
                stringBuilder.append("6. Souviens-toi, Seigneur, de tes compassions, de tes miséricordes car elles sont éternelles.<br>");
                stringBuilder.append("7. Ne te souviens pas des péchés de ma jeunesse ni de mes fautes d’ignorance, mais, en raison de ta mansuétude, Seigneur, souviens-toi de moi selon ta bonté.<br>");
                stringBuilder.append("8. Le Seigneur est bonté et droiture, aussi donne-t-il aux pécheurs une loi pour bien se conduire.<br>");
                stringBuilder.append("9. Il guide les doux dans la justice, aux doux il enseigne ses voies.<br>");
                stringBuilder.append("10. Pour ceux qui cherchent son alliance et ses témoignages, toutes les voies du Seigneur sont miséricorde et vérité.<br>");
                stringBuilder.append("11. À cause de ton Nom, Seigneur, pardonne mon péché car il est grand.<br>");
                stringBuilder.append("12. Un homme craint-il le Seigneur ? Il le guide par sa Loi dans la voie qu’il a choisie ;<br>");
                stringBuilder.append("13. alors son âme reposera dans le bonheur et sa descendance possédera la terre en héritage.<br>");
                stringBuilder.append("14. Le Seigneur est le ferme appui de ceux qui le craignent, il leur manifeste son alliance.<br>");
                stringBuilder.append("15. Sans cesse mes yeux sont tournés vers le Seigneur, car c’est lui qui retirera mes pieds du filet.<br>");
                stringBuilder.append("16. Regarde-moi, fais-moi miséricorde, solitaire et pauvre que je suis.<br>");
                stringBuilder.append("17. Les angoisses de mon coeur se sont accrues, arrache-moi à ce qui m’oppresse.<br>");
                stringBuilder.append("18. Vois mon humiliation et ma peine, pardonne-moi tous mes péchés.<br>");
                stringBuilder.append("19. Vois combien sont nombreux mes ennemis, et de quelle haine injuste ils me haïssent.<br>");
                stringBuilder.append("20. Garde mon âme, délivre-moi, que je ne sois pas couvert de honte pour avoir mis en toi mon espérance.<br>");
                stringBuilder.append("21. Ceux qui sont intègres et droits se sont attachés à moi, car je t’ai attendu, Seigneur.<br>");
                stringBuilder.append("22. Ô Dieu, rachète Israël de toutes ses tribulations !<br>");
                break;
            case 50:
                stringBuilder.append("3. Fais-moi miséricorde, ô Dieu, selon ta grande miséricorde, selon la surabondance de tes compassions, efface mon iniquité.<br>");
                stringBuilder.append("4. Lave-moi tout entier de mon iniquité, de mon péché purifie-moi.<br>");
                stringBuilder.append("5. Car mon iniquité, je la connais, mon péché est constamment devant moi.<br>");
                stringBuilder.append("6. Contre toi, toi seul, j’ai péché, ce qui est mal à tes yeux, je l’ai fait. Ainsi, tu seras reconnu juste en tes paroles, vainqueur si l’on te met en jugement.<br>");
                stringBuilder.append("7. Vois, dans l’iniquité j’ai été conçu, dans les péchés ma mère m’a enfanté.<br>");
                stringBuilder.append("8. Mais tu aimes la vérité, tu m’as révélé les mystères et les secrets de ta sagesse.<br>");
                stringBuilder.append("9. Tu m’aspergeras avec l’hysope et je serai purifié, tu me laveras et je deviendrai plus blanc que la neige.<br>");
                stringBuilder.append("10. Tu me feras entendre des paroles de joie et d’allégresse et les os humiliés exulteront.<br>");
                stringBuilder.append("11. Détourne ta face de mes péchés, efface toutes mes iniquités.<br>");
                stringBuilder.append("12. Ô Dieu, crée en moi un coeur pur, renouvelle en mon sein un esprit de droiture.<br>");
                stringBuilder.append("13. Ne me rejette pas loin de ta face, ne retire pas de moi ton Esprit saint.<br>");
                stringBuilder.append("14. Rends-moi la joie de ton salut, fortifie-moi par l’Esprit souverain.<br>");
                stringBuilder.append("15. Aux pécheurs j’enseignerai tes voies, et les impies retourneront vers toi.<br>");
                stringBuilder.append("16. Délivre-moi du sang, ô Dieu, Dieu de mon salut ; en ta justice ma langue exultera.<br>");
                stringBuilder.append("17. Seigneur, ouvre mes lèvres et ma bouche annoncera ta louange.<br>");
                stringBuilder.append("18. Si tu avais voulu un sacrifice, je te l’aurais offert, mais tu ne prends aucun plaisir aux holocaustes.<br>");
                stringBuilder.append("19. Un sacrifice pour Dieu, c’est un esprit brisé ; un coeur brisé et humilié, Dieu ne le méprise pas.<br>");
                stringBuilder.append("20. Dans ta bienveillance, Seigneur, accorde à Sion tes bienfaits et que soient rebâtis les murs de Jérusalem.<br>");
                stringBuilder.append("21. Alors tu prendras plaisir au sacrifice de justice, à l’oblation et aux holocaustes, alors on consumera de jeunes taureaux sur ton autel.<br>");
                break;
            case 89:
                stringBuilder.append("1. Seigneur, tu as été pour nous un refuge de génération en génération.<br>");
                stringBuilder.append("2. Avant que soient nées les montagnes, façonnés la terre et le monde, d’éternité en éternité, tu es.<br>");
                stringBuilder.append("3. Ne laisse pas l’homme dans l’humiliation, toi qui as dit : « Revenez, fils des hommes. »<br>");
                stringBuilder.append("4. Car mille ans sont à tes yeux comme le jour d’hier qui n’est plus, comme une veille de la nuit.<br>");
                stringBuilder.append("5. Les années de l’homme sont peu de choses ; en un matin, elles passent comme l’herbe<br>");
                stringBuilder.append("6. qui, en un matin, fleurit et passe et, le soir, se flétrit, durcit et se dessèche.<br>");
                stringBuilder.append("7. Car sous ta colère nous avons défailli, à cause de ta fureur, nous avons été effrayés.<br>");
                stringBuilder.append("8. Tu as mis nos iniquités devant toi, notre vie sous la lumière de ta face.<br>");
                stringBuilder.append("9. C’est pourquoi tous nos jours se sont évanouis ; sous ta colère nous avons défailli ; nous passons nos années à nous épuiser comme l’araignée.<br>");
                stringBuilder.append("10. Le temps de nos années : soixante-dix ans, quatre-vingts pour les plus robustes, et leur grand nombre n’est que labeur et peine, puis surviennent la faiblesse et les afflictions.<br>");
                stringBuilder.append("11. Qui connaîtra la force de ta colère, et, dans la crainte, mesurera ta fureur ?<br>");
                stringBuilder.append("12. Fais-nous reconnaître ta droite, qu’ainsi nos coeurs acquièrent la sagesse.<br>");
                stringBuilder.append("13. Reviens, Seigneur, jusques à quand ? Assiste tes serviteurs.<br>");
                stringBuilder.append("14. Au matin nous avons été comblés de ta miséricorde et nous avons été dans la joie et l’allégresse tous les jours de notre vie.<br>");
                stringBuilder.append("15. Nous avons été remplis de joie pour les jours où tu nous as humiliés, pour les années où nous connûmes le malheur.<br>");
                stringBuilder.append("16. Jette les yeux sur tes serviteurs et sur tes oeuvres et guide leurs fils.<br>");
                stringBuilder.append("17. Que la splendeur du Seigneur notre Dieu soit sur nous. Dirige d’en haut les oeuvres de nos mains ; oui, dirige les oeuvres de nos mains.<br>");
                break;
            case 100:
                stringBuilder.append("1. Pour toi, Seigneur, je chanterai la miséricorde et la justice.<br>");
                stringBuilder.append("2. Je psalmodierai et j’aurai l’intelligence d’une conduite intègre ; quand viendras-tu vers moi ? Au milieu de ma maison j’ai marché dans l’innocence de mon coeur.<br>");
                stringBuilder.append("3. Je n’ai rien placé devant mes yeux de contraire à la Loi, j’ai haï ceux qui la transgressent.<br>");
                stringBuilder.append("4. L’homme au coeur retors ne s’est pas attaché à moi, j’ai ignoré et tenu à l’écart le méchant.<br>");
                stringBuilder.append("5. J’ai chassé celui qui dénigre en secret son prochain ; je n’ai pas mangé avec l’homme au regard orgueilleux et au coeur insatiable.<br>");
                stringBuilder.append("6. C’est sur des gens du pays dignes de foi que j’ai porté les yeux pour les faire siéger avec moi ; j’ai pris pour intendant celui qui se conduisait de manière intègre.<br>");
                stringBuilder.append("7. Mais celui qui agissait avec arrogance n’a pas habité ma maison, celui qui proférait l’injustice n’a pas trouvé grâce à mes yeux.<br>");
                stringBuilder.append("8. Dès le matin, je fais mettre à mort tous les pécheurs du pays, afin d’exterminer de la Cité du Seigneur tous ceux qui commettent l’iniquité.<br>");
                break;
            default:
                stringBuilder.append("still unknown psalm");
        }
        return stringBuilder.toString();
    }

}
