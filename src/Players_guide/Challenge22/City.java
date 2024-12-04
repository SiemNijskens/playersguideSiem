package Players_guide.Challenge22;

public class City extends Challenge22 {
    String name;
    int health;
    public City(String name) {
        this.name = name;

        this.health = 15;
    }

    public static int cannonDamage(int round) {
        int cannonDamage;
        if (round % 3 == 0 || round % 5 == 0) {
            return cannonDamage = 3;
        } else if (round % 3 == 0 && round % 5 == 0) {
            return cannonDamage = 10;
        } else {
            return cannonDamage = 1;
        }
    }
}
