package avengers.string_2;

public class CountHi {
    public int countHi(String str) {
        int countHi = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i,i+2).equals("hi")){
                countHi++;
            }
        }
        return countHi;
    }
}
