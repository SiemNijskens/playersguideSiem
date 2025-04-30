package Players_guide.Challenge30TheCard;

public class Card {
    private Rank rank;
    private Color color;

    public Card(Rank rank, Color Color){
        this.rank = rank;
        this.color = Color;
        System.out.println("The " + this.color + " " + this.rank);
    }


    public Color getColor() {
        return color;
    }

    public Rank getRank() {
        return rank;
    }

    public Boolean isSymbol(Card card) {
        if (rank.equals(Rank.Ampersand)) {
            return true;
        } else if (rank.equals(Rank.Circumflex)) {
            return true;
        } else if (rank.equals(Rank.Dollar)) {
            return true;
        } else if (rank.equals(Rank.Percent)) {
            return true;
        } else {
            return false;
        }
    }
    public String isFaceCard (Card card){
        if (card.isSymbol(card)){
            return "This card is a face card";
        }
        else {
            return "This card is not a face card";
        }
    }
}
