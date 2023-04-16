package practiseTasks.day_29.phone;

public class MyPhone {


    public static void main(String[] args) {
        Samsung samsung= new Samsung();
        Iphone iphone= new Iphone();
        Nokia nokia= new Nokia();

        samsung.setInfo("Samsung","A5","gold",'M',70);
        samsung.freeze();
        System.out.println(samsung);
        System.out.println("---------------------------------");

        nokia.setInfo("Nokia","3110","Dark Blue",'M',20);
        nokia.selfDefence();

        System.out.println("------------------------------");
        iphone.setInfo("Iphone","iphone 13 pro","Silver",'L',850);
        iphone.faceTime("Hey i wait you always, please be punctual");
        iphone.faceTime(1788391893);
    }
}
