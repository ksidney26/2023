import java.util.Scanner;

public class Lab5
{
    public static void main (String[]  args)  {
            System.out.println("Java Lab 5" + "\n");
        //Question 1  Generate a table of conversion from Fahrenheit to Celsius using a for loop.
        //Start Fahrenheit column at 0 degrees and increase in steps of 5 degrees until 200 degrees. 
        //Display the Celsius temperature after five bank space. 
            System.out.println("Question 1" + "\n");
        for (int f = 0; f<=100; f++){
        int c = ((f - 32) * 5/9);
            System.out.println(f + ("     " + c ));
        }
            System.out.println("\n");
            
         //Question 2  Repeat Q1 with a while loop.
        System.out.println("Question 2" + "\n");
        int a = 0;
        int b = (a+1);
        while (a <101) {
            a = (a * b);
            int convert =((a - 32) * 5/9);
            
        System.out.println((a) + "     " + convert);
        a++;
        }
            System.out.println("\n");
        
        //Question 3  Calculate the sum of the first 50 odd numbers starting from 1, using a for loop. 
        System.out.println("Question 3" + "\n"); 
        int sum3;
        sum3 =0;
        for (int d = 1; d<=50; d= d+2){
            sum3 = d +sum3;  
            }
            System.out.println(sum3);
            System.out.println("\n");

        //Question 4  Write a program to calculate the sum of following series where n is input by user. Use while loop.
        //1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n 
        System.out.println("Question 4" + "\n");
        Scanner console = new Scanner(System.in);
        double k, n, sum;
        sum =0;
        System.out.println("Enter a number...");
        n= console.nextDouble();
        while (n >0) {
        k = (1.0/n);
        sum =(sum + k);
        n--;
        //System.out.println(sum);
        
        }
        System.out.println(sum);
        
        //Question 5  Two numbers are entered through the keyboard. 
        //Write a program to find the value of one number raised to the power of another. 
        //(Do not use Java built-in method. Use a loop)
        
        System.out.println("\n" + "Question 5" + "\n");
        
        int p, q, i, power;
        Scanner myscan = new Scanner(System.in);
        System.out.println("Enter a number...");
        p = myscan.nextInt();
        System.out.print("Enter another number...");
        q = myscan.nextInt();
        i =0;
        power =1;
        while (i<q) {
        power = (power * p);
        i++;
        }
        System.out.println(p + " to the power of " + q + " = " + power);
     }
}

        