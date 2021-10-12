package racinggame;

import nextstep.utils.Console;
import nextstep.utils.Randoms;
import racinggame.car.Car;
import racinggame.car.Cars;
import racinggame.input.InputUtil;

import java.sql.SQLOutput;

public class RacingCarGame {
    Cars carList;
    int rounds;

    public RacingCarGame() {
        carList = new Cars();
    }

    public void start() {
        initGameData();
        result();
    }

    private void initGameData() {

        while(true) {
            try {
                inputGameData();
            } catch (IllegalArgumentException e) {
                System.out.println("[ERROR]");
                continue;
            }

            break;
        }
    }

    public void inputGameData() {
        carList.addCars(InputUtil.inputCarsName());
        rounds = InputUtil.inputRound();
    }

    public void result() {
        System.out.println("실행결과");

        for (int i = 0; i < rounds; ++i) {
            showRacingProcess();
            System.out.println();
        }

        showWinner();
    }

    public void showRacingProcess() {
        for (int i = 0; i < carList.getCarNum(); ++i) {
            System.out.print(carList.getCar(i).getName() + " : ");
            int distance = decideWhetherToGo(carList.getCar(i));
            for (int j = 0; j < distance; ++j){
                System.out.print("-");
            }
            System.out.println();
        }
    }

    public int decideWhetherToGo(Car car) {
        int num = Randoms.pickNumberInRange(0,9);
        if (num >= 4)
            car.advance();
        return car.getDistance();
    }

    private void showWinner() {
        int num = carList.getFarthestDistanceCars().length;
        String[] winners = carList.getFarthestDistanceCars();
        System.out.print("최종 우승자는 ");
        for (int i = 0; i < num; ++i) {
            System.out.print(winners[i]);
            if (i != num-1)
                System.out.print(",");
        }
        System.out.print(" 입니다.");
    }

}
