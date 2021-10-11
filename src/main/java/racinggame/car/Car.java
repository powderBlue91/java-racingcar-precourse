package racinggame.car;

public class Car {
    private Distance distance;
    private Name name;

    public Car(String inputName) {
        distance = new Distance();
        name = new Name(inputName);
    }

    public int getDistance() {
        return distance.getValue();
    }

    public void advance() {
        distance.addValue();
    }

    public Name getName() {
        return name.getName();
    }
}
