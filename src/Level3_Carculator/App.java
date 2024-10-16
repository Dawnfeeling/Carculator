package Level3_Carculator;

import java.util.Scanner;

// Level3 enum, 제네릭, 람다&스트림 이용하기
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();  //Calculator 클래스 객체 생성

        Scanner sc = new Scanner(System.in);

        char operator;  //연산자 변수
        double firstNumber;  //첫번째 피연산자 변수
        double secondNumber;  //두번째 피연산자 변수
        String choice;  //계속 진행할지 여부를 저장하는 변수


        //exit가 입력되기 전까지 반복해서 계산을 실행하는 반복문(do-while)
        do {
            //입력하는 수 및 연산자의 이상이 없는지 검사하는 반복문
            while (true) {
                System.out.print("첫 번째 수를 입력하세요 : ");
                firstNumber = sc.nextDouble();

                System.out.print("연산자를 입력하세요 : ");
                operator = sc.next().charAt(0);

                System.out.print("두 번째 수를 입력하세요 : ");
                secondNumber = sc.nextDouble();


                // 입력 받은 값에 오류가 있는지 판별하는 조건문(오류가 있으면 처음으로 돌아가고 없으면 반복문 탈출)
                if (firstNumber < 0 || secondNumber < 0) {  //양의 정수 입력 오류 시
                    System.out.println("양의 실수를 입력해 주세요.");
                } else if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {  //연산자 입력 오류 시
                    System.out.println("올바른 연산자를 입력해 주세요.");
                } else if (operator == '/' && secondNumber == 0) {  //나눗셈일때 두번째 피연산자가 0인 경우 오류
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                } else {  //오류가 없을 경우 반복문 탈출
                    break;
                }
            }

            System.out.println("연산 결과 : " + calculator.calculate(operator, firstNumber, secondNumber));  //연산 결과 출력
            calculator.getResult();  //저장된 데이터 출력
            calculator.bigNumber(firstNumber, secondNumber);  //입력한 두 수 보다 큰 결과값들을 출력


            sc.nextLine();  //개행문자로 인한 공백 방지용 코드

            //저장된 결과를 확인하고 삭제하는 반복문
            while(true) {
                System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까?(remove 입력 시 삭제) : ");
                choice = sc.nextLine();
                if (choice.equals("remove")) {
                    calculator.removeResult();  //첫 번째 데이터를 삭제
                    calculator.getResult();  //이후의 저장된 연산 결과 출력
                } else {
                    break;
                }
            }


            System.out.print("계산을 계속 하시겠습니까?(exit 입력 시 종료) : ");
            choice = sc.nextLine();
            if (choice.equals("exit")) {  //exit 입력시 반복문 탈출
                System.out.println("종료되었습니다.");
                break;
            } else {
                System.out.println("계산을 계속합니다.");
            }
        } while (true);
    }
}