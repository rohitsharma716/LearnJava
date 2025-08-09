
import java.util.HashMap;
import  java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample{
      
      public static void main(String[] args) {

        // order of insertion in maintain in Linkedhash map

        Map<Integer,String> map =  new LinkedHashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        map.forEach((Integer key , String val) ->  System.out.println("key:" + key +  "value:"+  val));


        System.out.println("----");


        // order of insertion not maintain in normal hashmap

        Map<Integer,String> map2  = new HashMap<>();
        map2.put(1,"A");
        map2.put(2,"B");
        map2.put(3,"C");
        map2.put(4,"D");
        map2.put(5,"E");
        map2.put(6,"F");

        map2.forEach((Integer key , String val) ->  System.out.println("key:" + key +  "value:"+  val));
        
        

            
      }}
