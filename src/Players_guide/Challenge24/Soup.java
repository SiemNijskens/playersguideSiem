package Players_guide.Challenge24;

public class Soup {
    SoupType type;
    Seasoning seasoning;
    MainIngredient ingredient;

    public Soup(SoupType type, Seasoning seasoning, MainIngredient ingredient){
        this.ingredient=ingredient;
        this.seasoning=seasoning;
        this.type=type;
        System.out.println("Here's your " + seasoning + " " + ingredient + " " + type + "! Enjoy!");
    }
}
