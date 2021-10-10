package racinggame.car;

public class Car {
    private Distance distance;
    private Name name;

    public Car(String inputName) {
        distance = new Distance();
        name = new Name(inputName);
    }
}
