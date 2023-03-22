package practiseTasks.day_16;

public class Initials {
    public static void main(String[] args) {
        String name= " busra duman ";
        name=name.trim().toUpperCase();
        name=name.charAt(0)+"."+name.charAt(name.indexOf(" ")+1)+".";
        System.out.println(name);

    }
}
