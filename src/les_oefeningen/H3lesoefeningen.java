package les_oefeningen;

public class H3lesoefeningen {
    public static void main(String[] args) {
/*        String naam = new String ("Paul");
        System.out.println(naam.charAt(0));
        System.out.println(naam.charAt(2));
        System.out.println(naam.charAt(10));*/

       /* String letters = "ABCAB";

        System.out.println(letters.indexOf('B'));    // 1

        System.out.println(letters.indexOf('S'));    // -1

        System.out.println(letters.indexOf("CA"));   // ?

        System.out.println(letters.indexOf('B', 2)); // ?*/
/*
        String examen = "Oracle";
        String sub = examen.substring(2);
        System.out.println(sub); // acle

        String resultaat = examen.substring(2, 4);

        System.out.println(resultaat); // ac*/
        //String letters = "ABCAB";

        //System.out.println(letters.replace('B', 'b'));   // AbCAb
/*
        String woord = new String("kok");
        String nieuwWoord = new String("");
        for (int i = 0; i < woord.length(); i++) {

            nieuwWoord += woord.charAt((woord.length() - i) - 1);

        }
        System.out.println(nieuwWoord);
        System.out.println(woord);


        if (nieuwWoord.equals(woord)) {
            System.out.println("het is een palindroom");


        }*/

        StringBuilder sb1 = new StringBuilder("123");

        char[] naam = {'J', 'a', 'v', 'a'};

        sb1.insert(2, naam, 0, 2);

        System.out.println(sb1); // ?


    }
}
