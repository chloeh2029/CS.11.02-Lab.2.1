/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Chloe Hou
*****************************************************************************************************
*/

// Dear Ms. Momeni, I struggled to run my code and test my methods because "java: package org.junit.jupiter.api
// does not exist"; I tried my best to download the package, but was unsure how and gave up. So instead, I just
// copied my code from Main.java into another new project and ran it for testing, if that's okay?

public class Main {

    public static void main(String[] args) {

        int sumOfTwoNumbers = add(5,7);
        System.out.println(sumOfTwoNumbers);

        int sumOfFourNumbers = add(5,7,6,6);
        System.out.println(sumOfFourNumbers);

        String morningGreeting = morningGreeting("Toby Fox");
        System.out.println(morningGreeting);

        String afternoonGreeting = afternoonGreeting("Mac Miller");
        System.out.println(afternoonGreeting);

        String tripledText = triple("oohbaby");
        System.out.println(tripledText);

        double halvedNumber = half(19);
        System.out.println(halvedNumber);

        int roundedPositiveFirst = roundPositiveValueToNearestInteger(8.5);
        System.out.println(roundedPositiveFirst);

        int roundedPositiveSecond = roundPositiveValueToNearestInteger(8.49);
        System.out.println(roundedPositiveSecond);

        int roundedNegativeFirst = roundNegativeValueToNearestInteger(-8.49);
        System.out.println(roundedNegativeFirst);

        int roundedNegativeSecond = roundNegativeValueToNearestInteger(-8.5);
        System.out.println(roundedNegativeSecond);

    }

    // 1. add
    public static int add (int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    // 2. add
    public static int add (int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        return add(add(firstNumber,secondNumber),add(thirdNumber,fourthNumber));
    }

    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好，" + name + "!";
    }

    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好，" + name + "!";
    }

    // 5. triple
    public static String triple (String text){
        return text + text + text;
    }

    // 6. half
    public static double half (int number){
        return number / 2.0;
    }

    // 7. roundPositiveValueToNearestInteger
    public static int roundPositiveValueToNearestInteger(double positiveValue){
        return (int) (positiveValue + 0.5);
    }

    // 8. roundNegativeValueToNearestInteger
    public static int roundNegativeValueToNearestInteger(double negativeValue){
        return (int) (negativeValue - 0.5);
    }

}
