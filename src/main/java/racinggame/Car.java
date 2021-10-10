package racinggame;

public class Car {

    public static final int CAR_NAME_LIMIT_LENGTH = 5;

    private int distance = 0;
    private String name = null;

    public Car(String inputName) {
        if (!validCarName(inputName))
            throw new IllegalArgumentException("자동차 이름 길이가 5 넘음");
        this.name = inputName;
    }

    public static boolean validCarName(String carName) {
        if (carName.length() <= CAR_NAME_LIMIT_LENGTH)
            return true;
        return false;
    }

    public void moveDistance(int moveDistance) {
        this.distance += moveDistance;
    }

    public int getMoveDistance() {
        return this.distance;
    }
}
