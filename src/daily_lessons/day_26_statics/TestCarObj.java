package daily_lessons.day_26_statics;

public class TestCarObj {
    public static void main(String[] args) {
        Car car1= new Car("VW");
        Car car2= new Car("VW","Golf-8");
        Car car3= new Car("VW","UP",2022);
        Car car4= new Car("VW","Tiguan",2022,28_950);
        Car car5= new Car("VW","Tiguan",2022,28_950,"White");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }

}
