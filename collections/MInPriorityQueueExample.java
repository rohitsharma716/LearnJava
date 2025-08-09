
import java.util.PriorityQueue;



public class MInPriorityQueueExample{
     

     public static void main(String args[]){
          
          PriorityQueue<Integer> minPQ = new PriorityQueue<>();
          minPQ.add(4);
          minPQ.add(5);
          minPQ.add(2);
          minPQ.add(1);
          minPQ.add(3);

        //   minPQ.forEach((Integer val) -> System.out.println(val));
        // System.out.println(minPQ.size());

          while(!minPQ.isEmpty()){
              int value =  minPQ.poll();
            //   System.out.println(value);
          }
        // System.out.println(minPQ.size());

        PriorityQueue<Integer> maxPQ =  new PriorityQueue<>((Integer a ,  Integer b) ->  b-a);
        maxPQ.add(4);
        maxPQ.add(2);
        maxPQ.add(5);
        maxPQ.add(1);
        maxPQ.add(3);

        // maxPQ.forEach((Integer  val) -> System.out.println(val));

        while(!maxPQ.isEmpty()){
              int value =  maxPQ.poll();
              System.out.println(value);
        }


     }
}