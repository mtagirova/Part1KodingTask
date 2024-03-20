//.Create a program that uses an array to store a list of temperatures for a week,
// and then uses a loon to lind the hishest and lowest temperature for the week.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double[] temperatures = new double[7];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }
        double highestTemp = temperatures[0];
        double lowestTemp = temperatures[0];
        for (double temp : temperatures) {
            if (temp > highestTemp) {
                highestTemp = temp;
            }
            if (temp < lowestTemp) {
                lowestTemp = temp;
                        }
                    }

        System.out.println("Highest temperature of the week: " + highestTemp + " degrees");
        System.out.println("Lowest temperature of the week: " + lowestTemp + " degrees");

        }

    }

