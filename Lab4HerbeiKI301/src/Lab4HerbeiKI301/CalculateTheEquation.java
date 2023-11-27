package Lab4HerbeiKI301;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateTheEquation implements CalculateTheEquationInterface {
    @Override
    public double doCalculation(double variable) throws ArithmeticException {
        try {
            return Math.sin(variable) / Math.cos(variable);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
            throw e; // Повторний кидок виключення
        }
    }

    @Override
    public double doCalculationWithInputInside() throws ArithmeticException, InputMismatchException {
        try {
            Scanner inputScanner = new Scanner(System.in);
            System.out.print("Enter value: ");
            double value = inputScanner.nextDouble();
            inputScanner.nextLine();
            return Math.sin(value) / Math.cos(value);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception: illegal value.");
            throw e;
        } catch (InputMismatchException e){
            System.out.println("Input exception: illegal value.");
            throw e;
        }
    }
}

