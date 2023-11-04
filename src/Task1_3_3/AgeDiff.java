package Task1_3_3;

public class AgeDiff {
    public static void main(String[] args) {
        byte calculatgetAgeDiff = getAgeDiff((byte) 15, (byte) 20);
        System.out.println(calculatgetAgeDiff);


    }

    public static byte getAgeDiff(byte age1, byte age2) {

        return (byte) Math.abs(age1 - age2);
    }

}

