package les_oefeningen.ronde1.vogel;

class parkiet extends Vogel{
    String color;
    parkiet(String naam, String color){
    super(naam);
    this.color = color;
    }
}

class penguin extends Vogel{
    boolean isLomp = true;
    penguin (String naam){
        super(naam);
    }

    @Override
    public void landt(){
        System.out.println("ik weet niet hoe die in de lucht is gekomen maar hij landt op zijn gat");
    }
}

class papegaai extends Vogel {
    int maxDistance = 50;

    papegaai(String naam){
        super(naam);
    }

    public static void vliegt(int maxDistance){
    }
}