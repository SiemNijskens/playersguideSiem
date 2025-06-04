package les_oefeningen.ronde2;

public class week2 {
    public static void main(String[] args) {
        int getal = exponent(3,4);
        System.out.println(getal);

    }
    public static int exponent(int base, int exp){
        return (int)Math.pow(base, exp);
    }
}
