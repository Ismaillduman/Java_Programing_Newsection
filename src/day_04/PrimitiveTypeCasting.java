package day_04;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {
        int x = 100;

        long y= x; //implicit casting

        byte c = (byte) x;

        short z = (short)x;
        short k = (byte)x;

        float a = 20.2F; //that's not a casting

        short b= (short) a; //explicit casting
    }
}
