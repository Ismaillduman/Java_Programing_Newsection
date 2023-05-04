package practiseTasks.day_34.car;

public class CarShop {

/*Create an object from each concrete class

			Test all the functions of each objects

            Analyze the relationships between the classes*/
public static void main(String[] args) {
    Audi audi= new Audi("A3",2019,28000,"grey");
    CydeoCar cydeoCar= new CydeoCar("VirginiaX",2023,56000,"Green");
    BMW bmw= new BMW("X5",2021,38000,"Black");
    Honda honda= new Honda("Civic",2023,30000,"Green");
    Mercedes mercedes= new Mercedes("GlA",2021,36000,"Blue");
    Nio nio= new Nio("NioX",2020,54000,"White");
    Tesla tesla= new Tesla("y19",2021,65000,"Red");
    Toyota toyota= new Toyota("Avensis",2023,42000,"Yellow");
    System.out.println(audi);
    System.out.println(cydeoCar);
    System.out.println(bmw);
    System.out.println(honda);
    System.out.println(mercedes);
    System.out.println(nio);
    System.out.println(tesla);
    System.out.println(toyota);
    System.out.println("---------------------------------------");
    audi.autoPark();
    tesla.autoPark();
    tesla.selfDrive();
    cydeoCar.autoPark();
    cydeoCar.fly();
}
}
