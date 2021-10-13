package racinggame;

import nextstep.utils.Randoms;
import racinggame.car.Car;
import racinggame.car.Cars;

public class RacingStadium {
    static final int MIN_RANDOM_NUM = 0;
    static final int MAX_RANDOM_NUM = 9;
    static final int CAN_ADVANCE_NUM = 4;

    int rounds;
    Cars carList;

    public RacingStadium() {
        rounds = 0;
        carList = new Cars();
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void addCars(String[] cars) {
        carList.addCars(cars);
    }

    public void showRacing() {
        System.out.println("실행결과");
        for (int i = 0; i < rounds; ++i) {
            showRacingByRound();
        }
    }

    public void showRacingByRound() {
        for (int j = 0; j < carList.getCarNum(); ++j) {
            System.out.print(carList.getCar(j).getName() + " : ");
            int distance = decideWhetherToGo(carList.getCar(j));
            showCarDistance(distance);
        }
        System.out.println();
    }

    public int decideWhetherToGo(Car car) {
        int randomNum = Randoms.pickNumberInRange(MIN_RANDOM_NUM, MAX_RANDOM_NUM);

        if (randomNum >= CAN_ADVANCE_NUM) {
            car.advance();
        }

        return car.getDistance();
    }

    public void showCarDistance(int distance) {
        for (int j = 0; j < distance; ++j) {
            System.out.print("-");
        }
        System.out.println();
    }

    public void showWinner() {
        int winnerNum = carList.getFarthestDistanceCars().length;
        String[] winners = carList.getFarthestDistanceCars();

        System.out.print("최종 우승자는 ");
        for (int i = 0; i < winnerNum; ++i) {
            System.out.print(winners[i]);
            renderSemicolon(i, winnerNum);
        }
        System.out.print(" 입니다.");
    }

    public void renderSemicolon(int i, int winnerNum) {
        if (i != winnerNum - 1)
            System.out.print(",");
    }

    public void clear() {
        carList.clear();
    }
}
