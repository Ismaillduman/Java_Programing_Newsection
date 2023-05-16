package avengers.string_2;

public class GetSandwich {
    public String getSandwich(String str) {
        int first=str.indexOf("bread");
        int last=str.lastIndexOf("bread");
        if(first<0||first==last){
            return "";
        }

        return str.substring(first+5,last);
    }
}
