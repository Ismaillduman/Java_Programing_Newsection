package daily_lessons.day_40_collectionsContinuue;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1= new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10,100,200,300,10,200));//allow duplicate, order is random, not accept null
        //queue1.addAll(Arrays.asList(null,null));//, not accept null
        System.out.println(queue1);

        int num1=  queue1.poll();//===>FIFO
        System.out.println("num1 = " + num1);
        System.out.println(queue1);
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1);

        Queue<Integer> queue2= new ArrayDeque<>();
        Queue<Integer> queue3= new LinkedList<>();
        System.out.println("---------------------------------------");
        List<Integer> list= new LinkedList<>();


    }
}
