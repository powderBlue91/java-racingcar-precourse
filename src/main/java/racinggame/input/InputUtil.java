package racinggame.input;

public class InputUtil {
    public static String[] separateCarNames(String carsNames) {
        return carsNames.split(",");
    }

    public static boolean checkRounds(int inputRounds) {
        if (inputRounds <= 0)
            throw new IllegalArgumentException("[Error]");
        return true;
    }
}
