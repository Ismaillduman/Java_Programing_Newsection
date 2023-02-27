package practiseTasks.day_1to_8;

public class CydeoBatches {
    /* In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed*/
    public static void main(String[] args) {
        String batches="EU";
        String time="morning";
        String information="";
        if (batches=="US"){
            switch (time)
            {
                case "morning":
                    information="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "evening":
                    information="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    information="Choose the time";
            }
        } else if (batches=="EU") {
            information="Class times are  10-5 EST. M, T, W, Th, F.";
        }else{
            information="Invalid Batch";
        }
        System.out.println("information = " + information);

    }
}
