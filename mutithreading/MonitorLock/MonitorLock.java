public  class MonitorLock{
    public synchronized  void task1(){

        try {
            System.out.println("inside thread 1");
            Thread.sleep(1000);
            
        } catch (Exception e) {
            // exceptional handling here:
        }

    }
    public void task2(){
          System.out.println("task2 before syschronition ");
          synchronized (this) {
               System.out.println("task2 insode syschronition ");
              
          }
    }

    public void task3(){
          System.out.println("task3");
    }

} 