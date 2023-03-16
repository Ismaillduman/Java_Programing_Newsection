package practiseTasks.day_16;

public class Initials {
    public static void main(String[] args) {
        String name= " chuck norris ";
        name=name.replace(" ","").toUpperCase();
        name=name.charAt(0)+"."+name.charAt(5);
        System.out.println(name);
    }
}
