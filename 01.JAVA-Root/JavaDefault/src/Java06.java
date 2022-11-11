// Java06. 자바 메서드
public class Java06 {
    public static void main(String[] args) {
        /*
         * [자바 메서드 기본 특징]
         * 1. 메서드는 호출시에만 실행되는 코드블록이다.
         * 2. 매개변수로 데이터를 메서드에 전달함
         * 3. 메서드는 특정 작업을 수행하는 함수로 볼 수 있다.
         * 4. 메서드를 쓰는 이유는? 코드의 재사용!
         * 5. 메서드 안에 메서드는 만들 수 없다!(주의!!!)
         * 
         * [ 메서드의 생성 ]
         * 1. 메서드는 클래스 내부에 선언함
         * 2. 메서드의 이름과 소괄호,중괄호로 구성
         * 3. 자바에는 내장 메서드도 있고 사용자정의 메서드도 있음!
         * 4. 메서드는 클래스와 구분하기 위해 소문자로 시작한다!
         * (보통 캐믈케이스 즉, 두번째 단어부터 대문자로씀)
         * 5. void는 메서드의 리턴값이 없다는 뜻
         * -> String / int 등의 데이터 형을 쓰면 그 형의 리턴값 있다는뜻
         * 
         * [ 메서드의 매개변수 ]
         * 1. 특정 데이터를 메서드에 전달하는 변수임
         * 2. 매개변수는 메서드 내에서만 사용되는 지역변수임
         * 3. 매개변수는 변수형 선언과 함께 소괄호안에 작성됨
         * 4. 매개변수 개수만큼 콤마로 구분하여 소괄호에 작성됨
         * 
         * [ main메서드 소개 ]
         * 1. 클래스에서 자동으로 가장먼저 실행되는 메서드임
         * 2. 메인 메서드에서 사용자 정의 메서드를 호출 할 수 있다.
         * 3. public 접근 제한자는 모든 클래스에서 접근할 수 있다는 표시
         * 4. static는 메서드가 클래스에 속해 있음(new키워드로 생성안함!)
         */

        // 나의 첫 메서드 호출!!
        myFirst();
        myFirst();
        myFirst(); // 호출한 만큼 실행됨!

        // System.out.println(msg);

        // 나의 두번째 메서드 호출!!
        System.out.println(mySecond("김"));
        System.out.println(mySecond("이"));
        System.out.println(mySecond("박"));

        // 나의 세번째 메서드 호출!!
        // static이 아니므로 본 클래스에 자동 소속되지 않고
        // 객체형으로 생성해야 사용할 수 있다!
        // new 키워드로 생성함! 클래스소속으로 생성해야함!
        // 생성법:
        // 클래스명 변수 = new 클래스명();
        // 클래스가 객체로 생성되어야
        // static이 아닌 메서드를 호출할 수 있다!

        Java06 j06 = new Java06();

        System.out.println(
                "9000원짜리 점심을 6명이 먹었다.얼마내야하나?" +
                        j06.myThird(9000, 6) + "원");

        // 나의 네번째 메서드 : 이달의 표어
        System.out.println("이달의 표어:" +
                j06.makeTitle(1000, "소시지를 드립니다!"));

        // 이름이 같은 오버로딩 메서드 호출!
        System.out.println("오버로딩: " +
                j06.makeTitle(11, "레밍스게임", 20));

        // 재귀함수 호출하기
        int result = sum(5, 10);
        System.out.println(result);

    } //// main 메서드 ////

    // 나의 첫 메서드
    public static void myFirst() {
        String msg = "캡숑~!";
        System.out.println("나는 자바개발자다!"+msg);
    } //// myFirst 메서드 ////

    // 나의 두번째 메서드
    public static String mySecond(String family) {
        return family + "씨 가문";
    } ////// mySecond 메서드 /////

    // 나의 세번째 메서드 -> static 이 없음!
    // 식사비 계산 : pay 가격, people 사람수
    public int myThird(int pay, int people) {    
        return pay * people;
    } /////// myThird 메서드 ////////

    // 나의 네번째 메서드 : 표어 만들기
    public String makeTitle(int num, String msg) {
        return num + "명에게 " + msg;
    } ////////////// makeTitle 메서드 ////////////

    // 표어만들기를 똑같이 하는데 내용이 다르므로 전달값도 다름
    // 메서드 명이 똑같다!!! -> 오버로딩 메서드!!!
    public String makeTitle(int month, String evt, int people) {
        return month + "월의 " +
                evt + "이벤트 당첨자는 " + people + "명입니다!";
    } ////////////// makeTitle 메서드 ////////////

    // 재귀메서드 : 10부터 6까지 더한 결과는?
    public static int sum(int start, int end) {
        if (end > start) {
            System.out.print(end + ((end > 6) ? "+" : "="));
            return end + sum(start, end - 1);
        } else {
            return end;
        }
    }

} ///// 클래스 끝 /////
