package daily_lessons.day_15_loops_continue;

public class RemoDuplicateWithContinue {
    public static void main(String[] args) {
        System.out.println(removeDupli());
    }
    public static String removeDupli(){

        String str = "xybyybnxcdc";

        String result="";

        for(int i=0;i<str.length();i++){

            if(result.contains(""+str.charAt(i))){
                continue;
            }

            result+=str.charAt(i);


        }

        return result;
    }
}
