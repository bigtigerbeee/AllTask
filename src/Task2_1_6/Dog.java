package Task2_1_6;

public class Dog {
    public static void sayHello() {
        System.out.println("Гав!");
    }

    public static void catchCat() {
        System.out.println("Кошка поймана");
        sayHello();
    }
}
