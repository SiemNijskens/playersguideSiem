package les_oefeningen.ronde1;

public class fibonaccigetal {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(fibonacci(5));

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Het fibonacci getal word gegeven in: " + duration + " ns");
    }

    public static int fibonacci(int n) {
        int currentNr = 0;
        int nextNr = 1;
        int getal;
        for (int i = 0; i < n; i++) {
            getal = currentNr + nextNr;
            currentNr = nextNr;
            nextNr = getal;
        }
        return currentNr;
    }
}