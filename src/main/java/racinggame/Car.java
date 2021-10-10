package racinggame;

public class Car {

    public static final int CAR_NAME_LIMIT_LENGTH = 5;

    private int distance = 0;

    public static boolean validCarName(String carName) {
        if (carName.length() <= CAR_NAME_LIMIT_LENGTH)
            return true;
        return false;
    }
}
