package les_oefeningen.ronde2;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(5));
    }

    public static int fibonacci(int aantal){

        return (aantal <= 1) ? aantal : (fibonacci(aantal-1)+ fibonacci(aantal-2));

    }
}
