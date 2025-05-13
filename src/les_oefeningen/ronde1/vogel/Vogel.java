package les_oefeningen.ronde1.vogel;

public class Vogel {
    public boolean isGechipt;
    public boolean isBedreigd;
    public int aantalInWild;
    public int aantalVleugels;
    public String naam;

    Vogel (String naam){
        this.naam = naam;
    }

    public void vliegt() {
        System.out.println("de vogel vliegt");
    }

    public void landt() {
        System.out.println("de vogel landt");
    }
}

class adelaar extends Vogel{
    adelaar(String naam){
        super(naam);
    }

    public static void main(String[] args) {
        adelaar Adelaar1 = new adelaar("henkie");
        System.out.println(Adelaar1.naam);
    }
}