import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.io.IOException;



public class orderer {
/**
 * Author: Danyil Khramtsov
* */

    public static void main (String args[])throws IOException {

        File file = new File("C:\\SeleniTests\\ForAB0\\_1\\src\\main\\resources\\20.txt");

        Scanner scanner =  new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(", ");

        int [] numbers = new int[20];
        int counter = 0;

        for(String number : numbersString) {
            numbers[counter++] = Integer.parseInt(number);
        }
            System.out.print("Массив до сортировки:\n" + Arrays.toString(numbers ) + "\n");
        scanner.close();

        Arrays.sort(numbers);
//Выводим отсортированный массив на консоль.
        System.out.println("Массив отсортирован по возрастанию:\n");

        for(int i = 0; i <  numbers.length; i++) {

            System.out.print(numbers[i] + "  ");
        }

        System.out.println("\nМассив отсортирован по убыванию:\n");

        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {
            int t = numbers[i]; numbers[i] = numbers[j]; numbers[j] = t;
        }

        for(int i = 0; i <  numbers.length; i++) {

            System.out.print(numbers[i] + "  ");

        }
    }
}
