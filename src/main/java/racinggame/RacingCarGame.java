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
        rounds = 0;
    }

    public void start() {
        initGameData();

        showProcess();

        showWinner();
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

    private void inputGameData() {
        carList.addCars(InputUtil.inputCarsName());
        rounds = InputUtil.inputRound();
    }

    private void showProcess() {
        System.out.println("실행결과");

        for (int i = 0; i < rounds; ++i) {
            showRacingProcess();
            System.out.println();
        }
    }

    private void showRacingProcess() {
        for (int i = 0; i < carList.getCarNum(); ++i) {
            System.out.print(carList.getCar(i).getName() + " : ");
            int distance = decideWhetherToGo(carList.getCar(i));
            showCarDistance(distance);
        }
    }

    private int decideWhetherToGo(Car car) {
        int num = Randoms.pickNumberInRange(0,9);
        if (num >= 4) {
            car.advance();
        }
        return car.getDistance();
    }

    private void showCarDistance(int distance) {
        for (int j = 0; j < distance; ++j){
            System.out.print("-");
        }
        System.out.println();
    }

    private void showWinner() {
        int winnerNum = carList.getFarthestDistanceCars().length;
        String[] winners = carList.getFarthestDistanceCars();
        System.out.print("최종 우승자는 ");
        for (int i = 0; i < winnerNum; ++i) {
            System.out.print(winners[i]);
            renderSemicolon(i, winnerNum);
        }
        System.out.print(" 입니다.");
    }

    private void renderSemicolon(int i, int winnerNum) {
        if (i != winnerNum - 1)
            System.out.println(",");
    }

}
