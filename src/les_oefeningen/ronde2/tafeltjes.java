package les_oefeningen.ronde2;

public class tafeltjes {
    public static void main(String[] args) {
        System.out.println(" * |   1   2   3   4   5   6   7   8   9  10");
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= 10; i++) {

                System.out.printf("%4s", i + "|");

            for (int j = 1; j <= 10; j++) {

                /*if (i * j < 10) {
                    System.out.print("  ");
                }
                if (i * j < 100 && i * j >= 10) {
                    System.out.print(" ");
                }*/
                System.out.printf("%5s", i * j );
            }

            System.out.println();
        }
    }
}
