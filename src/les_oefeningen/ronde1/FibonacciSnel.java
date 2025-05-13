package les_oefeningen.ronde1;

public class FibonacciSnel {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        System.out.println(getFib(52));

        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        System.out.println("Het fibonacci getal word gegeven in: " + duration + " ns");
    }



    public static long getFib(final int index) {
        long a=0,b=0,total=0;
        for(int i=0;i<= index;i++) {
            if(i==0) {
                a=0;
                total=a+b;
            }else if(i==1) {
                b=1;
                total=a+b;
            }

            else if(i%2==0) {
                total = a+b;
                a=total;
            }else {
                total = a+b;
                b=total;
            }

        }
        return total;
    }
}
