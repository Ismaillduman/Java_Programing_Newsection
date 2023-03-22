package practiseTasks.day_18;

public class Contact {
    /*Create a custom class named Contact
		Attributes:
			name
			phoneNumber
			email

		Action:
			setInfo(): sets all the fields
			call(): displays the message "Calling $name now"
			sendMessage(): displays the message "sending message to $phoneNumber now"
			sendEmail(): displays the message "sending email to $email now"*/

    public String name;
    public  long phoneNum;
    public String email;

    public void setInfo (String name, int phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public void call(){
        System.out.println("Calling "+name+" now");
    }

    public void sendMessage(){
        System.out.println("sending message to "+phoneNum+" now");
    }
    public void sendEmail(){
        System.out.println("sending email to "+email +"now");
    }
}
