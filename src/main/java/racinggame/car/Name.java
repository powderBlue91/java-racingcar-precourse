package racinggame.car;

public class Name {
    public static final int NAME_LENGTH_MAX = 5;
    public static final int NAME_LENGTH_MIN = 1;

    String value;

    public static boolean validCarName(String carName) {
        if (carName.length() <= NAME_LENGTH_MAX && carName.length() >= NAME_LENGTH_MIN)
            return true;
        return false;
    }

    public Name(String value) {
        if (!validCarName(value))
            throw new IllegalArgumentException("[ERROR] 자동차 이름 길이는 1~5 사이입니다");
        this.value = value;
    }

    public String getName() {
        return value;
    }
}
