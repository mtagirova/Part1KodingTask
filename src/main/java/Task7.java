//Write a java Program to print the first 10 numbers of Fibonacci series
//The formula to calculate the Fibonacci Sequence is: Fn = Fn-1+Fn-2
//
//Take: F0=0 and F1=1
public class Task7 {
    public static void main(String[] args) {
        int n=10;
        int firstNumber=0;
        int secondNumber=1;

        System.out.println("the first " + n + "numbers of Fibonacci series");
        for (n=0; n<10; n++){
            System.out.println(firstNumber+ " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
