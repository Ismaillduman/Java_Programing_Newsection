package day_22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {
        /*parse method: returns primitive type , converts String to primitive values
        valueOf method: returns wrapper class object, converts String to wrapper class values
        if i want to use primitive data type in collection and map i should convert these to wrapper class with valueOf method.
        * */

        String str="20";
        System.out.println(str+1);//201

        //Integer num= Integer.parseInt(str);  //unboxing
        int num=Integer.parseInt(str); //parse means primitive value
        System.out.println(num+1); //21

        Integer num2= Integer.valueOf(str);
        System.out.println(num2);

        System.out.println("--------------------------------------------------------\n");

        String s="20.5";
        double num3= Double.parseDouble(s);
       Double num4= Double.valueOf(s);
        System.out.println(num4);
        System.out.println(num3);
        System.out.println("-------------------------------\n");

        String x="true";

        boolean r1=Boolean.parseBoolean(x);
        Boolean r2= Boolean.valueOf(x);
        System.out.println(r1);
        System.out.println(r2);

    }

}
