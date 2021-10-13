package racinggame.input;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.car.Name;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputUtilTest {

    @Test
    @DisplayName(",로 입력받은 자동차들 분리하기")
    public void InputUtilTest1() {
        String inputCars = "car1,car2,car3";

        Assertions.assertThat(InputUtil.separateCarNames(inputCars)).containsOnly("car1", "car2", "car3");
    }

    @Test
    @DisplayName("시도할 입력 횟수가 1이상인지 검증")
    public void InputUtilTest2() {
        assertDoesNotThrow(() -> {
            InputUtil.checkRounds(10);
        });

    }

    @Test
    @DisplayName("시도할 입력 횟수가 0이거나 음수일 경우는 예외처리")
    public void InputUtilTest3() {
        assertThrows(IllegalArgumentException.class, () -> {
            InputUtil.checkRounds(-1);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            InputUtil.checkRounds(-10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            InputUtil.checkRounds(0);
        });
    }
}
