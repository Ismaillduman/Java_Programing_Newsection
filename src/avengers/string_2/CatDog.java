package avengers.string_2;

public class CatDog {

    public boolean catDog(String str) {
        //catdghjdog
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equalsIgnoreCase("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equalsIgnoreCase("dog")) {
                dog++;
            }
        }

        if (cat == dog) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }

}
