package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 20;
	    int levelCompleted = 5;
	    int bonus = 100;

//	    if(score < 5000 && score > 1000) {
//            System.out.println("You're score wasn't the best, but at least it wasn't the worst");
//        } else if(score < 1000) {
//	        System.out.println("Your score actually was the worst! LOL!");
//	    } else {
//	        System.out.println("New High Score");
//        }

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
