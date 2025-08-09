
import java.util.HashMap;
import java.util.Map;

public class HashMapExample{


     public static void main(String args[]) 
     {
         Map<Integer,String> RollNoName  = new HashMap<>();

         RollNoName.put(1,"rohit");
         RollNoName.put(2,"kumar");
         RollNoName.put(3,"sharma");
         RollNoName.put(4,"neha");


         for(Map.Entry<Integer,String> entryMap : RollNoName.entrySet()){
               Integer key =  entryMap.getKey();
               String value =  entryMap.getValue();
               System.out.println("key : " +  key +  "    value : " +  value);
         }

         System.out.println(RollNoName.containsKey(2));
         System.out.println(RollNoName.get(1));


         // key set
         for(Integer key : RollNoName.keySet()){
              System.out.println("key:" +  key);
         }

         // value set
         for( String value : RollNoName.values()){
              System.out.println("value:" +  value );
         }

         
         

     }
}