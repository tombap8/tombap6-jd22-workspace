// Java02.변수와 데이터형
public class Java02 {
    public static void main(String[] args) {
        /*
         * [ 자바 변수 ]
         * 변수는 데이터 값을 저장하기 위한 컨테이너
         * 
         * [ 변수의 선언과 사용형식 ]
         * 데이터형 변수명 = type에 맞는값
         */
        System.out.println("자바변수");

        /*
         * [ Java 변수 유형 ]
         * 
         * 1. String
         * - "Hello"와 같은 텍스트를 저장 문자열 값은 큰따옴표사용!
         * 2. int
         * - 123 또는 -123과 같이 소수 없이 정수(정수)를 저장
         * 3. float
         * - 19.99 또는 -19.99와 같은 소수를 사용.
         * 부동 소수점 숫자를 저장
         * 4. char
         * - 'a' 또는 'B'와 같은 단일 문자를 저장. Char 값은 작은따옴표사용!
         * 5. boolean
         * - true / false
         */
        // 1. 문자형
        String nameKim = "김석구 멋쨍이~!";
        System.out.println(nameKim);

        // 2. 정수형
        int myNum = 1000;
        System.out.println(myNum + "라인의 코딩을 짬!");

        // 기존 변수에 다른 값이 덮어써짐!
        myNum = 2000;
        System.out.println(myNum + "라인의 코딩을 짬!");

        // 자바에서 상수는? 변수선언 앞에 final키워드 사용!
        final int newNum = 7000;
        // newNum = 8000; 에러남! 재할당불가!
        System.out.println(newNum + "라인을 또 짬!");

        // 변수와 문자와의 결합 : (+) 연산자 사용!
        String nameTom = "톰 행크스";
        System.out.println("안녕~! " + nameTom);

        String familyName = "김씨";
        String myName = "오룡";
        String fullName = familyName + myName;
        System.out.println(fullName);

        // 변수를 한번에 선언과 할당!
        int x = 5, y = 6, z = 50;
        System.out.println(x + "와" + y + "와" + z + "의 합은? "
                + (x + y + z));

        // 이런방식도 있어~!
        // 같은 형의 변수를 한꺼번에 선언하고
        // 같은 값을 여러 같은 형의 변수에 넣을때!
        int xx, yy, zz;
        xx = yy = zz = 50;
        System.out.println(xx + "를 세번더하면? " + (xx + yy + zz));

        /*
         * [ 변수 이름 규칙 ]
         * 
         * 1. 문자, 숫자, 밑줄 및 달러 기호 포함가능
         * 2. 문자로 시작
         * 3. 소문자로 시작
         * 4. 중간 공백 안됨
         * 5. $ 및 _로 시작할 수도 있음
         * 6. 대소문자를 구분
         * 7. 예약어사용불가
         */

        /***************************************
         * [ 데이터 유형 ]
         * -> 두 그룹으로 나뉩니다.
         * 
         * 1. 기본 데이터 유형 (8가지)
         * 
         * - 정수형 데이터
         * (1) byte 1 byte -128 ~ 127
         * (2) short 2 bytes -32,768 ~ 32,767
         * (3) int 4 bytes -21억 ~ 21억
         * (4) long 8 bytes -9백경 ~ 9백경
         * 
         * - 실수형 데이터
         * (5) float 4 bytes 소수 6 to 7 자릿수
         * (6) double 8 bytes 소수 15 자릿수
         * 
         * (7) boolean 1 bit true / false
         * (8) char 2 bytes 한문자 or 아스키값
         * 
         * ->>>(질문)
         * Java에는 많은 숫자 유형이 있지만
         * 숫자에 가장 많이 사용되는 유형은?
         * (답)
         * int(정수) 및 double(부동 소수점 숫자)
         * 
         * 2. 기본이 아닌 데이터 유형
         * - String, 배열 및 클래스 등
         * 
         ***************************************/
        int iamInt = 5; // int형
        float iamFloat = 5.99f; // float형
        char iamChar = 'D'; // char형
        // -> "D"라고 쌍따옴표를 쓰면 에러!
        // 한글자 전용 홑따옴표만 쓸 수 있음!!!
        boolean iamBoolean = true; // boolean형
        String iamString = "안뇽~!"; // String형

        System.out.println("난정수: " + iamInt);
        System.out.println("난실수: " + iamFloat);
        System.out.println("난한글자: " + iamChar);
        System.out.println("난불린: " + iamBoolean);
        System.out.println("난문자: " + iamString);

        System.out.println("");

        // 데이터형별 크기체크
        System.out.println("[데이터형별 크기체크]");
        // 1. byte : -128 ~ 127
        byte numByte = -128;
        // -129 와 같이 범위밖은 에러!
        System.out.println("byte: " + numByte);

        // 2. short : -32,768 ~ 32,767
        // -> 0때문에 +자릿수 하나적음
        short numShort = 32767;
        System.out.println("short: " + numShort);

        // 3. int : -21억 ~ 21억
        // 세부범위: -2,147,483,648 ~ 2,147,483,647
        int numInt = 2147483647;
        System.out.println("int: " + numInt);

        // 4. long : -9백경 ~ 9백경
        // 세부범위: -9,223,372,036,854,775,808 ~
        // 9,223,372,036,854,775,807
        // 특이사항 -> 범위안의 숫자일 지라도 끝에 L
        // 표시를 하지 않으면 int형 상수로 처리한다!
        // int범위를 벗어나는 에러가 발생한다!
        // 끝에 L자를 써줘야 한다(소문자l도 가능 but헷갈림!)
        long numLong = 9223372036854775807L;
        System.out.println("long: " + numLong);

        // 5. float : 소수 자릿수 6 ~ 7
        // 특이사항 : 숫자데이터 끝에 F로 처리해야 같은형임!
        // 소수점 아래 넘치는 경우 7째 자리에서 반올림함!
        float numFloat = 5.12345678F; // 결과: 5.123457
        System.out.println("float: " + numFloat);

        // 6. double : 소수 자릿수 15
        // 특이사항 : 숫자데이터 끝에 D로 처리해야 같은형임!
        // float이나 double은 근사값이므로 끝자리수가 달라질 수 있음!
        double numDouble = 7.123456789123456789123456D;
        System.out.println("double: " + numDouble);

        // 과학적인 10의 거듭제곱 표시 사용가능(e+자릿수)
        // float이나 double은 소수점이 없으면 기본 한자릿수 표시함
        float f1 = 35e3F;
        double d1 = 12E4D;
        System.out.println("거듭제곱 출력: \n" + f1 + "\n" + d1);
        // \(역슬래쉬)n 은 줄바꿈기호

        System.out.println();
        // prinln()만 호출하면 엔터만적용
        System.out.println("[불린값 출력]");

        // 불린값 (ture / false)
        // if문이나 조건문에 사용됨!
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println("자바는 재밌나?" + isJavaFun);
        // 삼항연산자 -> 비?집:놀이동산
        System.out.println("자바는 재밌나?" + (isJavaFun ? "응" : "아니"));
        System.out.println("물고기 맛있나?" + isFishTasty);
        System.out.println("물고기 맛있나?" + (isFishTasty ? "매우" : "별루"));

        // char 데이터 유형은 단일문자를 저장
        // 문자는 'A' 또는 'c'와 같이 작은따옴표 사용필수!
        System.out.println();
        System.out.println("[char 값 출력]");
        char myGrade = 'B';
        System.out.println("나의 학점은 " + myGrade);

        // 한글과 같은 2byte 문자도 한글자만 출력
        char myMedal = '금';
        System.out.println("나의 메달은 " + myMedal);

        // 아스키코드를 사용하여 출력가능!
        // char형에 아스키코드에 해당하는 숫자를 넣으면 한글자 출력!
        // 아스키코드 참조:
        // https://www.w3schools.com/charsets/ref_html_ascii.asp
        System.out.println();
        char myVar1 = 64, myVar2 = 66, myVar3 = 67;
        System.out.println("아스키64는 " + myVar1);
        System.out.println("아스키66는 " + myVar2);
        System.out.println("아스키67는 " + myVar3);

        /********************************************
         * 
         * String 유형은 Java에서 너무 많이 사용되고 통합되어
         * 일부에서는 이를 "특별한 아홉 번째 유형"이라고 불리움.
         * (기본유형이 8개 이므로^^)
         * 
         * Java의 String은 객체를 참조하기 때문에 실제로는
         * 기본이 아닌 데이터 유형 String 객체에는 문자열에 대한
         * 특정 작업을 수행하는데 사용되는 메서드가 있음.
         * 
         * [ 기본이 아닌 데이터 유형 ]
         * 기본이 아닌 데이터 형식은 개체를 참조하기 때문에
         * 참조 형식 이라고함.
         * 
         * (기본 데이터 유형 과 기본 이 아닌 데이터 유형 의 주요 차이점)
         * 
         * 기본 유형은 Java에서 사전 정의(이미 정의)되어 있음
         * 기본이 아닌 유형은 프로그래머에 의해 생성되며
         * Java에 의해 정의되지 않음( 제외 String).
         * 
         * 기본 유형이 아닌 유형은 특정 작업을 수행하기 위해
         * 메소드를 호출하는 데 사용할 수 있지만 기본 유형은 불가능함
         * 
         * 기본 유형에는 항상 값이 있는 반면 기본 유형이 아닌 유형은 null.
         * 기본 유형은 소문자로 시작하고 기본 유형이 아닌 유형은 대문자로 시작.
         * 기본 유형의 크기는 데이터 유형에 따라 달라지지만
         * 기본 유형이 아닌 유형은 모두 동일한 크기를 갖음.
         * 
         * 기본이 아닌 유형의 예로는
         * Strings / Arrays / Classes / Interface 등이 있음
         ********************************************/

        /*
         * [ 데이터 형변환 ]
         * 
         * 형변환은 기본 데이터 유형의 값을 다른 유형에 할당하는것
         * Java에는 두 가지 유형의 캐스팅이 있음
         * 
         * 1.업캐스팅 (자동)
         * - 더 작은 유형을 더 큰 유형 크기로 변환
         * byte-> short-> char-> int-> long-> float->double
         * 
         * 2.다운캐스팅 (수동)
         * - 큰 유형을 작은 크기 유형으로 변환
         * double-> float-> long-> int-> char-> short->byte
         */

        // 형변환
        // 1. 업캐스팅 : 자동형변환됨!!!
        int myInt = 9;
        double myDouble = myInt;

        System.out.println();
        System.out.println("형변환:업캐스팅");
        System.out.println("int값:" + myInt);
        System.out.println("int를 double로:" + myDouble);

        // 다운캐스팅 : 할당할 변수타입과 같은 타입을 소괄호에 씀!
        // 타입 변수 = (변환타입) 변수
        // -> 소실되는 값이 있다~!
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2;
        System.out.println("형변환:다운캐스팅");
        System.out.println("double값:" + myDouble2);
        System.out.println("double을 int로:" + myInt2);

    }
}
