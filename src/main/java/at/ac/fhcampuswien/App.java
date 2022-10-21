package at.ac.fhcampuswien;

import java.util.Random;
import java.util.Scanner;

public class App {
    //für user programmieren
    // Implement all methods as public static
    //ab hier
    public static void oneMonthCalendar(int days, int start){

        int number = 1;
        int week = 1;

        while (number <= days) {
            for (int i = 1; i <=7 ; i++) {
                if (i < start && week == 1) {
                    System.out.print(" ");
                }
                else if ((i <= start || week > 1) && number <= days) {
                    System.out.print(String.format("%2s", number) + " "); //string.format method returns the formatted string by given locale, format and arguments
                    number = number + 1;
                }

            }
            System.out.println();
            week = week + 1;
        }
        /*
        System.out.println(days);
        System.out.println(start);
        //was anderes
        int []numbers = {2,3,5,6};
        int []numbers2 = new int [10];
        numbers2[0] = 6;
        numbers2[1] = 4;
        //...
        numbers[9] = 9;
        for (int i = 0; i < numbers.length; i++) { //numbers.length bedeutet in dem Fall 10
            System.out.println(numbers2[i]);// i ist Laufvariable
        }
        public static long [] lcg(long seed) { //ein long kommt zurück bedeutet das
            long[] randomNumbers;
            return null; //weil ich kein Array habe
        }

        }



//bis hier
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int start = scan.nextInt();
        oneMonthCalendar(days,start); //Methode kann 0 oder mehrere Parameter haben
        //Methode kann immer nur einen Wert zurückliefern, auch wenn Verzweigungen
        //es kommt immer eine Zahl zurück beim Programmieren mit Methoden (weil alles/jeder Buchstabe eine Zahl ist
        //Programmieren ist manipulieren von Speicherplätzen

        //was wenn Methode return type hat (hatte vorher keinen
        //-> dann muss ich was mit dem Returntype machen; brauch eine Zuweisung; könnte der Input eines Streams sein
        long[] randomNumbers = lcg(seed: 0); //was Methode zurück liefert steh später in random numbers (somit null)

        // test your method implementations here
        // make method calls
        // print their results
        // etc.

         */

    }

    public static long[] lcg(long seed) { //Linear Congruential Method is a class of Pseudo-Random Number Generator (PRNG) algorithms used for generating sequences of random-like numbers in a specific range.

        long[] array = new long[10]; //array -> more than one value in one variable
        long longus; //long kann methode aufrufen integer nicht
        long m = (long) Math.pow(2, 31); //is used to calculate a number raise to the power of some other number. This function accepts two parameters and returns the value of first parameter raised to the second parameter.
        long c = 12345; //MI integer no method needed?
        long a = 1103515245;

        for (int i = 0; i < array.length ; i++) {  //use command fori to create for loop; the array length is the number of elements that an array can hold; besser length, weil es sich anpasst?
            if (i == 0) {

                longus = seed;
                array [i] = longus;
            }

            else {
                longus = array [i - 1];
                array [i] = (a * longus + c) % m; //s. Formel Angabe
            }
        }
        return array;
    }
    public static void guessingGame(int numberToGuess){

        int countedNumber = 1;
        int guessedNumber;
        boolean julian = false; //state of b
        Scanner scan = new Scanner(System.in);

        while (julian == false) {
            System.out.print("Guess number " + countedNumber + ": " );
            guessedNumber = scan.nextInt();

            if (countedNumber >= 10) {
                System.out.println("You lost! Have you ever heard of divide & conquer?");
                return;
            }
            if (guessedNumber > numberToGuess) {
                System.out.println("The number AI picked is lower than your guess.");
                countedNumber++; //Achtung (erst) hier countedNumber eins erhöht
            }
            if (guessedNumber < numberToGuess) {//e.i. MI.
                System.out.println("The number AI picked is higher than your guess.");
                countedNumber++;
            }
            else if (guessedNumber == numberToGuess) {
                System.out.println("You won wisenheimer!");
                julian = true;

            }
        }
    }
    public static int randomNumberBetweenOneAndHundred(){//das auch unten?

        return (int) (Math.random() * 101);} //mal 100 oder () * 100) + 1; MI


    public static void main(String[] args){
        App exercise3 = new App();

        System.out.println("Task 1: One Month Calendar");
        exercise3.oneMonthCalendar(30, 6);

        System.out.println("Task 2: Linear Congruential Method");
        long [] array1 = exercise3.lcg(123);
        //System.out.println(array1[1]);
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }
        //System.out.println((exercise3.lcg(123)).toString());

        System.out.println("Task 3: Guessing Game");

        exercise3.guessingGame(exercise3.randomNumberBetweenOneAndHundred());

        //System.out.println("Task 4: Random Number");
        //System.out.println(exercise3.randomNumberBetweenOneAndHundred());
        /*
        System.out.println("Task 5: Notendurchschnitt");
        exercise3.marks();

        System.out.println("Task 6: Fröhliche Zahlen");
        exercise3.happyNumbers();

        System.out.println("Task 6: Fröhliche Zahlen");
        exercise3.happyNumbers();

         */
    }
}