package lv.acodemy;


public class MyClass {
    public static void main(String[] args) {
        System.out.println("Ja u Mami programmist");

        // Your text is here(one-line comment)

        /*1
        2
        3
         */

        //byte 8-bit
        byte age = 30;
        System.out.println(age);


        //Naming convention:
        //CamelCase - for classes
        //camelCase - for variables
        // short 16-bit
        short currentYear = 2025;
        short temperature = -273;
        short distance = 1600;

        //int 32-bit
        int score = 9000;
        int population = 14400000;
        int result = (10*10) - 42;
        System.out.println(result);

        //long 64-bit
        long starsGalaxy = 10000000000L;//100000010000
        long currentMillis = System.currentTimeMillis();
        System.out.println(currentMillis);

        //float 32 - bit
        float pi = 3.14f;
        float piNumber = (float) Math.PI;// casting
        float discount = 25.5f;

        // double 64-bit
        double accountBalance = 99999.9999788;
        double squareRoot = Math.sqrt(2);
        System.out.println(squareRoot);
        double piDouble = Math.PI;

        System.out.println(pi);
        System.out.println(piDouble);

        //char (symbol)
        char initial = 'N';
        char digit = '7';
        char symbol = '#';

        // see Unicode table https://symbl.cc/en/unicode-table/
        char smiley = '\uD83D';
        System.out.println(smiley);

        //boolean (true/false)
        boolean isJavaFun = true;
        boolean isTired = true;
        boolean passed = (40 > 60); //false

        // string
        String myFullName = "Vasilij Zubov";// immutable




    }
}

