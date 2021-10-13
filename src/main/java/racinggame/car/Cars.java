package racinggame.car;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> list = new ArrayList<>();

    public void addCars(String[] cars) {
        for (int i = 0; i < cars.length; ++i) {
            list.add(new Car(cars[i]));
        }
    }

    public Car getCar(int idx) {
        if (idx > list.size() - 1) {
            return null;
        }
        return list.get(idx);
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
                tmpList.add(car.getName());
        }

        return tmpList.toArray(new String[tmpList.size()]);
    }
}
