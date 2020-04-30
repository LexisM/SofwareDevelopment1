/*
Program Name: Exercise5

Variables/Types: 4 int

Inputs: no

If/else statements: no

Loops: yes
*/

public class Exercise5{
    public static void main(String[] args){

    int[] x = {20,30,40,50};
    int sum =0, pro=1;

    for(int i=0; i<4; i++){
        sum = sum + x[i];
        pro = pro * x[i];
    }

        System.out.println("Sum : " + sum);
        System.out.println("Product : " + pro);
        System.out.println("Average: " + (sum/4));



    }
}