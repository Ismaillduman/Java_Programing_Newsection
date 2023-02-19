package review_02;

public class Pizza {
    public static void main(String[] args) {
        String type= "cheese";
        int slices=8;
        int people=3;

        String summary= "We ordered a "+ type+" pizza with "+ slices+" slices. "+people + " people ate " +
                (slices/people)+ " slices each other there was "+slices %people+ " slices left";
        System.out.println("summary = " + summary);
    }
}
