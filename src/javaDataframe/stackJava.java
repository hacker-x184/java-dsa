package javaDataframe;
import java.util.*;
public class stackJava { public static void main(String[] args) {
//        Arraystack ->Concrete class
    Stack<Integer> stack = new Stack<>();

//        ADD\
    stack.add(10);
    stack.add(20);
    stack.add(30);
    stack.add(40);
    stack.add(24);
    System.out.println(stack);
    stack.add(101);
    System.out.println(stack);
    stack.remove(5);
    System.out.println(stack);
//      addAll
    Stack<Integer> stack1 = new Stack<>( );
    stack1.add(15);
    stack1.add(45);
    stack1.add(85);
    stack1.add(65);
    stack.addAll(stack1);
    System.out.println(stack);
    stack.add(15);
    stack.add(45);
    stack.removeAll(stack1);
    System.out.println(stack);
    System.out.println(stack.size());
    System.out.println("Printing stack1:- "+ stack1);
    stack1.clear();
    System.out.println(stack1);
//        Iterator<Interger> iterator = stack.iterator();
//        while(itrator.hasNext()){
//            System.out.println("Element : " + iterator.next());
//        }
    Stack<Integer> stack3 = new Stack<>();
    stack3.add(11);
    stack3.add(12);
    stack3.add(45);
    System.out.println(stack3);
    System.out.println(stack3.get(2));
    stack3.set(0,101);
    System.out.println((stack3));
//        toArrray
//        Object[] arr1 = stack3.toArray();
//        for (Object obj: arr){
//            System.out.println(obj);
//        }
//        Contains
    System.out.println(stack3.contains(100));
    System.out.println(stack3.contains(45));
//        Sort An Arraystack
    Collections.sort(stack);
//        Arraystack<Integer> newstack = (Arraystack<Integer>)stack.clone();
    System.out.println("Printing Entire stack :- "+ stack);
    Stack<Integer> marks = new Stack<>();
    marks.ensureCapacity(100);
    System.out.println(marks.isEmpty());
    stack.addFirst(104);
    stack.addLast(420);
    System.out.println(stack);
    Stack<Integer> l1 = new Stack<>();
    l1.add(10);
    l1.addLast(24);
    l1.addFirst(54);
    System.out.println(l1);
    l1.removeFirst();
    l1.removeLast();
    l1.add(10);
    l1.addLast(24);
    l1.addFirst(54);
    l1.add(10);
    l1.addLast(24);
    l1.addFirst(54);
    System.out.println(l1);
//    System.out.println(l1.poll());

    System.out.println("Stack :--  "+stack);
    stack.push(401);
    stack.push(512);
//    stack.pop(10);
    System.out.println("Stack after Puching th element :-"+ stack);
    stack.pop();
    System.out.println("Stak after poping the one elemrnt :-  "+ stack);
}
}
