package daily_lessons.day_06_if_intro;

public class NumberToWord {
    public static void main(String[] args) {

        /* Create a  class named NumberToWord, and write a java program that
        can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement*/
        int number = 5;
        String word="";


        if (number==0){
           word="zero";

        }else if (number==1){
           word="one";
        }
        else if (number==2){
            word="two";
        }
        else if (number==3){
            word="three";
        }
        else if (number==4){
            word="four";
        }
        else if (number==5){
            word="five";
        }
        else if (number==6){
            word="six";
        } else if (number==7){
            word="seven";
        } else if (number==8){
            word="eight";
        }else{
            word="nine";
        }
        System.out.println(number+" "+ word);
    }
}
