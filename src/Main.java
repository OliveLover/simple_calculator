import calculator.CalculatorApp;

public class Main {
    public static void main(String[] args) {
        boolean calculatedEnded = false;
        //구현 2

        while (!calculatedEnded) {
            try {
                calculatedEnded = CalculatorApp.start();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}