public class Java05 {
    public static void main(String[] args) {
        myFn();
        System.out.println(myCalc(3, 1000));
    }
    static void myFn(){
        System.out.println(333);
    }
    static int myCalc(int a, int b){
        return a * b;
    }
}
