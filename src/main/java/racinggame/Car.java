package racinggame;

public class Car {

    public static final int CAR_NAME_LENGTH_MAX = 5;
    public static final int CAR_NAME_LENGTH_MIN = 1;

    private int distance = 0;
    private String name = null;

    public Car(String inputName) {
        if (!validCarName(inputName))
            throw new IllegalArgumentException("자동차 이름 길이가 1~5가 아님");
        this.name = inputName;
    }

    public static boolean validCarName(String carName) {
        if (carName.length() <= CAR_NAME_LENGTH_MAX && carName.length() >= CAR_NAME_LENGTH_MIN)
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
