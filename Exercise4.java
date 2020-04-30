/*
Program Name: Exercise4

Variables/Types: 2 int

Inputs: yes

If/else statements: yes

Loops: yes
*/
import java.util.Scanner;

public class Exercise4{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    boolean pass=false;
    int num = 0;
    while(pass!=true){
        System.out.print("Enter a number from 1 to 10: ");
        num = scn.nextInt();

        if((num>0) && (num<11)){
            pass = true;

         }else{
         System.out.println(" Invalid number entered. Please try again. ");
             }

     System.out.println();

    }
        for(int i=1; i<=num; i++){
            System.out.println(i + ". Lexis");
            }

        System.out.println(" ");



    }
}