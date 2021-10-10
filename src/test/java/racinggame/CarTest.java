package racinggame;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Null;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    @DisplayName("자동차는 만들어질때 각자의 이름을 갖는다. 이름이 1~5가 아니면 예외 발생")
    public void CarConstructTest() {

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
    @DisplayName("가장 멀리간 자동차의 거리를 구하는 테스트")
    public void FindFarthestDistanceTest() {
        Car car1 = new Car("test1");
        car1.moveDistance(1);

        Car car2 = new Car("test2");
        car2.moveDistance(10);

        Car car3 = new Car("test3");
        car3.moveDistance(5);

        Cars cars = new Cars();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        int max = cars.findFarthestDistance();
        Assertions.assertThat(max).isEqualTo(10);
    }

    @Test
    @DisplayName("가장 멀리간 자동차가 1대 테스트")
    public void FindFarthestCarTest() {
        Car car1 = new Car("test1");
        car1.moveDistance(10);

        Car car2 = new Car("test2");
        car2.moveDistance(20);

        Car car3 = new Car("test3");
        car3.moveDistance(30);

        Cars cars = new Cars();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        List<String> list = cars.findFarthestCars();
        Assertions.assertThat(list).containsOnly("test3");
    }

    @Test
    @DisplayName("가장 멀리간 자동차가 2대이상 테스트")
    public void FindFarthestCarsTest() {
        Car car1 = new Car("test1");
        car1.moveDistance(10);

        Car car2 = new Car("test2");
        car2.moveDistance(30);

        Car car3 = new Car("test3");
        car3.moveDistance(20);

        Car car4 = new Car("test4");
        car4.moveDistance(30);

        Cars cars = new Cars();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        List<String> list = cars.findFarthestCars();
        Assertions.assertThat(list).containsOnly("test2", "test4");
    }
}
