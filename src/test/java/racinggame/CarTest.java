package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차는 만들어질때 각자의 이름을 갖는다. 이름이 1~5가 아니면 예외 발생")
    public void CarConstruct() {

        assertDoesNotThrow(() -> {
            new Car("yong");
        });

        assertDoesNotThrow(() -> {
            new Car("hi");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Car("");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Car("yongkwon");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new Car("hellobro");
        });
    }

    @Test
    @DisplayName("자동차는 움직일때마다 움직인 거리는 누적된다.")
    public void CarMoveDistanceTest() {
        Car car = new Car("test");
        car.moveDistance(1);
        Assertions.assertThat(car.getMoveDistance()).isEqualTo(1);

        car.moveDistance(5);
        Assertions.assertThat(car.getMoveDistance()).isEqualTo(6);

        car.moveDistance(4);
        Assertions.assertThat(car.getMoveDistance()).isEqualTo(10);
    }

    @Test
    @DisplayName("가장 멀리간 자동차를 구하는 테스트")
    public void FindFarthestCar() {

    }
}
