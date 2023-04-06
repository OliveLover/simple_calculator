import calculator.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Calculator calculator  = new Calculator();

        int firstNumber = in.nextInt();
        String operator = in.next();
        int secondNumber = in.nextInt();

        switch (operator) {
            case "+" -> calculator.setOperation(new AddOperation());
            case "-" -> calculator.setOperation(new SubtractOperation());
            case "*" -> calculator.setOperation(new MultiplyOperation());
            case "/" -> calculator.setOperation(new DivideOperation());
            default -> System.out.println("잘못된 연산입니다.");
        }

        double result = calculator.calculate(firstNumber, secondNumber);
        System.out.println(result);
    }
}