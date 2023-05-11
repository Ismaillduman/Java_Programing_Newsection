package daily_lessons.day_38_exceptions;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {

//        System.out.println("Hello cydeo");
//        //Thread.sleep(3500);
//       // Library library= new Library();
//        Library.sleep(3.2);
//        System.out.println("How are you today");
        System.out.println("-------------------------------------------");
        if(LocalTime.now().equals(LocalTime.of(14,9,25))){
            throw new BreakTimeException();
        }

        throw new BreakTimeException("Pause please");
    }
}
