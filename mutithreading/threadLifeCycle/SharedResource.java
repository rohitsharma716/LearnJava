
public class SharedResource {

    boolean isItemPresent = false;

    public synchronized  void addItem(){
          isItemPresent = true;
          System.out.println("producer thead calling for notify method");
          notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("consumer thread inside consumeitem method");
        if(!isItemPresent){
             try{
                 System.out.println("consumer thread is waiting");
                 wait();
             }catch(Exception e){
                   //
             }
        }
        System.out.println("consumer thread consume the item");
        isItemPresent = false;
    }

}

