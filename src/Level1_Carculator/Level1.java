package Level1_Carculator;

import java.util.Scanner;

// Level1 클래스 없이 기본 연산을 수행하는 계산기(완성)
public class Level1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char operator;  //연산자 변수
        int firstNumber;  //첫번째 피연산자 변수
        int secondNumber;  //두번째 피연산자 변수
        String con;  //계속 진행할지 여부를 저장하는 변수

        //exit가 입력되기 전까지 반복해서 계산을 실행하는 반복문(do-while)
        do {
            //입력하는 수 및 연산자의 이상이 없는지 검사하는 반복문
            while (true) {
                System.out.print("첫 번째 수를 입력하세요 : ");
                firstNumber = sc.nextInt();

                System.out.print("연산자를 입력하세요 : ");
                operator = sc.next().charAt(0);

                System.out.print("두 번째 수를 입력하세요 : ");
                secondNumber = sc.nextInt();

                // 입력 받은 값에 오류가 있는지 판별하는 조건문(오류가 있으면 처음으로 돌아가고 없으면 반복문 탈출)
                if (firstNumber < 0 || secondNumber < 0) {  //양의 정수 입력 오류 시
                    System.out.println("양의 정수를 입력해 주세요.");
                } else if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {  //연산자 입력 오류 시
                    System.out.println("올바른 연산자를 입력해 주세요.");
                } else if (operator == '/' && secondNumber == 0) {  //나눗셈일때 두번째 피연산자가 0인 경우
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                } else {  //오류가 없을 경우 반복문 탈출
                    break;
                }
            }

            //조건 문으로 연산 수행 후 출력
            if (operator == '+') {
                System.out.println("연산 결과 : " + (firstNumber + secondNumber));
            } else if (operator == '-') {
                System.out.println("연산 결과 : " + (firstNumber - secondNumber));
            } else if (operator == '*') {
                System.out.println("연산 결과 : " + (firstNumber * secondNumber));
            } else {
                System.out.println("연산 결과 : " + (firstNumber / secondNumber));
            }

            System.out.print("계속 하시겠습니까?(exit 입력 시 종료) : ");
            con = sc.next();
            if (con.equals("exit")) {  //exit 입력시 반복문 탈출
                System.out.println("종료되었습니다.");
                break;
            }
        } while (true);
    }
}