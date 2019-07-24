package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        checkNumber(5);
        checkNumber(-10);
        checkNumber(0);
    }

    public static void checkNumber(int number){
        if(number > 0){
            System.out.println("Postive");
        }else if(number < 0){
            System.out.println("Negative");
        }else if(number == 0){
            System.out.println("The number is zero");
        }
    }

}
