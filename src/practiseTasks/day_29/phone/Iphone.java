package practiseTasks.day_29.phone;

public class Iphone extends Phone {


    public void faceTime(long phoneNumber){
        System.out.println("From "+getBrand()+" number "+phoneNumber+" calling with face time");
    }
    public void faceTime(String email){
        System.out.println("From "+getBrand()+" being written "+email);
    }
}
