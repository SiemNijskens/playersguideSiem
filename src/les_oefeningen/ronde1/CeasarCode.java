package les_oefeningen.ronde1;
import java.util.Scanner;

public class CeasarCode {
    public static void main (String [] args){
        System.out.println("Enter a readable text in all caps");
        Scanner scanner = new Scanner (System.in);
        String woord = scanner.nextLine();
        char[] woordarray = woord.toCharArray();
        int length = woordarray.length;

        System.out.println("The secret code is");
        for (int i=0;i<length; i++) {
            if (woordarray [i]==' '){
                System.out.print(woordarray [i]);
            }
            else if ( woordarray [i]< 'X') {
                char a = (char) (woordarray[i] + 3);
                System.out.print(a);
            }
            else if (woordarray [i]>= 'X'){
                char b = (char) (woordarray[i] - 23);
                System.out.print(b);
            }
        }
    }
}
