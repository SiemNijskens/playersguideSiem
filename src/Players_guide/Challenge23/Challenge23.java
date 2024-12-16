package Players_guide.Challenge23;

import java.util.Scanner;

public class Challenge23 {
    public static void main(String[] args) {
        BoxStatus status = BoxStatus.CLOSED;
        Scanner scanner = new Scanner(System.in);
        System.out.println("the box is currently " + status);
        boolean run = true;

        do {
            System.out.println("-----------------------------------------------------");
            System.out.println("what do you want to do with the box");
            System.out.println("open, close, lock or unlock");
            String input = scanner.nextLine().toLowerCase();
            status = reviewUserInput(input, status);
        }
        while (run);


/*      As you move through the village of Enumerant, you notice a short, cloaked figure following you. Not
        being one to enjoy a mysterious figure tailing you, you seize a moment to confront the figure. “Don’t be
        alarmed!” she says. “I am Simula. They are saying you’re a Programmer. Is this true?” You answer in the
        affirmative, and Simula’s eyes widen. “If you are truly a Programmer, you will be able to help me. Follow
        me.” She leads you to a backstreet and into a dimly lit hovel. She hands you a small, locked chest. “We
        haven’t seen any Programmers in these lands in a long time. And especially not ones that can craft types.
        If you are a True Programmer, you will want what is in that chest. And if you are a True Programmer, I
        will gladly give it to you to aid you in your quest.”
        The chest is a small box you can hold in your hand. The lid can be open, closed (but unlocked), or locked.
                You’d normally be able to go between these states, opening, closing, locking, and unlocking the box, but
        the box is broken.You need to create a program with an enumeration to recreate this locking mechanism.

        The box can be in three states:
        if the box is in the OPEN state, you can close it, and it becomes CLOSED
        if the box is in the CLOSED state, you can open it, and it becomes OPEN
        if the box is in the CLOSED state, you can lock it, and it becomes LOCKED
        if the box is in the LOCKED state, you can unlock it, and it becomes CLOSED

        Nothing happens if you attempt an impossible action in the current state, like opening a locked box.
        The program below shows what using this might look like:

        The chest is locked. What do you want to do? unlock
        The chest is unlocked. What do you want to do? open
        The chest is open. What do you want to do? close
        The chest is unlocked. What do you want to do?
        Objectives:

        Define an enumeration for the state of the chest.
                Make a variable whose type is this new enumeration.
                Write code to allow you to manipulate the chest with the lock, unlock, open, and close
        commands, but ensure that you don’t transition between states that don’t support it.
                Loop forever, asking for the next command.*/


    }

    public static BoxStatus reviewUserInput(String input, BoxStatus status) {
        switch (input) {
            case "open":
                if (status == BoxStatus.CLOSED) {
                    System.out.println("you open the box");
                    return BoxStatus.OPEN;
                } else if (status == BoxStatus.OPEN) {
                    System.out.println("you can't open a box that is already opened");
                } else {
                    System.out.println("the box is locked, unlock it before trying to open it");
                }
                break;
            case "close":
                if (status == BoxStatus.OPEN) {
                    System.out.println("you close the box");
                    return BoxStatus.CLOSED;
                } else {
                    System.out.println("the box is already closed");
                }

                break;
            case "lock":
                if (status == BoxStatus.OPEN) {
                    System.out.println("you can't lock an open box");
                    return BoxStatus.OPEN;
                } else if (status == BoxStatus.CLOSED) {
                    System.out.println("you lock the box");
                    return BoxStatus.LOCKED;
                } else {
                    System.out.println("the box is already locked");
                }
                break;

            case "unlock":
                if (status == BoxStatus.OPEN) {
                    System.out.println("the box is already opened");
                } else if (status == BoxStatus.CLOSED) {
                    System.out.println("the box is already unlocked");
                } else {
                    System.out.println("you unlock the box");
                    return BoxStatus.CLOSED;
                }
                break;
            default:
                System.out.println("that was not one of the options");
                return null;
        } return null;
    }
}