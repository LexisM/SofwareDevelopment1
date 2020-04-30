/*
Program Name: Exercise3

Variables/Types: 1 int

Inputs: yes

If/else statements: yes

Loops: no
*/
import java.util.Scanner;

public class Exercise3{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter first number : ");
    int num1 = scn.nextInt();

    System.out.println(" ");

    if(num1 < 23){
        System.out.println(num1 + " is less than my age (23)");
    }else if(num1 == 23){
         System.out.println(num1 + " is equal to my age (23)");
    }else{
        System.out.println(num1 + " is greater than my age (23)");
        }


        System.out.println(" ");



    }
}