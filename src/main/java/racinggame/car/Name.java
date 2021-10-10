package racinggame.car;

public class Name {
    public static final int CAR_NAME_LENGTH_MAX = 5;
    public static final int CAR_NAME_LENGTH_MIN = 1;

    String value;

    public static boolean validCarName(String carName) {
        if (carName.length() <= CAR_NAME_LENGTH_MAX && carName.length() >= CAR_NAME_LENGTH_MIN)
            return true;
        return false;
    }

    public Name(String value) {
        if (!validCarName(value))
            throw new IllegalArgumentException("자동차 이름 길이가 1~5가 아님");
        this.value = value;
    }

    public int getLength() {
        return value.length();
    }
}
