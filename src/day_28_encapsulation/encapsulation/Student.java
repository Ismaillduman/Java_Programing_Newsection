package day_28_encapsulation.encapsulation;

public class Student {
    private int age;
    private String name;



    //Auf Private Werte in anderen Klassen können  mit Getter- und Setter-Methoden zugreifen werden.
    public int getAge() {//read only

        if (age == 0) {
            System.err.println("Age has not been set");
            System.exit(1);//program gets terminated
        }
        return age;
    }

    public void setAge(int age) {// set new value write data
        if (age < 1 || age > 100) {
            System.err.println("invalid age: " + age);
            //return;//exiting the method
            System.exit(1);//program gets terminated
        }

        this.age = age;
    }

    public String getName() {
        if(name==null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        boolean hasDigit = false;
        for (char each : name.toCharArray()) {
            if (Character.isDigit(each)) {
                hasDigit = true;
                break;

            }
        }
        if(hasDigit){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }
}
