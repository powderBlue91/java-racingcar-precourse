package racinggame.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("생성 테스트")
    public void ConstructCarTest() {
        Car car = new Car("test1");

        Assertions.assertThat(car).isNotNull();
    }

    @Test
    @DisplayName("차가 전진하면 distance가 1씩 증가한다")
    public void AdvanceTest() {
        Car car = new Car("test2");

        car.advance();

        Assertions.assertThat(car.getDistance()).isEqualTo(1);

        car.advance();

        Assertions.assertThat(car.getDistance()).isEqualTo(2);

        car.advance();

        Assertions.assertThat(car.getDistance()).isEqualTo(3);
    }
}
