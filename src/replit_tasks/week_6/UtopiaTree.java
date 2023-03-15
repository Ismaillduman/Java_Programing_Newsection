package replit_tasks.week_6;

public class UtopiaTree {
    /*year 1 - growth 1 cm
tree size: 1 cm

year 2 - growth 1 cm
tree size: 2 cm

year 3  - growth 1 cm
tree size: 3 cm

year 4 - growth 2 cm
tree size: 5 cm

year 5 - growth 2 cm
tree size: 7 cm

year 6 - growth 2 cm
tree size: 9 cm*/
    public static void main(String[] args) {


        int treeSize=0;
        int growth=0;

        for (int i = 1; i <=10 ; i++) {
            if(i<=3){
                growth=1;
               treeSize+=growth;
            }else{
                growth=2;
                treeSize+=growth;
            }
            System.out.println("year "+i+" - growth "+growth+" cm\n"+"tree size: "+treeSize+" cm");
        }

    }
}
