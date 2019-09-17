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
