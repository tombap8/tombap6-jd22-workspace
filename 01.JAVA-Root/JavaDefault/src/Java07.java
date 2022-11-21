
// Java07. 클래스와 객체 그리고 속성과 메서드
// 클래스명과 동일한 이름의 파일에는 단 하나의 public 클래스를 가질 수 있다
// 다른 클래스를 한 파일에 만들경우 public 접근자가 없는 default 클래스를 만든다
import fruitpack.america.north.UsaFruit;
import fruitpack.america.south.PeruFruit;
import fruitpack.asia.JapanFruit;
import fruitpack.asia.KoreaFruit;

public class Java07 {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍은 데이터와 메서드를 모두 포함하는 객체를 만드는 것
        // OOP 는 객체지향프로그래밍(Object-Oriented Programming)의 약자임.
        Apple apple = new Apple();
        apple.appleFn("빛나는");
        apple.appleFn("맛있는");

        Banana banana = new Banana();
        banana.bananaFn("맛좋은");
        banana.bananaFn("커다란");

        Fruits fruits = new Fruits("딸기", "빨간색", "상큼한향", 0.5);
        // fruits.fruitsFn();
        fruits.defineFruit();

        // 값의 수정
        fruits.name = "수박";
        fruits.favor = "달달한향";
        fruits.weight = 1.8;
        fruits.fruitsFn();

        // 직접 셋팅할 수 없다!!!
        // fruits.price = 8000;
        fruits.setPrice(8000);
        System.err.println(fruits.name + "의 가격은 " + fruits.getPrice() + "원 입니다.");

        // 팩키지 호출

        // 한국호출!
        KoreaFruit korea = new KoreaFruit();
        korea.koreaFn();

        // 미국호출!
        UsaFruit usa = new UsaFruit();
        usa.usaFn();

        // 일본호출!
        JapanFruit japan = new JapanFruit();
        japan.JapanFn();

        // 페루호출!
        PeruFruit peru = new PeruFruit();
        peru.peruFn();

    }
}

class Fruits {
    // 속성- 클래스안에 선언된 변수
    String name;
    String color;
    String favor;
    double weight;
    final String define = "나무 따위를 가꾸어 얻는, 사람이 먹을 수 있는 열매";

    // private 변수를 셋팅하는법
    private int price;
    /******************************************* 
        [ 겟터(Getter)와 셋터(Setter) ]

        {★ 게터(Getter)}

        1.필드값 반환
        2.접근 제어 수식어 : public
        3.게터명 : get필드명 
                (필드명의 첫글자는 대문자)
        4.매개변수 없음
        5.내용 : return 필드

        {★ 세터(Setter)}

        1.필드 초기화
        2.접근 제어 수식어 : (거의) public
        3.반환자료형 : void (반환값 X)
        4.세터명 : set필드명 
                (필드명의 첫글자는 대문자)
        5.매개변수 : 필드와 동일
        6.내용 : 생성자와 동일 
                (this.필드명 = 매개변수명;)

        ***************************************

        [♣ 이클립스의 겟터/셋터 자동생성하기]
        마우스 우클릭 > Source 
        > Generate Getters and Setters... 메뉴 선택

        [♣ VSCODE의 겟터/셋터 자동생성하기]
        -> 확장프로그램 설치 : getter-setter-generator
        -> 설치 후 F1 -> 입력창에 get입력후 
        -> Generate get and set methods 선택함
        -> 겟터/셋터 자동생성됨!

    *******************************************/
    // Getter
    public int getPrice() {
        return price;
    }

    // Setter
    public void setPrice(int price) {
        this.price = price;
    }

    // [생성자]
    // 1.클래스명과 동일한 이름의 메서드(안만들어도 생긴다!)
    // 2. 반환값을 가질 수 없다.
    public Fruits(String name, String color, String favor, double weight) {
        this.name = name;
        this.color = color;
        this.favor = favor;
        this.weight = weight;
        fruitsFn();
    }

    // 메서드 - 클래스안에 정의된 함수
    public void fruitsFn() {

        System.out.println("나는 " + name + "입니다! 색은 " +
                color + "이고 냄새는 " + favor + "이다. 개당 무게는 " + weight + "kg이다.");
    }

    public void defineFruit() {
        System.out.println("과일의 정의는 " + define + "이다.");
    }
}

class Apple {
    public void appleFn(String word) {
        System.out.println("나는 " + word + " 사과입니다!");
    }
}

class Banana {
    public void bananaFn(String word) {
        System.out.println("나는 " + word + " 바나나입니다!");
    }
}