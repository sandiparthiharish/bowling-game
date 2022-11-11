package com.harish.controller;

import com.harish.service.BowlingGameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BowlingGameController {

    private BowlingGameService bowlingGameService;

    public BowlingGameController(BowlingGameService bowlingGameService) {
        this.bowlingGameService = bowlingGameService;
    }

    @GetMapping(path = "/getScore")
    public int gameHandler(@RequestParam int[] game) {
        return bowlingGameService.getGameScore(game);
    }
}
