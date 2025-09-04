package mutithreading.Synchronized;

import javax.management.RuntimeErrorException;

public class Main {

    public static void main(String[] args){
            
         BankSynchronization account = new BankSynchronization(100);
         Thread deposit1 =  new Thread(() -> account.deposit(40),"deposit1");
         Thread deposit2 =  new Thread(() -> account.deposit(40),"deposit2");
         Thread withdraw1  =  new Thread(() -> account.withdraw(40),"withdraw1");
         Thread withdraw2 =  new Thread(() -> account.withdraw(40),"withdraw2");


         deposit1.start();
         deposit2.start();
         withdraw1.start();
         withdraw2.start();

         try{
              deposit1.join();
              deposit2.join();
              withdraw1.join();
              withdraw2.join();
         }catch(Exception e){
            throw new  RuntimeException(e);
         }

         System.out.println("Final balance : "+  account.getBalance());

    }
    
}
