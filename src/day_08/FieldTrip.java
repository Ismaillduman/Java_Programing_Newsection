package day_08;

public class FieldTrip {
    public static void main(String[] args) {
        int gradeNumber = 1;
        String location="Apple orchard";
        int numOfGroups=3;
        String teacher="Ms. Smith";
        String dataBased= "\nlocation - "+location +"\n" +
                "number of groups - "+numOfGroups+"\n" +
                "teacher in charge -"+  teacher;

        if(gradeNumber<7&&gradeNumber>0) {

            if(gradeNumber==1){
               location="Apple orchard";
               numOfGroups=3;
               teacher="Ms. Smith";
            } else if (gradeNumber == 2) {
                location = "Zoo";
                numOfGroups = 7;
                teacher = "Mr. Lee";
            } else if (gradeNumber==3) {
                location = "Aquarium";
                numOfGroups = 5;
                teacher = "Mr.Wilson";
            } else if (gradeNumber==4) {
                location = " Movie theater";
                numOfGroups = 2;
                teacher = "Mr.Reyes";
            } else if (gradeNumber==5) {
                location = "Museum";
                numOfGroups = 5;
                teacher = "Ms. Ela";
            } else if (gradeNumber==6) {
                location = "Six Flags";
                numOfGroups = 8;
                teacher = "Mr. Watt";
            }
        }
        System.out.println("dataBased = " + dataBased);

/*Create a class called FieldTrip. Your school goes on a Field trip each year.
        The place you go will be based on your grade.
		Given a variable gradeNumber figure out the details of your field trip. Print the information at the end.
			    Data based on grade:
			        grade - 1
				        location -  Apple orchard
				        number of groups - 3
				        teacher in charge - Ms. Smith

			        grade - 2
				        location - Zoo
				        number of groups - 7
				        teacher in charge - Mr. Lee

			        grade - 3
				        location - Aquarium
				        number of groups - 5
				        teacher in charge - Ms. Wilson

			        grade - 4
				        location - Movie theater
				        number of groups - 2
				        teacher in charge - Ms. Reyes

			        grade - 5
				        location - Museum
				        number of groups - 5
				        teacher in charge - Ms. Lela

			        grade - 6
				        location - Six Flags
				        number of groups - 8
				        teacher in charge - Mr. Watt

			        for any other gradeNumber:
			        	location - Unknown
			        	numer of gourps - 0
			        	teacher in charge - Unknown
*/
    }
}
