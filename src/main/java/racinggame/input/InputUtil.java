package racinggame.input;

import nextstep.utils.Console;

public class InputUtil {
    public static String[] separateCarNames(String carsNames) {
        return carsNames.split(",");
    }

    public static int checkRounds(int inputRounds) {
        if (inputRounds <= 0)
            throw new IllegalArgumentException("[Error]");
        return inputRounds;
    }
}
