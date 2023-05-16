package daily_lessons.day_39_collections;

import practiseTasks.day_31.states.States;

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(100, 200, 300));

        arrayList.remove(0);
        arrayList.get(0);
        System.out.println(arrayList);
        System.out.println("---------------------------------");
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(100, 200, 300));
        linkedList.remove(0);
        System.out.println("linkedList.get(0) = " + linkedList.get(0));
        System.out.println(linkedList);
        System.out.println("---------------------------------------------");
        Vector<Integer> vector = new Vector<>(Arrays.asList(100, 200, 300));
        vector.remove(0);
        vector.get(0);
        System.out.println(vector);
        System.out.println("-------------------------------------");
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(100, 200, 300));
        System.out.println(stack);
        int lastElement = stack.pop();
        System.out.println(stack);
        int secondLastElement = stack.peek();
        System.out.println(secondLastElement);

    }
}
