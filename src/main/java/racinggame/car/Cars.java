package racinggame.car;


import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> list = new ArrayList<>();

    public void addCars(String[] cars) {
        for (int i = 0; i < cars.length; ++i) {
            validationDuplicateCar(cars[i]);
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
            maxDistance = compareDistance(maxDistance, car.getDistance());
        }

        return maxDistance;
    }

    public int compareDistance(int maxDistance, int curDistance) {
        if (maxDistance < curDistance)
            maxDistance = curDistance;
        return maxDistance;
    }

    public String[] getFarthestDistanceCars() {
        int maxDistance = getFarthestDistance();

        List<String> tmpList = new ArrayList<>();
        for (Car car : list) {
            tmpList = equalCarDistance(tmpList, maxDistance, car);
        }

        return tmpList.toArray(new String[tmpList.size()]);
    }

    public List<String> equalCarDistance(List<String> tmpList, int maxDistance, Car curCar) {
        if (maxDistance == curCar.getDistance()) {
            tmpList.add(curCar.getName());
        }
        return tmpList;
    }

    public void validationDuplicateCar(String newCarName) {
        for (Car car : list) {
            equalCarName(car.getName(), newCarName);
        }
    }

    public void equalCarName(String curCarName, String newCarName) {
        if (curCarName.equals(newCarName))
            throw new IllegalArgumentException("[ERROR] 동일한 이름의 자동차는 생성 불가합니다.");
    }

    public void clear() {
        list.clear();
    }
}
