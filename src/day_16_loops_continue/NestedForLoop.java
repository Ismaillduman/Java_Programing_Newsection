package day_16_loops_continue;

public class NestedForLoop {
    public static void main(String[] args) {

        String str= "aabbccccddeeeeff";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j)==ch){
                    count++;
                }

            }
            if(count==2){
                result+=ch;
            }
        }

        System.out.println(result);
    }
}
