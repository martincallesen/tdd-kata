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
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(17, 0);
        assertThat("Score", game.score(), is(16));
    }

    @Test
    public void oneStrike() {
        game.roll(10);
        game.roll(3);
        game.roll(4);
        rollMany(16, 0);
        assertThat("Score", game.score(), is(24));
    }

    @Test
    public void lastTurnWithTwoRolls() {
        rollMany(9, 10);
        game.roll(3);
        game.roll(4);

        assertThat("Score", game.score(), is(257));
    }

    @Test
    public void lastTurnWithSpare() {
        rollMany(9, 10);
        game.roll(3);
        game.roll(7);
        game.roll(3);
        assertThat("Score", game.score(), is(266));
    }

    @Test
    public void lastFrameWithStrike() {
        rollMany(9, 10);
        game.roll(10);
        game.roll(3);
        game.roll(3);
        assertThat("Score", game.score(), is(279));
    }

    @Test
    public void perfectGame() {
        rollMany(12, 10);
        assertThat("Score", game.score(), is(300));
    }
}
