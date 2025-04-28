package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {
        String name= "Vasilij";
        int age = 30;

        //array
        int[] numbers = new int[5]; //[0,0,0,0,0]
        String[] names = {"John","Andrei","Mark"};

        int [] ages = {19,20,30,41,50};
        // index: [0] -19
        // index: [1] -20
        //....



        // Element acces
        numbers[0] = 10 ;
        numbers[1] = 20 ;
        numbers[2] = 30 ;
        numbers[3] = 40 ;
        numbers[4] = 50 ;
        System.out.println(Arrays.toString(numbers));

        //exercise:
        String[] fruitBasket = {"Apple","Lemon","Peach","Mango","Melon"};
        System.out.println(Arrays.toString(fruitBasket));

        String[] fruitBasket2 = new String[5];
        fruitBasket2[0]= "Apple";
        fruitBasket2[1]= "Lemon";
        fruitBasket2[2]= "Peach";
        fruitBasket2[3]= "Mango";
        fruitBasket2[4]= "Melon";
        System.out.println(Arrays.toString(fruitBasket2));

        // Loops

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // for loop

        System.out.println("========");

        for(int i = 5; i < 7; i++)
        {
            System.out.println("Hello World" + " index: " + i);
        }

        for (int i = 0; i < fruitBasket2.length; i++){
        System.out.println(fruitBasket2[i]);}

        // For each;

        for (String fruit : fruitBasket2){
            System.out.println(fruit);
        }
        // Create int number array from 0 -> 10;
        // Print in reverse

        int[]nums = {0,1,2,3,4,5,6,7,8,9,10};
        for (int i = nums.length - 1; i>=0; i--){
            System.out.print(nums[i] + " ");
        }

        // while loops

        int i = 0;
        while(i<5){
            System.out.println("Number " + i);
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (!password.equals("secret")) {
            System.out.println("Enter your password:");
            password = scanner.nextLine();
        }
        System.out.println("Access granted");
    }
}
