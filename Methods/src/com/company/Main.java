package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

	    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
	    System.out.println("Your final score was " + highScore);

	    score = 10000;
	    levelCompleted = 8;
	    bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculatePlayerPosition(1500);
        displayHighScorePosition("Matthew", highScorePosition);

        highScorePosition = calculatePlayerPosition(900);
        displayHighScorePosition("Samuel", highScorePosition);

        highScorePosition = calculatePlayerPosition(400);
        displayHighScorePosition("Dante", highScorePosition);

        highScorePosition = calculatePlayerPosition(20);
        displayHighScorePosition("Hollow", highScorePosition);

        highScorePosition = calculatePlayerPosition(1000);
        displayHighScorePosition("Susan", highScorePosition);

        highScorePosition = calculatePlayerPosition(500);
        displayHighScorePosition("Split", highScorePosition);

        highScorePosition = calculatePlayerPosition(100);
        displayHighScorePosition("Shippai", highScorePosition);
    }



    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the charts");
    }

    public static int calculatePlayerPosition(int playerScore){
//        if(playerScore >= 1000){
//            return 1;
//        } else if(playerScore < 1000){
//            return 2;
//        } else if(playerScore < 500){
//            return 3;
//        }
//        return 4;
        int position = 4; //base case
        if(playerScore >= 1000){
            position = 1;
        } else if(playerScore >= 500){
            position = 2;
        } else if(playerScore >= 100){
            position = 3;
        }
         return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
