package replit_tasks.week_6;

public class Hi {
    public static void main(String[] args) {
    String word="hi";
    String words="gfuhichigfhhisbksnvfjphi";
    String result="";
    int count=0;
    for(int i=0;i<words.length()-1;i++){
        String ch=""+words.substring(i,i+2);
        result=ch;

        if(result.equals(word)){
            count++;
        }

    }
    System.out.println(count);
}
}
