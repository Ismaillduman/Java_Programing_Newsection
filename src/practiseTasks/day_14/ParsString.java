package practiseTasks.day_14;

public class ParsString {
    public static void main(String[] args) {
        String word="A1B2C3";
        String digits="";
        int sum=0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='0'&&ch<='9'){
                digits=""+ch;
                int digit= Integer.parseInt(digits);
                sum+=digit;
            }

        }
        System.out.println(sum);
    }
}
