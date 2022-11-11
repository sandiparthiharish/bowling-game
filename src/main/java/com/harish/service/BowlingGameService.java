package com.harish.service;

import org.springframework.stereotype.Service;

@Service
public class BowlingGameService {

    private int[] rolls;
    private int gameScore;

    public int getGameScore(int[] eachGame) {
        rolls = eachGame;
        calculateScore();
        return gameScore;
    }

    private void calculateScore() {

        for(int frame = 0, roll=0; frame < 10; frame++, roll++) {
            if(isStrike(rolls[roll])) {
                scoreStrike(roll);
            }else if(isSpare(roll)) {
                scoreSpare(roll);
                roll++;
            }else {
                scoreFrame(roll);
                roll++;
            }
        }
    }

    private void scoreFrame(int roll) {
        gameScore += rolls[roll] + rolls[roll+1];
    }

    private void scoreSpare(int roll) {
        gameScore += 10 + rolls[roll+2];
    }

    private void scoreStrike(int roll) {
        gameScore += 10 + rolls[roll +1] + rolls[roll +2];
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }

    private boolean isSpare(int roll) {
        return rolls[roll] + rolls[roll +1] == 10;
    }
}