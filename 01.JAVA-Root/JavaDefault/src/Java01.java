public class Java01 {
    public static void main(String[] args) {
        // 자바 클래스는 소스 단위블록
        // 자바 main메서드는 클래스의 첫실행 메서드
        // 자바한줄주석
        /* 여러줄주석 */

        // 자바출력1 : println()
        // - 뒤에 엔터기호가 들어가 있는 출력메서드
        // 단축키 : syso
        System.out.println("자바구문을 알자!");
        // 자바출력2 : print()
        // - 뒤에 엔터기호가 없어서 한줄에 나옴!
        System.out.print("나");
        System.out.print("야");
        System.out.print("나!");
        System.out.println("너두냐?");
        // 홑따옴표 -> 한글자만 출력됨!
        System.out.println('흥');
        // System.out.println('홑따옴표');

        // 숫자출력
        System.out.println(3);
        System.out.println(365);
        System.out.println(10000);

        // 숫자계산
        System.out.println(3 + 3);
        System.out.println(3 * 3);
        System.out.println(500 / 5);

        /*
         * [ 자바구문 ]
         * 
         * Java에서 실행되는 모든 코드 라인은 class
         * 이 예에서는 클래스 이름을 Main 으로 지정
         * 클래스는 항상 대문자로 시작
         * 
         * 참고: Java는 대소문자를 구분합니다.
         * "MyClass"와 "myclass"는 의미가 다름
         * 
         * Java 파일의 이름 은 클래스 이름 과 일치해야함!!!
         * 파일을 저장할 때 클래스 이름으로 저장
         * 파일 이름 끝에 확장자로 ".java"를 사용함
         * 
         * public static void main(String[] args){}
         * 클래스에는 반드시 main()가 있어야함. 그래야 실행됨.
         * 
         * 한 줄 텍스트를 화면에 출력
         * System.out.println() -> 뒤에 줄바꿈 있음!
         * System.out.print() -> 뒤에 줄바꿈 없음
         * 
         * System.out - Java 내장클래스
         * println() "print line"의 줄임말
         * 
         * 참고: 중괄호 {}는 코드 블록의 시작과 끝을 표시
         */
    }
}
