//  CSE 110 Spring 2021
//  Assignment  :1 Pizza Party
//  Name        :Erik Gotta
//  ASU ID      :
//  Total Time  :

import java.util.Scanner;

class Assignment1
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);

        //Input Collection
        System.out.print("Please enter how many pizzas purchased: ");
        int pizzasPurchased = in.nextInt();

        System.out.print("Please enter the number of slices per pizza: ");
        int numberSlices = in.nextInt();

        System.out.print("Please enter the number of adults attending: ");
        int numberAdults = in.nextInt();

        System.out.print("Please enter the number of children attending: ");
        int numberChildren = in.nextInt();

        //Computation
        int totalSlices = numberSlices * pizzasPurchased;
        int adultSlices = numberAdults * 2;
        int childrenTotalSlices = totalSlices - adultSlices;
        int childSlicesRecieved = childrenTotalSlices / numberChildren;
        int slicesLeftOver = totalSlices - adultSlices - (childSlicesRecieved * numberChildren);

        //Output
        System.out.println("\nTotal number of slices of pizza               : " + totalSlices);
        System.out.println("Total number of slices given to adults        : " + adultSlices);
        System.out.println("Total number of slices available for children : " + childrenTotalSlices);
        System.out.println("Number of slices each child will get          : " + childSlicesRecieved);
        System.out.println("Number of slices left over                    : " + slicesLeftOver);


        
    }
}