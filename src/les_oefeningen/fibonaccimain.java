package les_oefeningen;

public class fibonaccimain {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int fibonaccigetal = 50;

        int currentNr = 0;
        int nextNr = 1;
        int getal;
        for (int i = 0; i < fibonaccigetal; i++) {
            getal = currentNr + nextNr;
            currentNr = nextNr;
            nextNr = getal;
        }
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Het fibonacci getal word gegeven in: " + duration + " ns");
    }
}