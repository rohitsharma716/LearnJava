public class Main{

public static void main(String[] args) {
        //  System.out.println("rohit sharma");
      //   Main obj = new Main();
      //   obj.method1();

      // method4();

      // Object val =0;
      // System.out.println((String)val);

      // String val =  null;
      // System.out.println(val.charAt(0));

      // method5();

      // method6();

      // try {
      //       method7("dummy");
          
      // } catch (ClassNotFoundException  exceptionObject) {

      // }
      // catch(InterruptedException exceptionObject ){

              
      // }
      // catch( FileNotFoundException exceptionObject){
             
      // }


      // try{
      //       method8("dummy");
      //       return ;
      // }
      // finally{
      //       System.out.println("inside final");
              
      // }

      try{
            method9();
      }
      catch(ClassNotFoundException e){
            throw e;

      }


}

private  void method1(){
      method2();
}
private void method2(){
      method3();
}
private void method3(){
      int value =  5/0;
}

public static void method4(){
       throw  new ArithmeticException();
}

public static void method5() throws ClassNotFoundException{ 
      throw new ClassNotFoundException();
}

public static void method6(){
        try {
            throw new ClassNotFoundException();
            
        } catch (ClassNotFoundException exceptionObject) {
            exceptionObject.printStackTrace();
        }
}

public static void method7(String name) throws  ClassNotFoundException , InterruptedException{
      if(name.equals("dummy")){
              throw new ClassNotFoundException();
      }
      else if(name.equals("interrupted")){ 
            throw new InterruptedException();
      }  
}

public static void method8(String name){
       
}

public static void method9() throws ClassNotFoundException{
       throw new ClassNotFoundException();
}





}