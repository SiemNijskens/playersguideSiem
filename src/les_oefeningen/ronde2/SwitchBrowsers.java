package les_oefeningen.ronde2;

public class SwitchBrowsers {
    public static void main(String[] args) {

        Browser browser = Browser.Chrome;

        switch (browser) {
            case Edge:
                System.out.println("Je gebruikt Edge");
                break;
            case Chrome:
            case Firefox:
            case Opera:
                System.out.println("je gebruikt een moderne browser");
                break;
            case IE:
                System.out.println("wat is er mis met je");
                break;
            case other:
                System.out.println("je begruikt een niet ondersteunde browser");
                break;
            default:
                System.out.println("ik weet niet wat je gebruikt maar je kunt niet op het web surfen met een aardappel");
        }
    }

    enum Browser {
        Edge,
        Chrome,
        Firefox,
        Opera,
        IE,
        other
    }
}