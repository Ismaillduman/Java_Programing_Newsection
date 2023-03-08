package practiseTasks.day_12;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word=sc.nextLine();
        word=word.toLowerCase();
       int middleIndex=word.length()/2;
        if(word.length()%2==0){
            System.out.println(word.substring(0,middleIndex-1)+word.substring(middleIndex-1, middleIndex + 1).toUpperCase()+word.substring(middleIndex+1));
        }
        /*MiddleCharacters [indexes, cases, length]

	Create a program that will ask the user to enter a word. Return the word in lowercase expect for the middle character/s in uppercase

	Note: based on if the word is even or odd there will be either two middle characters(even length) or one middle character (odd length)

	Ex:
		input:
			apple
		output:
			apPle

		input:
			JavA
		output:
			jAVa*/
    }
}
