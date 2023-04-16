package daily_lessons.day_03_variables;

import java.util.ArrayList;

public class ReplitTask {


        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINE/LINES.

            byte steps= 100;
            short miles = 5000;
            int count = 1000000;
            long population= 3434455667L;

            //WRITE YOUR CODE BELOW:
//            System.out.println(steps);
//            System.out.println(miles);
//            System.out.println(count);
//            System.out.println(population);

         ArrayList<Object> length_unit= new ArrayList<>();
         length_unit.add(steps);
         length_unit.add(miles);
         length_unit.add(count);
         length_unit.add(population);



            for (Object s:length_unit
                 ) {
                System.out.println(s);
            }

        }
    }

