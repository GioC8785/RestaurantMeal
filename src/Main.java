import java.util.Scanner;

/*
 Problem: Create a program to calculate the total cost of a meal at a restaurant.
 The program should ask the user for the cost of the meal, the percentage of tip they want to leave, and the tax rate.
 Then, it should calculate and display the total cost of the meal including tip and tax.
 */

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    double mealPrice = mealPrice();
    double tipLeft = tipLeft();
    double taxRate = taxRate();
    double totalCost = totalPrice(mealPrice,tipLeft,taxRate);
    displayTotalCost(totalCost);


    }
    public static double mealPrice (){
        System.out.println("Enter the meal price: ");
        double mealPrice;
        return mealPrice = sc.nextDouble();
    }
    public static double tipLeft (){
        System.out.println("Enter the percentage of the tip: ");
        double tip;
        return tip = sc.nextDouble();
    }
    public static double taxRate (){
        System.out.println("Enter the tax rate: ");
        double taxRate;
        return taxRate = sc.nextDouble();
    }
    public static double totalPrice (double mealPrice, double tipLeft, double taxRate){
         double tipAmount = mealPrice * (tipLeft / 100);
         double taxAmount = mealPrice * (taxRate / 100);
         double totalCost = mealPrice + taxAmount + tipAmount;

        return totalCost;
    }
    public static void displayTotalCost (double totalCost){
        System.out.println("Your total is: " + totalCost);
    }
}