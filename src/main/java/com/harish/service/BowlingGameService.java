package com.harish.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {

    public int getGameScore(int[] rolls) {
        int score = 0;
        for(int roll : rolls) {
            score += roll;
        }
        return score;
    }
}
