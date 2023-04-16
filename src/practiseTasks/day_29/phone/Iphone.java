package practiseTasks.day_29.phone;

public class Iphone extends Phone {

    public void setInfo(String brand,String model,String color,int price,char size){
        setInfo(brand,model,color,price,size);
    }
    public void faceTime(long phoneNumber){
        System.out.println("From "+getBrand()+" "+phoneNumber+" calling with face time");
    }
    public void faceTime(String email){
        System.out.println("From "+getBrand()+" being written "+email);
    }
}
