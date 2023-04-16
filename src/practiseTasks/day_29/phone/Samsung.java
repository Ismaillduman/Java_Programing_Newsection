package practiseTasks.day_29.phone;

public class Samsung extends Phone {
    public void setInfo(String brand,String model,char size,int price,String color){
        setInfo(brand, model, size, price, color);
    }
    public  void freeze(){
        System.out.println("From "+getBrand()+" calling with freeze");
    }
}
