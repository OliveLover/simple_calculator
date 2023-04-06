package calculator;

public class DivideOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }
}
