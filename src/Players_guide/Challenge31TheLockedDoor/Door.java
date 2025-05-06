package Players_guide.Challenge31TheLockedDoor;

import static Players_guide.Challenge31TheLockedDoor.Lockstate.Closed;

public class Door {
    Lockstate state;
    private int passcode;

    public Door(int passcode, Lockstate state) {
        this.passcode = passcode;
        this.state = state;
    }

    public String closeDoor() {
        if (this.state.equals(Lockstate.Open)) {
            this.state = Closed;
            return "the door is closed";
        }
        return "the door is already closed";
    }

    public String openDoor() {
        if (this.state.equals(Lockstate.Open)) {
            return "the door is already open, you open it a little bit further idk";
        } else if (this.state.equals(Closed)) {
            this.state = Lockstate.Open;
            return "the door is opened";
        } else if (this.state.equals(Lockstate.Locked)) {
            return "the door is locked you need to unlock it first";
        } else return "i have no idea what you did but you broke my code";
    }

    public String lockDoor() {
        if (this.state.equals(Closed)) {
            this.state = Lockstate.Locked;
            return "the door is now locked";
        } else if (this.state.equals(Lockstate.Locked)) {
            return "the door is already locked";
        } else {
            return "the door is opened, are you sure you want to lock it now dumdum?";
        }
    }

    public void unlockDoor(int passcode) {
        if (this.state.equals(Lockstate.Locked)) {
            if (passcode == this.passcode) {
                this.state = Closed;
                System.out.println("the door is now unlocked");

            } else {
                System.out.println("the passcode is wrong, the door is still locked");
            }
        } else if (this.state.equals(Closed)) {

            System.out.println("the door is already unlocked");
        } else {
            System.out.println("the door is already opened");
        }
    }

    public void ChangePasscode(int oldPasscode, int newPasscode) {
        if (oldPasscode == this.passcode) {
            this.passcode = newPasscode;
            System.out.println("the passcode was changed");
        } else {
            System.out.println("you entered the wrong passcode. the passcode is not changed");
        }
    }

    public static String getLockstate(Door door) {
        switch (door.state) {
            case Lockstate.Closed:
                return "closed";
            case Lockstate.Locked:
                return "Locked";
            case Lockstate.Open:
                return "Open";
            default:
                return "";

        }
    }
}



/*
An open door can always be closed.
A closed (but not locked) door can always be opened.
A closed door can always be locked.
A locked door can be unlocked, but a numeric passcode is needed, and the door will only unlock if
the code supplied matches the door’s current passcode.
When a door is created, it must be given an initial passcode.
        Additionally, you should be able to change the passcode by supplying the current code and a new
one. The passcode should only change if the correct, current code is given.
        Objectives:

v Define a Door class that can keep track of whether it is locked, open, or closed.
v Make it so you can perform the four transitions defined above with methods.
v Build a constructor that requires the starting numeric passcode.
v Build a method that will allow you to change the passcode for an existing door by supplying the
current passcode and new passcode. Only change the passcode if the current passcode is correct.
Make your main method ask the user for a starting passcode, then create a new Door instance. Allow
the user to attempt the four transitions described above (open, close, lock, unlock) and change the
code by typing in text commands*/
