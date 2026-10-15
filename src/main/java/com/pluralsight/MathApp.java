package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
        // declare variables here
        // then code solution
        // then use Systme.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        // REPEAT OFR NEXT EXERCISE

        // Step 1
        // Question 1
        double bobSalary = 80000.00;
        double garySalary = 150000.00;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        // Question 2
        double carPrice = 34999.99;
        double truckPrice = 59999.99;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest one is priced " + lowestPrice);

        // Question 3
        double radius = 7.25;
        double circleArea = 3.14 * ( radius * radius);
        System.out.println("The area of a circle with a radius of " + radius + " is " + circleArea);

        // Question 4
        double num = 5.0;
        double squareRoot = Math.sqrt(num);
        System.out.println("The square root of " + num + " is " + squareRoot);



    }
}
