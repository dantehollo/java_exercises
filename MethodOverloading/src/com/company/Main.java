package com.company;

public class Main {

    public static void main(String[] args) {
	    int newScore =calculateScore("Matthew", 500);
	    System.out.println("New score is " + newScore);
	    calculateScore(85);
	    calculateScore();

	    double centimeters = calcFeetAndInchesToCentimeters(3, 3);
	    System.out.println(centimeters);

	    double secondConversion = calcFeetAndInchesToCentimeters(52);
	    System.out.println(secondConversion);
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed Player " + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("Unnamed Player scored no points");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches < 0 || inches >11){
            return -1;
        }
        double feetToCentimeters = feet * 30.48;
        double inchesToCentimeters = inches * 2.54;
        return feetToCentimeters + inchesToCentimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches <= 0){
            return -1;
        }
        int calcInchesToFeet = inches / 12;
        System.out.println(calcInchesToFeet);
        int remainingInches = inches % 12;
        System.out.println(remainingInches);
        return calcFeetAndInchesToCentimeters(calcInchesToFeet, remainingInches);
    }
}
//Name and parameters form the unique signature