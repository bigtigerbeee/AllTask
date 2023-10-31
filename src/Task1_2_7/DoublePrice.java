package Task1_2_7;

public class DoublePrice {
    public static void main(String[] args) {
        double price = 10002;
        if (price > 1000)
            price = price * 0.9;
        System.out.println("Стоимость вашей покупки " + price + " рублей");
    }
}

