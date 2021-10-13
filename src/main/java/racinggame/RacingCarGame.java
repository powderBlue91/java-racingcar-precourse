package racinggame;

import racinggame.input.InputUtil;

public class RacingCarGame {
    RacingStadium racingStadium;

    public RacingCarGame() {
        racingStadium = new RacingStadium();
    }

    public void start() {
        initGameData();
        showGame();
    }

    public void showGame() {
        showRacing();
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
        racingStadium.addCars(InputUtil.inputCarsName());
        racingStadium.setRounds(InputUtil.inputRound());
    }

    private void showRacing() {
        racingStadium.showRacing();
    }

    private void showWinner() {
        racingStadium.showWinner();
    }
}
