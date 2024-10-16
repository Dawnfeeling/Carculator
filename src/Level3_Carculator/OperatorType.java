package Level3_Carculator;

//연산자를 관리하는 enum 클래스
public enum OperatorType {
    ADD('+'){
        @Override
        public double operate(double firstNumber, double secondNumber) {
            return firstNumber + secondNumber;
        }
    },
    SUB('-'){
        @Override
        public double operate(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }
    },
    MUL('*'){
        @Override
        public double operate(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
        }
    },
    DIV('/'){
        @Override
        public double operate(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
        }
    };

    private final char operator;

    //생성자
    OperatorType(char operater){
        this.operator = operater;
    }

    //getter
    public char getOperator(){
        return operator;
    }

    //enum 내의 operate를 구현하도록 추상메소드 선언
    public abstract double operate(double firstNumber, double secondNumber);
}