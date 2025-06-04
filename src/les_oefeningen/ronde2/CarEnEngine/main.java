package les_oefeningen.ronde2.CarEnEngine;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        Engine Hemi = new Engine(500,"benzine");
        Car droomauto = new Car("Chevrolet","Camaro", 1979,Hemi);

        System.out.println(droomauto);
    }
}
