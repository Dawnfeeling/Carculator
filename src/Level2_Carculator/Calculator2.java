package Level2_Carculator;

import java.util.ArrayList;

public class Calculator2 {
    //연산 결과를 순서대로 저장하는 ArrayList(), 외부에서 접근할 수 없게 private 선언
    private ArrayList<Integer> resultList = new ArrayList<Integer>();

    public int result;  //연산 결과를 임시로 저장하는 변수

    //사칙연산 수행 후 결과를 반환하는 메소드
    public double calculate(char operator, int firstNumber, int secondNumber) {
        if (operator == '+') {
            result = firstNumber + secondNumber;
            resultList.add(result);
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
            resultList.add(result);
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
            resultList.add(result);
        } else {
            result = firstNumber / secondNumber;
            resultList.add(result);
        }
        return result;
    }

    //연산 결과가 저장된 resultList에 접근하는 메소드들
    //결과를 조회하는 메소드
    public void getResult() {
        for(int i = 0; i < resultList.size(); i++) {
            System.out.println((i+1) + "번째 연산 결과 : " + resultList.get(i));
        }
    }

    //index와 수정값을 받아서 결과를 수정하는 메소드
    public void setResult(int index, int result) {
        resultList.set(index, result);
    }

    //가장 먼저 저장된 결과를 삭제하는 메소드
    public void removeResult() {
        resultList.removeFirst();
    }
}