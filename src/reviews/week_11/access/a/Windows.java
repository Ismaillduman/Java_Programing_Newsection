package reviews.week_11.access.a;

public class Windows extends Computer{
    public static void main(String[] args) {
        Windows obj= new Windows();
        System.out.println(obj.brand);
        System.out.println(obj.memory);
        System.out.println(obj.os);
       //  System.out.println(obj.hasWifi); private variable can not to be inheritance
        System.out.println(obj);
    }
}
