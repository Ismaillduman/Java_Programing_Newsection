package practiseTasks.day_28.credentials;

import java.util.ArrayList;
import java.util.Arrays;

public class Credentials {
    /*5. create a class named Credentials
            Variables:
                username, password

            Encapsulate all the fields
                    (password MUST be a strong password)


            Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

            Methods:
                isStrongPassWord(): takes an argument of string and verify if the given string is strong password,

                returns boolean
                            Characteristics of strong passwords are:


                toString()*/
    private String userName, password;

    public Credentials(String userName, String password) {
        this.userName = userName;
        setPassword(password);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public boolean isStrongPassWord(String password) {
        /* 1. Password MUST be at least have 8 characters long, and should not contain space
                                    2. PassWord should at least contain one letter
                                    3. Password should at least contain one special characters
                                    4. Password should at least contain a digit*/
        String[] passwordArray = password.split("");
        int letter = 0;
        int digit = 0;
        int specialCharacters = 0;
        int space = 0;
        for (char each : password.toCharArray()) {
            if (Character.isDigit(each)) {
                digit++;
            }
            if (Character.isLetter(each)) {
                letter++;
            }
            if (!Character.isLetterOrDigit(each)) {
                specialCharacters++;
            }
            if (Character.isSpaceChar(each)) {
                space++;
            }
        }
        if (passwordArray.length == 7 && digit > 0 && letter > 0 && specialCharacters > 0 && space == 0) {
            return true;
        }
        return false;

    }


    public String toString() {
        return "Credentials{" +
                "userName='" + userName + '\'' +
                ", password='" + getPassword() + '\'' +
                ", password is strong='" + isStrongPassWord(password) + '\'' +
                '}';
    }
}
