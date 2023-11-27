// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
package Lab1HerbeiKI301;

import java.io.*;
import java.util.*;

public class Lab1HerbeiKI301 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        Scanner in = new Scanner(System.in);

        // Введення розміру квадратної матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        // Введення символу-заповнювача
        System.out.print("Введіть символ-заповнювач: ");
        filler = in.nextLine();

        // Перевірка валідності символу-заповнювача
        if (filler.length() != 1) {
            System.out.println("Некоректний символ-заповнювач. Програма завершує роботу.");
            return;
        }

        // Генерування зубчатого масиву
        arr = new char[nRows][];
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[nRows];
            for (int j = i; j < nRows - i; j++) {
                arr[i][j] = filler.charAt(0);
            }
        }

        // Виведення масиву на екран
        System.out.println("Згенерований зубчатий масив:");
        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Запис масиву у текстовий файл
        try {
            File dataFile = new File("output.txt");
            PrintWriter fout = new PrintWriter(dataFile);
            fout.println("Згенерований зубчатий масив:");
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    fout.print(arr[i][j] + " ");
                }
                fout.println();
            }
            fout.close();
            System.out.println("Масив збережено у файлі 'output.txt'");
        } catch (IOException e) {
            System.out.println("Помилка при записі у файл.");
        }
    }
}
