public class Java08{
    public static void main(String[] args) {
        
    }
}

class Animal{
    protected String name = "동물";
    public String sound(String ss){
        System.out.println("동물소리:"+ss);
    }
}

class Pig extends Animal{
    private String weight = "80kg";
    public static void main(String[] args) {
        Animal animal = new Animal();

        String original = animal.sound("꿀꿀");
        animal.name = "돼지";

        System.out.println(animal.name+":"+original);
    }
}