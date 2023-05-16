package avengers.string_2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i >=0; i--) {
            result+=str.substring(0,1);
        }
        return result;
    }
}
