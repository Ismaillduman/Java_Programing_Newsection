package reviews.review_06;

public class HiCount {
    public static void main(String[] args) {
        System.out.println(wordCount("hhiggghiehi hieehibkldbhvlsi"));
    }
    public static int wordCount(String str){
        String word="hi";
        int count=0;
        int i=0;

        while(str.contains(word)){


            str=str.replaceFirst(word,"");
            count++;

        }

        return count;
    }
}
