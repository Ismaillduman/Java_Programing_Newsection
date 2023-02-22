package practiseTasks;

public class Grade {
    public static void main(String[] args) {
        char grade='J';
        String result="";
    if(grade=='A'||grade=='B'||grade=='C'||grade=='D'||grade=='E'||grade=='F'){
        if(grade=='A'){
            result="excellent";
        } else if(grade=='B'){
            result="great job";
        } else if(grade=='C'){
            result="good";
        }else if(grade=='D'){
            result="passed";
        } else if(grade=='F'){
            result="failed";
        }
    }
    else{result="invalid grade";}
        System.out.println("result = " + result);
    }
}
