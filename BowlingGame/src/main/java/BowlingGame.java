public class BowlingGame {
    private int[] rolls = new int[20];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;
        int frameIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if(isLastFrame(frame)){
                score += sumLastFrame(frameIndex);
            } else if(isStrike(frameIndex)){
                score += strikeBonus(frameIndex);
                frameIndex++;
            } else if(isSpare(frame)){
                score += spareBonus(frameIndex);
                frameIndex+=2;
            } else {
                score += sumFrame(frameIndex);
                frameIndex+=2;
            }
        }

        return score;
    }

    private boolean isLastFrame(int frame) {
        return frame == 9;
    }

    private int sumLastFrame(int frameIndex) {
        int sum = sumFrame(frameIndex);

        if(isSpare(frameIndex) || isStrike(frameIndex)) {
            sum += rolls[frameIndex + 2];
        }

        return sum;
    }

    private int sumFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private int strikeBonus(int frameIndex) {
        return 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1] == 10;
    }

    private int spareBonus(int frameIndex) {
        return 10 + rolls[frameIndex + 2];
    }
}