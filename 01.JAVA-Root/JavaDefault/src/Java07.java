// Java07. 클래스와 객체 그리고 속성과 메서드
// 클래스명과 동일한 이름의 파일에는 단 하나의 public 클래스를 가질 수 있다
// 다른 클래스를 한 파일에 만들경우 public 접근자가 없는 default 클래스를 만든다
import fruitPack.america.AmericaFruit;
import fruitPack.asia.KoreaFruit;;
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

        // 팩키지 호출
        KoreaFruit korea = new KoreaFruit();
        korea.koreaFn();

        AmericaFruit usa = new AmericaFruit();
        usa.usaFn();


    }
}

class Fruits {
    // 속성- 클래스안에 선언된 변수
    String name;
    String color;
    String favor;
    double weight;
    final String define = "나무 따위를 가꾸어 얻는, 사람이 먹을 수 있는 열매";

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