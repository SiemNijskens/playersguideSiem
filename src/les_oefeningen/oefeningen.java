package les_oefeningen;

// import java.util.Scanner;

public class oefeningen {
    public static void main(String[] args) {
          /*  Scanner scanner = new Scanner (System.in);
            System.out.println("hoeveel jaren?");
            int jaar = scanner.nextInt();
            int jaarnaarmin = jaar*365*24*60;
            System.out.println("er zitten " + jaarnaarmin + " minuten in " + jaar + " jaren");

            System.out.println("hoeveel maanden?");
            int maand = scanner.nextInt();
            int maandnaarmin = maand*30*24*60;
            System.out.println("er zitten " + maandnaarmin + " minuten in " + maand + " maanden");

            System.out.println("hoeveel weken?");
            int week = scanner.nextInt();
            int weeknaarmin = week*7*24*60;
            System.out.println("er zitten " + weeknaarmin + " minuten in " + week + " weken");

            System.out.println("hoeveel dagen?");
            int dag = scanner.nextInt();
            int dagnaarmin = dag*24*60;
            System.out.println("er zitten " + dagnaarmin + " minuten in " + dag + " dagen");

            System.out.println("hoeveel uren?");
            int uur = scanner.nextInt();
            int uurnaarmin = uur*24*60;
            System.out.println("er zitten " + uurnaarmin + " minuten in " + uur + " uren");

            int totaal = jaarnaarmin+maandnaarmin+weeknaarmin+dagnaarmin+uurnaarmin;
            System.out.println("er zitten in totaal " + totaal + " minuten in de opgegeven tijdsperiode");
        Scanner scanner = new Scanner(System.in);
*/
/*        System.out.println("gebruik je celcius (ja of nee antwoorden graag)");
        String celcius = scanner.nextLine();

        if (celcius.equals("ja")) {
            System.out.println("hoeveel graden is het?");
            double tempC = scanner.nextDouble();
            double tempF = (tempC * 1.8) + 32;
            System.out.println("in farenheit is dit " + tempF + " graden");
        } else {
            System.out.println("hoeveel graden is het?");
            double tempF2 = scanner.nextDouble();
            double tempC2 = (tempF2 - 32) * ((double) 5 /9);
            System.out.println("in celcius is dit " + tempC2 + " graden");
            }
            }

            */

        //°F = (°C x 1.8) + 32
        //C = (°F - 32) x (5/9)

        /*System.out.println("wat is de afstand in meter");
        int invoerAfstand = scanner.nextInt();
        System.out.println("wat zijn de uren van de tijd");
        int invoerUur = scanner.nextInt();
        System.out.println("wat zijn de minuten van de tijd");
        int invoerMinuten = scanner.nextInt();
        System.out.println("wat zijn de seconden van de tijd");
        int invoerSeconden = scanner.nextInt();

        double tijdUur = invoerUur + invoerMinuten/60d + invoerSeconden/3600d;
        int tijdSeconden = invoerUur*3600 + invoerMinuten * 60 + invoerSeconden;
        double tijdUur2 = (double)tijdSeconden/3600d;

        System.out.println(tijdUur);
        System.out.println(tijdSeconden);

        double snelheidMS = invoerAfstand/(double)tijdSeconden;
        System.out.println("je snelheid is " + snelheidMS + " meter/seconden");

        double snelheidkmu = invoerAfstand/1000d/tijdUur2;
        System.out.println("je snelheid is " + snelheidkmu + " kilometer/uur");

        double snelheidmph = invoerAfstand/1609d/tijdUur2;
        System.out.println("je snelheid is " + snelheidmph + " mijl/uur");*/





 /*       String browser = scanner.next();

        switch (browser) {
            case "Edge":
                System.out.println("Je gebruikt Edge");
                break;
            case "Chrome":
            case "Firefox":
            case "Opera":
                System.out.println("Je gebruikt een moderne browser");
                break;
            case "IE":
                System.out.println("Waarom gebruik je in godsnaam Internet Explorer");
                break;
            default:
                System.out.println("Je gebruikt een niet-ondersteunde browser");
        }*/

        /*if (start>=stop) {
            System.out.println(start);
            return start + countdown(start - 1, stop);
        }
        return stop;*/

        System.out.println(fibonacci(48));

    }
    public static int fibonacci(int n) {
        int currentNr = 0;
        int nextNr = 1;

        for (int i = 0; i < n; i++) {
            int getal = currentNr + nextNr;
            currentNr = nextNr;
            nextNr=getal;

        }
        return currentNr;
    }
}