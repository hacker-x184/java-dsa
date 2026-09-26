package javaDataframe;
import java.util.*;

public class linkedList {
        public static void main(String[] args) {
//        ArrayList ->Concrete class
            List<Integer> list = new LinkedList<>();

//        ADD\
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(24);
            System.out.println(list);
            list.add(101);
            System.out.println(list);
            list.remove(5);
            System.out.println(list);
//      addAll
            List<Integer> list1 = new LinkedList<>( );
            list1.add(15);
            list1.add(45);
            list1.add(85);
            list1.add(65);
            list.addAll(list1);
            System.out.println(list);
            list.add(15);
            list.add(45);
            list.removeAll(list1);
            System.out.println(list);
            System.out.println(list.size());
            System.out.println("Printing List1:- "+ list1);
            list1.clear();
            System.out.println(list1);
//        Iterator<Interger> iterator = list.iterator();
//        while(itrator.hasNext()){
//            System.out.println("Element : " + iterator.next());
//        }
            List<Integer> list3 = new LinkedList<>();
            list3.add(11);
            list3.add(12);
            list3.add(45);
            System.out.println(list3);
            System.out.println(list3.get(2));
            list3.set(0,101);
            System.out.println((list3));
//        toArrray
//        Object[] arr1 = list3.toArray();
//        for (Object obj: arr){
//            System.out.println(obj);
//        }
//        Contains
            System.out.println(list3.contains(100));
            System.out.println(list3.contains(45));
//        Sort An Arraylist
            Collections.sort(list);
//        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
            System.out.println("Printing Entire List :- "+ list);
            ArrayList<Integer> marks = new ArrayList<>();
            marks.ensureCapacity(100);
            System.out.println(marks.isEmpty());
            list.addFirst(104);
            list.addLast(420);
            System.out.println(list);
            LinkedList<Integer> l1 = new LinkedList<>();
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
            System.out.println(l1.poll());
        }

}
