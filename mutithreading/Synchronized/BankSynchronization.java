package mutithreading.Synchronized;

public class BankSynchronization {
    
     private double balance;

     public BankSynchronization(double initailBalance){
          this.balance = initailBalance;
     }
  //  deposit and withdraw methods are synchronized method is used  
     public synchronized void deposit(double amount){
          double newBalance  = balance + amount;
          System.out.println(Thread.currentThread().getName() + " is depositing " + newBalance);

          try{
                   Thread.sleep(1000);
          }catch(InterruptedException e){
               e.printStackTrace();
          }
          balance = newBalance; 
          System.out.println(Thread.currentThread().getName() + "current balance" + balance);
     }

     // withdraw method is used synchronized block 
     public  void withdraw(double amount){

        synchronized(this){
            if(balance >=  amount){
            double newBalance = balance - amount;
    System.out.println(Thread.currentThread().getName() + " is withdraw " + newBalance);

                  try{
                          Thread.sleep(1000);
                  }catch(InterruptedException e){
                       e.printStackTrace();
                  }

                  balance = newBalance;
                            System.out.println(Thread.currentThread().getName() + " current balance " + balance);

            }
        }
        
     }
        public double getBalance(){
            return balance;
        }
}
