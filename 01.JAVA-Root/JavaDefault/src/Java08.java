public class Java08{
    public static void main(String[] args) {
        
    } /// main ///
} /// class ///

class Animal{
    protected String name = "동물";
    public String sound(String ss){
        return "동물소리:"+ss;
    }
}

class Pig extends Animal{
    private String weight = "80kg";
    public void makePig() {
        Animal animal = new Animal();

        String original = animal.sound("꿀꿀");
        animal.name = "돼지";

        System.out.println(animal.name+":"+original);
    }
}