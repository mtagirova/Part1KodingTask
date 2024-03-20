//Create a 2D array or integer type where you will store odd and even numbers.
// Develop a program which will identity/print the even numbers
//Only.
public class Task3 {
    public static void main(String[] args) {
        int[][] numbers ={
            { 11,12,13},
            { 14,15,16},
            { 17,18,19}
        };
        System.out.println("Enter even numbers:");

        for (int i=0;i< numbers.length;i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }

            }
        }

    }
}
