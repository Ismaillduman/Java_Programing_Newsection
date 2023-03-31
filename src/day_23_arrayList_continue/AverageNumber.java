package day_23_arrayList_continue;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);//autoboxing
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        System.out.println(list);

        int sum=0;
        for (Integer each : list) {
            sum+=each;
        }

        double averageNum=0.0;

        averageNum=sum/(double)list.size();
        System.out.println("averageNum = " + averageNum);



    }
}
