package racinggame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {
    List<Car> list = new ArrayList<>();

    public void add(Car car) {
        list.add(car);
    }

    public List<String> findFarthestCars() {
        int max = findFarthestDistance();

        List<String> winners = new ArrayList<>();
        for (Car car : list) {
            if (car.getMoveDistance() == max)
                winners.add(car.getName());
        }

        return winners;
    }

    public int findFarthestDistance() {
        int max = 0;
        for (Car car : list) {
            if ( max < car.getMoveDistance())
                max = car.getMoveDistance();
        }
        return max;
    }
}
