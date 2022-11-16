package fruitPack.america.south;

public class PeruFruit {
    public void peruFn(){
        System.out.println("페루산 과일은 애플망고 입니다.");
        // 프라이빗은 선언된 클래스에서만 사용!
        peruFnPrivate();
        // peruFnProtected();
        ChileFruit chile = new ChileFruit();
        chile.chileFn();
    }
    private void peruFnPrivate(){
        System.out.println("페루산 과일은 프라이빗 입니다.");
    }
    protected void peruFnProtected(){
        System.out.println("페루산 과일은 프로택티드 입니다.");
    }
}
