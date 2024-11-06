import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean lampIsAan = true;

        Scanner scanner = new Scanner (System.in);

        if (lampIsAan) {
            System.out.println("de lamp is aan");
        } else {
            System.out.println("de lamp is uit");
        }

        System.out.println("wil je op de lamp schakelaar drukken (ja of nee graag)");
        String keuze = scanner.nextLine();
        if (keuze.equals("ja"))
            lampIsAan = lampknopje(lampIsAan);
        else{

        }


/*        lampIsAan = zetLampAan(lampIsAan);
        lampIsAan = zetLampUit(lampIsAan);
        lampIsAan = lampknopje(lampIsAan);*/


        if (lampIsAan) {
            System.out.println("de lamp is aan");
        } else {
            System.out.println("de lamp is uit");
        }
    }

    static boolean lampknopje(boolean lampIsAan) {
        if (lampIsAan == true) {
            return false;
        } else {
            return true;
        }

    }

    static boolean zetLampAan(boolean lampIsAan) {
        if (lampIsAan == true) {
            System.out.println("lamp staat al aan");
        }
        return true;
    }


    static boolean zetLampUit(boolean lampIsAan) {
        if (lampIsAan == false)
            System.out.println("lamp is al uit");
        return false;
    }
}

