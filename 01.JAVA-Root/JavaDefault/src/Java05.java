import module1.*;
public class Java05 {
    public static void main(String[] args) {
        myFn();
        System.out.println(myCalc(3, 1000));
        Jmo1 jmo1= new Jmo1();
        jmo1.jsubFn();
        jmo1.special();

        Java05 j05 = new Java05();
        var print = j05.myStr(100, "명이야!");
        System.out.println(print);
    }
    static void myFn(){
        System.out.println(333);
    }
    static int myCalc(int a, int b){
        return a * b;
    }
    private String myStr(int a, String b){
        return a+b;
    }
}
