package calculator;

public class AddOperation extends AbstractOperation{
    @Override
    double operate(int firstNumber, int secondNumber) {
        return  firstNumber + secondNumber;
    }
}
