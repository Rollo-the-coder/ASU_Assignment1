//  CSE 110 Spring 2021
//  Assignment  : 1 "Pizza Party"
//  Name        : Erik Gotta
//  ASU ID      : 1222628953
//  Total Time  : 60 minutes

import java.util.Scanner;


// A class to take user input about a pizza party and give back how the pizza should be divided among guests
class Assignment1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //Pizza Input Collection
        System.out.print("\nNumber of pizzas purchased        : ");
        int pizzasPurchased = sc.nextInt();

        System.out.print("Number of slices per pizza        : ");
        int numberSlices = sc.nextInt();

        System.out.print("Number of adults                  : ");
        int numberAdults = sc.nextInt();

        System.out.print("Number of children                : ");
        int numberChildren = sc.nextInt();

        //Computation of inputs
        int totalSlices = numberSlices * pizzasPurchased;
        int adultSlices = numberAdults * 2;
        int childrenTotalSlices = totalSlices - adultSlices;
        int childSlicesRecieved = childrenTotalSlices / numberChildren;
        int slicesLeftOver = totalSlices - adultSlices - (childSlicesRecieved * numberChildren);

        //Output Statements / Results
        System.out.println("\nTotal number of slices of pizza               : " + totalSlices);
        System.out.println("Total number of slices given to adults        : " + adultSlices);
        System.out.println("Total number of slices available for children : " + childrenTotalSlices);
        System.out.println("Number of slices each child will get          : " + childSlicesRecieved);
        System.out.println("Number of slices left over                    : " + slicesLeftOver);


        sc.close();
    }
}