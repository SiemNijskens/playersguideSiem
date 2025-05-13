package les_oefeningen.ronde1;

public class fibonaccirafael {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(fibonacci(52));
        long endTime = System.nanoTime();

        System.out.println((endTime - startTime) + "ns");
    }

    static long fibonacci(int n) {
        long b = 1;
        long c = 2;
        for (int i = 3; i <= n; i++) {
            b = -b + (c = b + c);
        }
        return b;
//        return  n <= 1 ? n : fibonacci(n - 1) + fibonacci(n - 2);
    }
}