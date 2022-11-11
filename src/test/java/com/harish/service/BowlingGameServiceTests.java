package com.harish.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class BowlingGameServiceTests {

    @Test
    public void getGameScore_ReturnsValueTest() {
        BowlingGameService bowlingGameService = new BowlingGameService();
        assertThat(bowlingGameService.getGameScore()).isEqualTo(0);
    }
}
