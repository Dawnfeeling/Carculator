package Level3_Carculator;

import java.util.ArrayList;

//제네릭을 사용해 다양한 타입을 받을 수 있게 구현
public class Calculator<T extends Number> {

    //연산 결과를 순서대로 저장하는 ArrayList(), 외부에서 접근할 수 없게 private 선언
    private ArrayList<Double> resultList = new ArrayList<>();

    //사칙연산 수행 후 결과를 반환하는 메소드(ENUM으로 코드 간소화)
    public double calculate(char operator, T firstNumber, T secondNumber) {
        double result = 0;
        for(OperatorType op : OperatorType.values()) {  //ENUM의 연산자를 모두 탐색
            if(op.getOperator() == operator) {  //입력한 연산자와 동일하면 구문 실행
                result = op.operate(firstNumber.doubleValue(), secondNumber.doubleValue());  //연산 후 result에 저장
                resultList.add(result);
            }
        }
        return result;  //연산 결과 반환
    }

    //연산 결과가 저장된 resultList에 접근하는 메소드들
    //결과를 조회하는 메소드
    public void getResult() {
        if (resultList.isEmpty()) {
            System.out.println("현재 계산 결과가 없습니다.");
        } else {
            System.out.println("현재 저장된 데이터");
            for (int i = 0; i < resultList.size(); i++) {
                System.out.println((i + 1) + "번째 연산 결과 : " + resultList.get(i));
            }
        }
    }

    //index와 수정값을 받아서 결과를 수정하는 메소드
    public void setResult(int index, double result) {
        resultList.set(index, result);
    }

    //가장 먼저 저장된 결과를 삭제하는 메소드
    public void removeResult() {
        if (resultList.isEmpty()) {
            System.out.print("");
        } else {
            System.out.println("삭제되었습니다.");
            resultList.removeFirst();
        }
    }

    //입력받은 값 보다 큰 결과값들을 출력하는 메소드(람다&스트림)
    public void bigNumber(T firstNumber, T secondNumber) {
        System.out.println("현재 입력한 수 보다 큰 수들");
        double num = Math.max(firstNumber.doubleValue(), secondNumber.doubleValue());  //두 수 중에 큰 숫자를 num에 저장
        resultList.stream()  //stream으로 num보다 큰 수를 출력
                .filter(result -> result > num)
                .forEach(System.out::println);
    }
}