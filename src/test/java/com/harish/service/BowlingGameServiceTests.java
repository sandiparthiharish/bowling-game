package com.harish.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BowlingGameServiceTests {

    private BowlingGameService bowlingGameService;

    @Before
    public void setUp() {
        bowlingGameService = new BowlingGameService();
    }

    @Test
    public void getGameScore_ReturnsValueTest() {
        assertThat(bowlingGameService.getGameScore(new int[] {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0}))
                .isEqualTo(0);
    }

    @Test
    public void getGameScore_WithEachRollPinsDownAre1Test() {
        assertThat(bowlingGameService.getGameScore(new int[] {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1}))
                .isEqualTo(20);
    }

    @Test
    public void getGameScore_WithEachRollPinsDownAre3Test() {
        assertThat(bowlingGameService.getGameScore(new int[] {3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3, 3,3}))
                .isEqualTo(60);
    }

    @Test
    public void getGameScore_WithSpareAtStartAndPinsDownForRestOFTheRollsAre1Test() {
        assertThat(bowlingGameService.getGameScore(new int[] {5,5, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1}))
                .isEqualTo(29);
    }

    @Test
    public void getGameScore_WithSpareAtEndFollowedBy3AndPinsDownForRestOFTheRollsAre1Test() {
        assertThat(bowlingGameService.getGameScore(new int[] {1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 1,1, 5,5,3}))
                .isEqualTo(31);
    }
}
