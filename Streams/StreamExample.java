
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import  java.util.stream.Stream;


public class StreamExample{
      
      public static void main(String args[]){
              List<Integer> salaryList = new ArrayList<>();
              salaryList.add(3000);
              salaryList.add(2400);
              salaryList.add(6000);
              salaryList.add(9000);
              salaryList.add(2000);

              long output = salaryList.stream().filter((Integer sal ) ->  sal > 3000).count();
              System.out.println("salary is greate 3000 : " +  output);



              /// different way to creat streams 
              ///
              // --  1 -- COLLECTION     

              List<Integer> salaryList2 = Arrays.asList(3000,4100,9000,1000,3500);
              Stream<Integer>  streamFromIntegerList = salaryList2.stream();


              //  2 -  Araray 
              Integer[] salArray = {3000,4100,9000,1000,3500};
              Stream<Integer>  streamFromIntegerList2 = Arrays.stream(salArray);

              // 3  static method
              Stream<Integer> streamfromstaticmethod = Stream.of(111,1131,1,1,3);

              // 4 static builder
              Stream.Builder<Integer> streamBuilder = Stream.builder();
              streamBuilder.add(1000).add(9000).add(8000);

              Stream<Integer> streamFromBuilderMethod  = streamBuilder.build();


              // 5  Stream iterate  
              Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);

              ///
              ///
              ///most imporatant thing for me  (sequence of stream operations)
              
              List<Integer> numbers = Arrays.asList(2,1,4,5,3);

              Stream<Integer> numbersStream =  numbers.stream()
                      .filter((Integer val) ->  val >=  3)
                      .peek((Integer val) -> System.out.println("after filter: " +  val))
                      .map((Integer val) ->  (val *-1))
                      .peek((Integer val) ->  System.out.println("after nagation: " +  val))
                      .sorted()
                      .peek((Integer val) ->  System.out.println("after sorted : "+  val));
            
        // List<Integer> filteredNumberstream = numbersStream.collect(Collections.toList());
        List<Integer> filteredNumberStream = numbersStream.collect(Collectors.toList());

                System.out.println("Final Collected List: " + filteredNumberStream);



              

              






              





      }
}