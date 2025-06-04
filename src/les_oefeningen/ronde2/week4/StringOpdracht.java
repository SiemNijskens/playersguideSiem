package les_oefeningen.ronde2.week4;

public class StringOpdracht {
    public static void main(String[] args) {
        String abc = "abcdef";
        char [] uitkomst = new char[abc.length()];

        //char[] abcarr = abc.toCharArray();
        //char[] reverseabc=reverse.toCharArray();

        for (int i = 0; i<abc.length(); i++){
            uitkomst[i]=abc.charAt(abc.length()-i-1);
        }

        String uitkomst2 = new String(uitkomst);
        System.out.println(uitkomst2);

        if(uitkomst2.equals(abc)){
            System.out.println("it's a palindrome");
        }
        else {
            System.out.println("it's not a palindrome");
        }
    }
}
