//Create an array of integer values. After the array is created,
// calculate the sum of all stored elements in that array.
public class Task2 {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50,60};
        int sum=0;
        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];

        }
        System.out.println("Sum of all stored elements in that array: "+sum);
    }
}
