package lv.acodemy;

public class Thirdlesson {
    public static void main(String[] args) {

        // conditional operational in Java

        // if (is,has -> isRaining, isRandomNumber, hasEvenValue
        boolean isRaining = true;
        int temperature = 30;
        if (temperature > 29) {
            System.out.println("Too Hot");
        }

        if (isRaining) {
            System.out.println("Take an Umbrella");
        }
        // && -> and
        if (4 > 2 && 10 < 11) {
            System.out.println("Both are equals");
        }
        // || -> or
        if (4 > 2 || 10 > 11) {
            System.out.println("Execute this code");
        }
        // if else...
        boolean isWeekDay = true;
        if (isWeekDay) {
            System.out.println("working today");
        } else {
            System.out.println("Will stay home");
        }
        int number = 11;
        // %
        // +- / *
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
      /*  // if age => 18 -> Acces guaranted
        // In all other cases  -> Denied
        int age = 18;
        if (age >= 18) {
            System.out.println("Access guaranted");
        } else {
            System.out.println("Denied");
        }*/

        // if else if else
        int hour = 7;
        if (hour == 7){
            System.out.println("Will have breakfast");
        } else if (hour==9) {
            System.out.println("Will start work");

        } else {
            System.out.println("Free time");
        }
        int score = 90;
        if( score >= 90){
            System.out.println("Perfect");
        } else if (score >= 70) {
            System.out.println("Good");
        } else if (score >=50) {
            System.out.println("Ok");
        }else {
            System.out.println("Ok");
        }
        int age = 70;
        if (age <=0 && age>=6){
            System.out.println("baby");
        } else if (age>=7 && age < 17) {
            System.out.println("Shkilla");

        } else if (age>=18 && age <= 65) {
            System.out.println("Adult");
        }else if (age>=66){
            System.out.println("Gens");
        }else {
            System.out.println("Incorrect data");
        }
        //We know conditions & loops
        //Print even numbers from 1 to 10;

//        for (int i = 1; i <=10; i++);
//        {
//
//            if (i % 2 == 0){
//                System.out.println("Number:" + i + "even number");
//            }
//        }
        int[] numbers = {-2, -10, 5, 6, -100, 3, 0, 20};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++);{
            int i = 0;
            if (numbers[i] > 0){
                sum = sum+numbers[i];{
                    System.out.println("Sum of positive numbers" + sum);
                }
            }
        }
    }
}
