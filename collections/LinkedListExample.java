
import java.util.LinkedList;


public  class LinkedListExample{
       
       public static void main(String args[]){
         
         LinkedList<Integer> list =  new LinkedList<>();
         list.addLast(2);
         list.addLast(1);
         list.addLast(3);
         list.addLast(5);
         list.addFirst(7);

        System.out.println(list.getFirst());

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,2);
         list2.add(1,1);
         list2.add(2,3);
         list2.add(3,5);
         list2.add(4,7);

         System.out.println(list2.get(0) +  "..."  + list2.get(4));
        
       }
}