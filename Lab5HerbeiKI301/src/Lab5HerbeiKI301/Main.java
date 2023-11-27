package Lab5HerbeiKI301;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        PrintWriter fout = null;
        try
        {
            System.out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            fout = new PrintWriter(new File(fName));

            Calculator calculation = new Calculator();
            System.out.print("Enter X: ");
            fout.print(calculation.Calc(in.nextInt()));
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
        catch (FileNotFoundException e)
        {
            System.out.print("Exception reason: Perhaps wrong file path \n" + e.getMessage());
        }
        finally
        {
            if(fout != null){
                fout.flush();
                fout.close();
            }
            else {
                System.out.println("Об'єкт yourObject є null");
            }

        }
    }
}