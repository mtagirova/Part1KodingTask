
//1O. Write a program to print out duplicate elements from an Array of Strings.

public class Task9 {
    public static void main(String[] args) {String[] strings = {"Ann", "Damir", "Dan", "Iryna", "Ann", "Dan"};


        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {

                if (strings[i].equals(strings[j])) {
                    System.out.println(strings[i]);
                    break;
                }
            }
        }

    }
}
