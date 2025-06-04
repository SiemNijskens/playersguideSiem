package les_oefeningen.ronde2.CarEnEngine;

public class Engine {
    private int Horsepower;
    private String type;

    public Engine(int horsepower, String type) {
        Horsepower = horsepower;
        this.type = type;
    }

    public Engine(int horsepower) {
        this(horsepower, "UNKNOWN");
        Horsepower = horsepower;
    }

    public Engine(String type) {
        this (-1, type);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Horsepower=" + Horsepower +
                ", type='" + type + '\'' +
                '}';
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    public void setHorsepower(String horsepower) {
        Horsepower = Integer.parseInt(horsepower);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
