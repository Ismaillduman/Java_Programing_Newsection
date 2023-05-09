package daily_lessons.day_37_exceptions;

import daily_lessons.day_35_Polymorphism.transportaation.Car;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        System.out.println("Program1 started");
        Car car=null;
        try {
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First Catch Block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Second Catch Block");
            e.printStackTrace();
        }catch (NullPointerException e){
            System.out.println("Third Catch Block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth Catch Block");
            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fifth Catch Block");
            e.printStackTrace();
        }
        System.out.println("Program Ended");
        }
        //every try block muss have  at least one catch block. one try block can have multiple catch block
    }

