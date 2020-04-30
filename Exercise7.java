/*
Program Name: Exercise7

Variables/Types: 2 int 1 String

Inputs: yes

If/else statements: yes

Loops: no
*/
import java.util.Random;

public class Exercise7{
    public static void main(String[] args){

    int[] numbers = {10,20,30,40,50,60,70,80,90,100};
    Exercise7 m = new Exercise7();

    System.out.println("First number : " + numbers[0]);
    System.out.println("Last number : " + numbers[numbers.length-1]);



        System.out.println(" ");
        m.reorganize(numbers);
        for(int i=0; i<10 ; i++){
            System.out.println(numbers[i]);
            }
    }


    public int[] reorganize(int [] numbers){
        Random rnd = new Random();
        for (int i =  numbers.length  - 1; i >= 0; i--){
            int index = rnd.nextInt(i+1);

            int a = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = a ;
            }
        return numbers;
        }
}