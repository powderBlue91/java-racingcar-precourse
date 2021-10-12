package racinggame.car;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    Cars cars;

    @BeforeEach
    public void setUp() {
        cars = new Cars();
    }

    @Test
    @DisplayName("생성 테스트")
    public void ConstructCarsTest() {
        Assertions.assertThat(cars).isNotNull();
    }

    @Test
    @DisplayName("자동차 추가하기 테스트")
    public void AddCarTest() {
        cars.addCars(new String[]{"test1", "test2", "test3"});

        Assertions.assertThat(cars.getCarNum()).isEqualTo(3);
    }

    @Test
    @DisplayName("가장 멀리 간 자동차의 거리값 구하기 테스트")
    public void FarthestDistanceTest() {
        cars.addCars(new String[]{"car1", "car2", "car3"});

        Car car1 = cars.getCar(0);
        car1.advance();

        Car car2 = cars.getCar(1);
        car2.advance();
        car2.advance();

        Car car3 = cars.getCar(2);
        car3.advance();
        car3.advance();
        car3.advance();

        Assertions.assertThat(cars.getFarthestDistance()).isEqualTo(3);
    }

    @Test
    @DisplayName("가장 멀리 간 자동차가 1대인 경우")
    public void FarthestDistanceCarOnlyTest() {
        cars.addCars(new String[]{"car1", "car2", "car3"});

        Car car1 = cars.getCar(0);
        car1.advance();

        Car car2 = cars.getCar(1);
        car2.advance();
        car2.advance();

        Car car3 = cars.getCar(2);
        car3.advance();
        car3.advance();
        car3.advance();

        Assertions.assertThat(cars.getFarthestDistanceCars()).containsOnly("car3");
    }

    @Test
    @DisplayName("가장 멀리 간 자동차가 2대이상인 경우")
    public void FarthestDistanceCarsTest() {
        cars.addCars(new String[]{"car1", "car2", "car3"});

        Car car1 = cars.getCar(0);
        car1.advance();

        Car car2 = cars.getCar(1);
        car2.advance();
        car2.advance();
        car2.advance();

        Car car3 = cars.getCar(2);
        car3.advance();
        car3.advance();
        car3.advance();

        Assertions.assertThat(cars.getFarthestDistanceCars()).containsOnly("car2","car3");
    }
}
