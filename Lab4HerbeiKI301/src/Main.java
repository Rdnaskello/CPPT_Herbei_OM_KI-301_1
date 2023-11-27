import Lab4HerbeiKI301.CalculateTheEquation;
import Lab4HerbeiKI301.CalculateTheEquationInterface;

public class Main {
    public static void main(String[] args) {
        CalculateTheEquationInterface calc = new CalculateTheEquation();

        try {
            System.out.println("y = sin(x)/cos(x) = " + calc.doCalculation(-5555));
            System.out.println("y = sin(x)/cos(x) = " + calc.doCalculationWithInputInside());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
