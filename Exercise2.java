/*
Program Name: Exercise2

Variables/Types: 2 int

Inputs: yes

If/else statements: no

Loops: no
*/
import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);


    System.out.print("Enter first number : ");
    int num1 = scn.nextInt();
    System.out.print("Enter second number : ");
    int num2 = scn.nextInt();

    System.out.println(" ");
    System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
    System.out.println(num1 + " - " + num2 + " = " + (num1-num2) );
    System.out.println(num1 + " * " + num2 + " = " + (num1*num2) );

    }
}