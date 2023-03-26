package reviews.review_07;

public class ReverseMiddle {
    public static void main(String[] args) {
        String sentence="more java please";

        String [] words=sentence.split(" ");

       String middle= words[words.length/2];

       String reverseMiddle="";
        for (int i = middle.length()-1; i >=0; i--) {
            reverseMiddle+=""+middle.charAt(i);

        }
        String result= words[0]+" "+reverseMiddle+" "+words[words.length-1];
        System.out.println(result);


    }
}
