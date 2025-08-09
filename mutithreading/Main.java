public class Main{

   public static void main(String args[]){
      
      System.out.println("Going inside main thread method : " +  Thread.currentThread().getName());
      MultithredLearn runnableobj = new MultithredLearn();
      Thread thread = new Thread(runnableobj);
      thread.start();
      System.out.println("Final main method : " +  Thread.currentThread().getName());

      System.out.println("Going inside main method: "+  Thread.currentThread().getName());
      MultithredLearn2  myThread  = new MultithredLearn2();
      myThread.start();
      System.out.println("finish main method : " +  Thread.currentThread().getName());

      
        
   }



}