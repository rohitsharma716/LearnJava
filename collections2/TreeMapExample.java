import  java.util.Map;
import java.util.TreeMap;

public class TreeMapExample{

    public static void main(String args[]){
          Map<Integer,String> map =  new TreeMap<>((Integer key1 , Integer key2) ->  key2 - key1);

          /// this is decreasing order how you us key1 and key2 it dempand on it .

        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");

        map.forEach((Integer key , String val) ->  System.out.println("key:" + key +  "value:"+  val));

    }
}