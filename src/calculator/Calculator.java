package calculator;

public class Calculator {
    private AbstractOperation operation;
    public Calculator () {
        System.out.println("계산기가 켜졌습니다.");
        System.out.println("첫번째수, 연산자, 두번째수를 띄어쓰기로 구분하여 입력해주세요.");
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(int firstNumber, int secondNumber) {
        return operation.operate(firstNumber, secondNumber);
    }
}
