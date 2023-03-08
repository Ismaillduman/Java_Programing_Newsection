package practiseTasks.officeHours_week5;

public class GoodString {
    public static void main(String[] args) {
        String word= "soooGood";
        /*If the word "good" starts at index 1 or 2 print true otherwise print false*/
        boolean good=word.substring(1,5).equalsIgnoreCase("good")||word.substring(2,6).equalsIgnoreCase("good");
        if(good){
            System.out.println(good);
            System.out.println(word.substring(1,5));
        }else{System.out.println(good);
            System.out.println(word.substring(2,6));
        }


    }
}
