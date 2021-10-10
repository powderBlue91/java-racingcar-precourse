package racinggame.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DistanceTest {

    @Test
    @DisplayName("생성 테스트")
    public void ConstructDistanceTest() {
        Distance distance = new Distance();

        Assertions.assertThat(distance).isNotNull();
    }

    @Test
    @DisplayName("distance 1씩 증가 테스트")
    public void AddDistanceTest() {
        Distance distance = new Distance();

        distance.addValue();
        Assertions.assertThat(distance.getValue()).isEqualTo(1);

        distance.addValue();
        Assertions.assertThat(distance.getValue()).isEqualTo(2);
    }
}
