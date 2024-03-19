//  Lab4b.java
//  Drivers license eligibility test
//  Quadrant in Coordiate System when X and Y are given
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

            System.out.println("\n");
        if (age >18){
            System.out.println("Eligible to Apply");
        }else if(age >=16 && age <=18){
            System.out.println("Student Licenses Eligible");
        }else{
            System.out.println("Not Eligible");
        }    
    }
    public static void Lab4b(String[] args) {
          Scanner myscan = new Scanner(System.in);
        int X, Y;
             System.out.println("Quadrant in Coordinate System when X and Y are given test" + "\n");
             System.out.println("Input your X value");
        X = myscan.nextInt();
             System.out.println("Input your Y value" + "\n");
        Y = myscan.nextInt();
        
//Based on the users X and Y values calculate the existing quadrant for that point.
             
            System.out.println("\n");
        if (X >0 && Y >0){
            System.out.println("Quandrant 1");
        }else if(X <0 && Y >0){
            System.out.println("Quandrant 2");
        }else if(X <0 && Y <0){
            System.out.println("Quandrant 3");
        }else if(X >0 && Y <0){
            System.out.println("Quandrant 4");
        }else if(X == 0) while (Y >0 || Y <0){
            System.out.println("y-axis");
        }else if(X >0 || X <0) while (Y == 0){
            System.out.println("x-axis");
        }else{
            System.out.println("Undefined");
        }
    }
}  