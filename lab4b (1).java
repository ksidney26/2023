//  Lab4b.java
//  Drivers license eligibility test.
//  Quadrant in Coordiate System when X and Y are given.
import  java.util.Scanner;
public class Lab4b
{
//Ask for user input for age to determine Drivers license eligibility.
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);
        int age;
            System.out.println("Drivers License Eligibility Test" + "\n");
            System.out.println("What is your current age in years? " + "\n");
        age = myscan.nextInt();
        
//Calculate the users age to see if they are eliglble at all and if so would it be for a student license or a standard license.

        if (age >18){
            System.out.println("\n" + "Eligible to Apply");
            //If user is older than 18.
        }else if(age >=16 && age <=18){
            System.out.println("\n" + "Student Licenses Eligible");
            //If user is between age 16 and 18
        }else{
            System.out.println("\n" + "Not Eligible");
            //If user is younger than 16
        }    
            System.out.println("\n");
            Lab4b(args);
    // Way to add two functions sequentially.
    }

    public static void Lab4b(String[] args) {
              Scanner myscan = new Scanner(System.in);
        int X, Y;
             System.out.println("Quadrant in Coordinate System when X and Y are given test" + "\n");
             //Using the users interval decide what area of the graph it would fall on.
             System.out.println("Input your X value using only Real Numbers");
             while (!myscan.hasNextInt())  {
                myscan.next(); //to discard the input.
                //input validation
                System.out.println("Not a Real Number try again." + "\n");
                System.out.println("Input your X value using only Real Numbers");}
        X = myscan.nextInt();
             System.out.println("Input your Y value using only Real Numbers");
             while (!myscan.hasNextInt())  {
                myscan.next(); //to discard the input.
                //input validation
                System.out.println("Not a Real Number try again." + "\n");
                System.out.println("Input your Y value using only Real Numbers");}   
        Y = myscan.nextInt();//Based on the users X and Y values calculate the existing quadrant or axis for that point.
        if (X ==0 && Y ==0){
            System.out.println("\n" + "Undefined");
        }else if(X >0 && Y >0){
            System.out.println("\n" + "Quandrant 1");
        }else if(X <0 && Y >0){
            System.out.println("\n" + "Quandrant 2");
        }else if(X <0 && Y <0){
            System.out.println("\n" + "Quandrant 3");
        }else if(X >0 && Y <0){
            System.out.println("\n" + "Quandrant 4");
        }else if(X ==0 && Y !=0){
            System.out.println("\n" + "y-axis");
        }else if(X !=0 && Y ==0){
            System.out.println("\n" + "x-axis");
        }else{
            System.out.println("\n" + "Undefined");
        }
    }
}  
  