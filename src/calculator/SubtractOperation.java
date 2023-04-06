package calculator;

public class SubtractOperation extends AbstractOperation {
    @Override
    double operate(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
