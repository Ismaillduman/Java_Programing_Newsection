package daily_lessons.day_32_final_keyword;

import java.time.LocalDate;

class CYDEOStudent{
    //final class can not inheritance
    public  final void language(){
        System.out.println("Java programming");
    }
}


public class FinalKeyword extends CYDEOStudent {

//    @Override final method can never override
//    public void language() {
//        System.out.println("python programming");
//    }


    public FinalKeyword() {
        //constructor can not be final
    }

    public static void main(String[] args) {
        final char gender='M';
        //gender='F'; final is unchangeable
        System.out.println(gender);
        System.out.println("-------------------------------------");
        final LocalDate dateOfBirth= LocalDate.now();
        System.out.println(dateOfBirth);

        // dateOfBirth=dateOfBirth.plusYears(1); final can not to be able to changeable
        System.out.println(dateOfBirth);
        System.out.println("-------------------------------------");
        System.out.println(dateOfBirth);

        new CYDEOStudent().language();
        new FinalKeyword().language();
    }
}
