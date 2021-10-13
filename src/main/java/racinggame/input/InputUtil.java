package racinggame.input;

import nextstep.utils.Console;

public class InputUtil {
    public static String[] separateCarNames(String carsNames) {
        return carsNames.split(",");
    }

    public static int checkRounds(int inputRounds) {
        if (inputRounds <= 0)
            throw new IllegalArgumentException("[ERROR] 시도 횟수는 최소 1이상입니다.");
        return inputRounds;
    }

    public static String[] inputCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return InputUtil.separateCarNames(Console.readLine());
    }

    public static int inputRound() {
        System.out.println("시도할 회수는 몇회인가요?");
        return checkRounds(Integer.parseInt(Console.readLine()));
    }
}
