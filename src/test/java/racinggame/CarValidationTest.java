package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarValidationTest {

    @Test
    @DisplayName("차 이름의 길이가 5를 넘어선 안됨")
    public void CarNameLengthTest() {
        Assertions.assertThat(Car.validCarName("jake")).isTrue();
        Assertions.assertThat(Car.validCarName("tomas")).isTrue();
        Assertions.assertThat(Car.validCarName("student")).isFalse();
    }
}
