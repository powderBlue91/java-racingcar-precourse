package racinggame;

import racinggame.input.InputUtil;

public class RacingCarGame {
    RacingStadium racingStadium;
    boolean isNextStep;

    public RacingCarGame() {
        racingStadium = new RacingStadium();
        isNextStep = true;
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
        while (isNextStep) {
            input();
        }
    }

    public void input() {
        try {
            inputGameData();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            isNextStep = true;
            racingStadium.clear();
            return;
        }

        isNextStep = false;
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
