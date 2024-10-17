## Lv1. 클래스 없이 기본적인 연산을 수행하는 계산기

- 양의 정수(0포함)을 입력받기
- 사칙연산(+,-,*,/)을 입력받기
- 입력받은 정수와 연산기호를 사용해 연산을 진행하고 결과 출력하기
- 반복문을 사용하되, 반복문의 종료를 알려주는 "exit"문자열을 입력하기 전까지 무한으로 계산하기

-> Scanner로 피연산자 2개와 연산자 기호를 받아서 입력받은 값에 오류가 있는지 판별한다
-> 오류가 없을 시 if문을 통해 연산자를 구분하고 계산 후 출력한다.

## Lv2. 클래스를 적용한 계산기

- 사칙연산 수행 후 결과값을 반환하는 메소드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스 생성
- App 클래스에 Calculator 클래스가 적용되게 수정
- App 클래스에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정(캡슐화)
- Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능의 메소드를 구현하고 App클래스에서 삭제 메소드가 활용될 수 있게 수정

-> Lv1의 if문으로 연산자를 구분하고 계산하는 부분을 Calculator클래스의 calculate 메소드를 만들어서 분류했다.
-> Calculator 클래스에 계산 결과들을 저장하는 ArrayList가 있다.
-> 또한 Calculator 클래스에는 저장된 계산 결과들을 조회하기 위한 getResult(), 수정하기 위한 setResult(), 첫 번째 데이터를 삭제하기 위한 removeResult()메소드가 있다.

## Lv3. Enum, 제네릭, 람다 & 스트림을 이해한 계산기 만들기

- Enum 타입을 활용하여 연산자 타입에 대한 정보를 관리하고 이를 사칙연산 계산기에 적용
- 제네릭을 활용해 double 타입을 받아도 연산이 수행될 수 있도록 수정
- 저장된 값들 중에 Scanner로 받은 값 보다 큰 결과값들을 출력하는 메소드 작성(람다&스트림으로 작성하기)

-> Calculator클래스를 제네릭 클래스로 만들어서 calculate() 메소드가 다양한 타입의 값을 받을 수 있도록 수정했다.
-> enum타입의 OperatorType을 만들어서 연산자를 관리하고 calculate() 메소드 부분을 맞게 수정했다.(연산자를 구별하는 if문을 지우고 enum타입의 OperatorType에서 연산자를 탐색해 입력받은 연산자와 같은 값이면 연산을 실행하는 for문 작성)
-> 람다&스트림으로 입력받은 값보다 큰 값들을 출력하는 bigNumber() 메소드를 작성했다.
