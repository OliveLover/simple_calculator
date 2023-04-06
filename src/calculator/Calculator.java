package calculator;

public class Calculator {
    private int firstNumber;
    private int secondNumber;
    private AbstractOperation operation;

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public void setFirstNumber (int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber (int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double calculate() {
        double answer = 0;
        answer = operation.operate(firstNumber, secondNumber);
        return answer;
    }
}
