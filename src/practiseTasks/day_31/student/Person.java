package practiseTasks.day_31.student;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
       setName(name);
       setAge(age);
       setGender(gender);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isEmpty()){
            System.err.println("name should not be set to null or not to be empty");
            System.exit(1);
        }
        for (char each:name.toCharArray()
             ) {
            if(!Character.isLetterOrDigit(each)||Character.isSpaceChar(each)){
                System.out.println("name should not contain any special character other than space");
                System.exit(1);
            }
            else {
                this.name=name;
            }
        }


        }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
    /* Condition:
                        1. name should not be set to null
                        2. name should not be empty
                        3. name should not contain any special character other than space
                        4. age should not be set to negative
                        5. gender must be valid

            Methods:
                eat()
                drink()
                sleep()
                toString()*/


}
