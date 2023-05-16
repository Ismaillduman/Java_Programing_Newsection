package avengers.string_2;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
return str.substring(n).contains(str.substring(0,n));
    }
}
