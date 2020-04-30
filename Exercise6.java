/*
Program Name: Exercise6

Variables/Types: 2 int 1 String

Inputs: yes

If/else statements: yes

Loops: no
*/
import java.util.Scanner;

public class Exercise6{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter a simbol : ");
    String simbol = scn.next();

    System.out.print("Enter number of rows : ");
    int rows = scn.nextInt();

    System.out.print("Enter number of columns : ");
    int cols = scn.nextInt();

    System.out.println(" ");

    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++){
            System.out.print(simbol + " ");
            }
        System.out.println();
        }


        System.out.println(" ");



    }
}