package racinggame.car;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> list = new ArrayList<>();

    public void add(Car car) {
        list.add(car);
    }

    public int getCarNum() {
        return list.size();
    }

    public int getFarthestDistance() {
        int maxDistance = 0;
        for (Car car : list) {
            if (maxDistance < car.getDistance())
                maxDistance = car.getDistance();
        }

        return maxDistance;
    }

    public String[] getFarthestDistanceCars() {
        int maxDistance = getFarthestDistance();

        List<String> tmpList = new ArrayList<>();
        for (Car car : list) {
            if (car.getDistance() == maxDistance)
                tmpList.add(car.getName().value);
        }

        return tmpList.toArray(new String[tmpList.size()]);
    }
}
