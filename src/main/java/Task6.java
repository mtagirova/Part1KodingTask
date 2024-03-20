import java.util.Scanner;

//Write a lava program to check whether a given number is prime or not?


 import java.util.Scanner;

 public class Task6 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter a number: ");
         int number = scanner.nextInt();
         scanner.close();

         boolean isPrime = true;
         if (number <= 1) {
             isPrime = false;
         } else {
             for (int i = 2; i * i <= number; i++) {
                 if (number % i == 0) {
                     isPrime = false;
                     break;
                 }
             }
         }

         System.out.println(number + (isPrime ? " is a prime number." : " is not a prime number."));
     }
 }
