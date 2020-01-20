package com.company;

public class Main {

    public static void main(String[] args) {
	    double doubleVariableOne = 20.00d;
	    System.out.println(doubleVariableOne);
	    double doubleVariableTwo = 80.00d;
		System.out.println(doubleVariableTwo);
		double operationOne = (doubleVariableOne + doubleVariableTwo) * 100.00d;
		System.out.println(operationOne);
		double operationTwo = operationOne % 40.00d;
	    boolean isOperationTwoZero = (operationTwo == 0) ? true : false;
	    System.out.println("isOperationTwoZero " + isOperationTwoZero);
	    if (!isOperationTwoZero) {
	        System.out.println("Got a remainder");
        }
    }
}
