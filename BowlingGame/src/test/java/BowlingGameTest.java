import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
    private BowlingGame game;

    @Before
    public void setUp() {
        game = new BowlingGame();
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        assertThat("Score", game.score(), is(0));
    }

    private void rollMany(int numberOfRolls, int pins) {
        for (int i = 0; i < numberOfRolls; i++) {
            game.roll(pins);
        }
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);
        assertThat("Score", game.score(), is(20));
    }

    @Test
    public void oneSpare() {
        rollSpare();
        game.roll(3);
        rollMany(17, 0);
        assertThat("Score", game.score(), is(16));
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    @Test
    public void oneStrike() {
        rollStrike();
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertThat("Score", game.score(), is(24));
    }

    private void rollStrike() {
        game.roll(10);
    }

    @Test
    public void perfectGame() {
        rollMany(12, 10);
        assertThat("Score", game.score(), is(300));
    }
}
