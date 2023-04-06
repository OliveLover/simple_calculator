package calculator;

public class MultiplyOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
