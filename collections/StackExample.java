
import java.util.Stack;

public class StackExample{
      public static void main(String args[]){
          
          Stack<Integer> stack = new Stack<>();
          stack.push(3);
          stack.push(4);
          System.out.println(stack.pop());
      }
}