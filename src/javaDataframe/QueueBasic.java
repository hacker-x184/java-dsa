package javaDataframe;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    static void main() {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(10);
        qu.add(41);
        qu.add(18);
        qu.add(21);
        qu.offer(45);
        qu.offer(25);
        System.out.println(qu);
        System.out.println(qu.peek());

        System.out.println(qu.poll());
        System.out.println(qu);
    }
}
