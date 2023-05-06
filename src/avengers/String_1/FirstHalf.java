package avengers.String_1;

public class FirstHalf {
    //firstHalf("WooHoo") → "Woo"

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);

    }

    public boolean hasBad(String str) {
        return !str.isEmpty()&&(str.startsWith("bad")||str.substring(1).startsWith("bad"));

    }
    /*left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"*/

    public String left2(String str){
        return str.substring(2)+str.substring(0,2);
    }

    /*makeOutWord("<<>>", "Yay") → "<<Yay>>"*/
    public String makeOutWord(String out, String word) {

        return out.substring(0,out.length()/2)+word+out.substring(out.length()/2);
    }

    /*middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"*/
    public String middleThree(String str){
//
//       String strFirstHalf= str.substring(0,str.length()/2);
//       String strSecondHalf=str.substring(str.length()/2);
//
//       return strFirstHalf.substring(strFirstHalf.length()-1)+strSecondHalf.substring(0,2);

        int mid= str.length()/2;
        return str.substring(mid-1,mid+2);
    }
    public String right2(String str) {
        return str.substring(str.length()-2)+str.substring(0,str.length()-2);

    }



    public static void main(String[] args) {
        FirstHalf firstHalf= new FirstHalf();
        System.out.println(firstHalf.middleThree("solving"));
    }

}
