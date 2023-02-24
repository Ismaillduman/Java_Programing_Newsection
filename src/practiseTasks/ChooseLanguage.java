package practiseTasks;

public class ChooseLanguage {
    public static void main(String[] args) {
        /*
        *  Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary*/

        int selection=1;
        String language;
        language= (selection==1)? "Hello, thank for your call" : (selection==2) ? "Hola, gracias para llamar":
                (selection==3) ? " Merhaba, aradiginiz icin tesekkurler" : (selection==4) ? " Privet, spasibo za vash zvonok"
                        : (selection==5) ? "Merci ,pour votre appel": "enter valid selection";
        System.out.println("language = " + language);
    }
}
