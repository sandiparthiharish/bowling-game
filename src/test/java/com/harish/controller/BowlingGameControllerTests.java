package com.harish.controller;

import com.harish.service.BowlingGameService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class BowlingGameControllerTests {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private BowlingGameService bowlingGameService;

    @Test
    public void gameHandlerApiFoundTest() throws Exception {

        when(bowlingGameService.getGameScore(new int[] {0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0}))
                .thenReturn(0);
        mvc.perform(get("/getScore?game=0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0, 0,0"))
                .andExpect(status().isOk());
    }
}