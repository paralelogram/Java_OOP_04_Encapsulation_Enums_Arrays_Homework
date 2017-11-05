import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        int [] array = new int[10];
        int max = array[0];
        int sum = 0;
        int amount = 0;
        boolean bool = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("input 10 integer digits");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int p = 0;
        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > max) {
                max = array[i];
            }

            if (array[i] > 0) {
                sum += array[i];
                p++;
            }

            if (array[i] < 0) {
                n++;
            }

            if (array[i] != 0){
                amount += array[i];
            }

            if (n < p) {
                bool = true;
            }
            if (n > p) {
                bool = false;
            }
        }
        System.out.println("the biggest of numbers = " + max);
        System.out.println("the sum of positive numbers in the array = " + sum);
        System.out.println("the amount of negative and positive numbers in the array = " + amount);
        System.out.println("are positive ones more than negative? \n" + bool);
    }
}