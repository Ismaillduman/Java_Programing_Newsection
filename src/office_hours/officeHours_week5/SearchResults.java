package office_hours.officeHours_week5;

public class SearchResults {
    public static void main(String[] args) {
        /*Create a program that will have a String in a fixed format showing the results of a search.
        Based on that given format find the total number of search results and print them.

	Note: make the program as dynamic as possible for different sizes
	(it could be a number of 10 which is only 2 number digits or 100000 which is 6 number digits)

	Fixed format of the String:
		Total results found: $results. Sort, Filter, Ratings

	ex:
		"Total results found:3012. Sort, Filter, Ratings"
		-> 3012

		"Total results found:25. Sort, Filter, Ratings"
		-> 25

	Q: what is the datatype of the number we are getting in the end?
		Follow up, we will learn how to get this as an integer number in the future*/

        String searchResults= "154896. Sort, Filter, Ratings";

        String resultCount= searchResults.substring(0,searchResults.indexOf("."));
        System.out.println("resultCount = " + resultCount);

        int searchCount= Integer.parseInt(resultCount);
        System.out.println("searchCount = " + searchCount);

    }
}
