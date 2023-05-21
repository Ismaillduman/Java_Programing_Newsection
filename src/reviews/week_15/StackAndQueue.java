package reviews.week_15;

import java.util.*;

public class StackAndQueue {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Selenium");
        System.out.println(stack);

        System.out.println("peek " + stack.peek());//last attend
        System.out.println("pop " + stack.pop());//Last-In-First-Out (LIFO) ===> pop()
        System.out.println("peek after first pop " + stack.peek());

        stack.add("zebra"); // from vector class
        stack.push("Elephant"); //from stack class
        System.out.println(stack);
        System.out.println("____________________________________________________________________");

        Queue<String> queue = new PriorityQueue<>();
        queue.add("james");
        queue.add("jenny");
        queue.add("john");

        System.out.println(queue);
        System.out.println("peek "+queue.peek());//element
        System.out.println("========================================================");
        Queue<String> queue2 = new PriorityQueue<>();
        queue2.offer("james");//adds element
        queue2.offer("jenny");
        queue2.offer("john");

        System.out.println(queue2);
        System.out.println("peek "+queue2.peek());//element
        System.out.println(queue2.poll()); //remove peek element
        System.out.println(queue2.peek());//check top of queue element

        Deque<String> queue1= new LinkedList<>();//can also be Queue reference
        queue1.offer("Hallo");
        ((LinkedList)queue1).get(0);
        //queue1.offerFirst("some else"); the Deque gives us access in the beginning ande end with methods
    }
}
