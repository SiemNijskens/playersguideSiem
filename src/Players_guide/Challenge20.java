package Players_guide;
import java.util.Scanner;
public class Challenge20 {
    public static void main(String[] args) {
/*  Make a method with the signature int askForNumber(String text). Display the text parameter in the console window,
    get a response from the user, convert it to an int, and return it.

    This might look like this: int result = askForNumber(“What is the airspeed velocity
    of an unladen swallow?”);.

    Make a method with the signature int askForNumberInRange(String text, int min, int max).
    Only return if the entered number is between the min and max values. Otherwise, ask again.
    Place these methods in at least one of your previous programs to improve it.*/
        int userinput = askForNumber();
        System.out.println(userinput);
        String text = "what is the airspeed velocity of an unladen swallow?";
    }

    public static int askForNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        return Integer.valueOf((scanner.next()));
    }
    public static int askForNumberInRange(String text, int min, int max){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println(text);
        do {
            System.out.println("enter a number between " + min + " and " + max);
            number = scanner.nextInt();
        } while (number<=max && number>= min);
        return number;
    }
}
