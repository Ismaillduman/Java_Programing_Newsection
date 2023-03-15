package replit_tasks.week_6;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class EachVoWel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String word = sc.nextLine();
        String result="";
 int count=0;
        for (int i = 0; i <word.length() ; i++) {

if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u'){
    count++;
    result+=word.charAt(i);

}

        }
        System.out.println(count);
        System.out.println(result);
    }
}
