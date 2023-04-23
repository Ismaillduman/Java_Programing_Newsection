package reviews.week_11.access.b;

import reviews.week_11.access.a.Computer;

public class RunnersB {
    public static void main(String[] args) {
        Mac obj= new Mac();

        //System.out.println(obj.brand); default can not be able to access out of package

       // System.out.println(obj.memory); protected is inherited in sub classes,
        // but not accessed directly. See Mac class for inheritance part

        System.out.println(obj.os);

        //  System.out.println(obj.hasWifi); private variable can not to be inheritance

        System.out.println(obj);
    }
}
