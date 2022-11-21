package fruitpack.asia;

import fruitpack.america.south.PeruFruit;

public class KoreaFruit extends PeruFruit { // 페루의 서브클래스가 됨!
    public void koreaFn() {
        System.out.println("한국산 과일은 제주밀감입니다!");

        System.out.println("***한국이 페루의 서브클래스가 되어서 protected 메서드접근: ");
        // 이때는 페루의 protected 클래스에 접근가능함!
        super.peruFnProtected();
    }
}

