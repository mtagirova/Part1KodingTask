//Task 4
//Create a 2D array of integers.
// Develop a program which will calculate the sum of even and odd numbers for that array.
public class Task4 {
    public static void main(String[] args) {
        int [][] numbers = {
                {11, 12, 13},
                {14, 15, 16},
                {17, 18, 19}
        };
        int sumEven = 0;
        int sumOdd = 0;

        for (int i=0; i< numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] % 2 == 0) {
                  sumEven+=numbers[i][j];

            }else{
                  sumOdd+=numbers[i][j];
                    }
            }
        }
        System.out.println("The sum of even numbers "+sumEven);
        System.out.println("The sum of even and odd numbers "+sumOdd);
    }
}
