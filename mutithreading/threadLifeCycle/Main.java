

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResourceObj = new SharedResource();

        Thread ProducerThread = new Thread(() ->{
            try{
                Thread.sleep(2000);
            } catch (Exception e) {
                //throw new RuntimeException(e);
            }
              sharedResourceObj.addItem();
        });
        Thread consumerThread = new Thread(() ->{
              sharedResourceObj.consumeItem();
        });



        ProducerThread.start();
        consumerThread.start();
    }
}
