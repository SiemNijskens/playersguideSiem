package les_oefeningen.ronde1;

public class fibonaccimain {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int fibonaccigetal = 52;

        int currentNr = 0;
        int nextNr = 1;
        int getal = 0;
        for (int i = 0; i < fibonaccigetal; i++) {
            getal = currentNr + nextNr;
            currentNr = nextNr;
            nextNr = getal;
        }
        System.out.println(getal);
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Het fibonacci getal word gegeven in: " + duration + " ns");
    }
}