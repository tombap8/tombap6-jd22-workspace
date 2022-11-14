// Java07. 클래스와 객체 그리고 속성과 메서드
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

    }
}

class Fruits {
    public void fruitsFn() {
        String name="과일";
        String color="각종색";
        String favor="각종향";
        double weight=0.0;
        String define="나무 따위를 가꾸어 얻는, 사람이 먹을 수 있는 열매";
        System.out.println("나는 과일입니다!");
    }
}

class Apple extends Fruits {
    public void appleFn(String word) {
        super.fruitsFn();
        System.out.println("나는 " + word + " 사과입니다!");
    }
}
class Banana {
    public void bananaFn(String word) {
        System.out.println("나는 " + word + " 바나나입니다!");
    }
}