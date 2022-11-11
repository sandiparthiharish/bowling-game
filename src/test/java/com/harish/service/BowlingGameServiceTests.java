package com.harish.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class BowlingGameServiceTests {

    private final int[] gameInput;
    private final int excepted;
    private static final int[] GUTTER_GAME = {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0};
    private static final int[] EACH_ROLL_PINS_DOWN_1 = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
    private static final int[] EACH_ROLL_PINS_DOWN_3 = {3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3};
    private static final int[] SPARE_START_REST_ROLLS_1 = {5,5, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
    private static final int[] END_SPARE_FOLLOWED_3_REST_ROLLS_1 = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 5,5,3};
    private static final int[] ALL_SPARES_FOLLOWED_BY_3 = {5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5, 5,5,3};
    private static final int[] STRIKE_START_REST_ROLLS_1 = {10, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1};
    private static final int[] END_STRIKE_FOLLOWED_3_REST_ROLLS_1 = {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 10,3,3};
    private static final int[] ALL_STRIKES_FOLLOWED_BY_3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10,10,10};
    private BowlingGameService bowlingGameService;


    public BowlingGameServiceTests(int[] gameInput, int excepted) {
        this.gameInput = gameInput;
        this.excepted = excepted;
    }

    @Before
    public void setUp() {
        bowlingGameService = new BowlingGameService();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {GUTTER_GAME, 0},
                {EACH_ROLL_PINS_DOWN_1 , 20},
                {EACH_ROLL_PINS_DOWN_3, 60},
                {SPARE_START_REST_ROLLS_1, 29},
                {END_SPARE_FOLLOWED_3_REST_ROLLS_1, 31},
                {ALL_SPARES_FOLLOWED_BY_3, 148},
                {STRIKE_START_REST_ROLLS_1, 30},
                {END_STRIKE_FOLLOWED_3_REST_ROLLS_1, 34},
                {ALL_STRIKES_FOLLOWED_BY_3, 300}
        });
    }

    @Test
    public void getGameScoreTest() {
        assertThat(bowlingGameService.getGameScore(gameInput)).isEqualTo(excepted);
    }

}