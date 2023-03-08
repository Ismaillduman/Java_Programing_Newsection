package practiseTasks.day_12;

import java.util.Scanner;

public class SmsParts {
    public static void main(String[] args) {
        /*SmsParts [substring, indexOf]

	Create a program that will has a message String in this exact format:

		Sender: <NAME>. From number: [NUMBER]. Message: {MESSAGE}

	The content of name, number and message can vary, so based on the format extract those parts and output them.

	Ex:
	Sender: <Omer Karahan>. From Number: [202-123-3456]. Message: {I love programming and problem solving}

	Output:
		Sender: Omer Karahan
		Number: 202-123-3456
		Message: I love programming and problem solving*/
//Sender: <ISMAIL>. From number: [12-25-56-8965]. Message: {heutw warte auf ich dich.}
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your number");
        String number = sc.next();
        System.out.println("Enter your message");
        sc.nextLine();
        String message = sc.nextLine();
        String msgText = "Sender: <" + name.toUpperCase() + ">. From number: [" + number + "]. Message: {" + message + "}";
        System.out.println(msgText);
        String senderName = msgText.substring(msgText.indexOf("<") + 1, msgText.indexOf(">."));
        String sender = senderName.substring(0, 1) + senderName.substring(1).toLowerCase();
        System.out.println("Sender: " + sender);
        String senderNumber = msgText.substring(msgText.indexOf("[") + 1, msgText.indexOf("]"));
        System.out.println("Number: " + senderNumber);
        String msgPart = msgText.substring(msgText.indexOf("{") + 1, msgText.indexOf("}"));
        System.out.println("Message: " + msgPart);
    }
}
