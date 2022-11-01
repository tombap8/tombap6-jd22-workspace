import java.util.Scanner;

import module1.Jmo1;
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

        // try문으로 스캐너 감싸준다.
        // 자동 import는 (alt+shift+O:알쉬오~~~!)
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");

            String userName = myObj.nextLine();
            System.out.println("Username is: " + userName);
        }
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