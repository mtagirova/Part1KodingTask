

public class Task10 {
    public static void main(String[] args) {
        int[] numbers={6,7,9,10,12,13};
        int maxNumber=0;
        int secondNumber=0;
        for(int i=0; i<numbers.length; i++){
            if(i > maxNumber) {
                secondNumber = maxNumber;
                secondNumber = i;

            }
        }

    }
}
