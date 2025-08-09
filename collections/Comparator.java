
import java.util.Arrays;

 class Car{
      
     String carName;
     String carType;

     Car(String carName, String carType){
          this.carName  = carName;
          this.carType =  carType;
     }

}


public class Comparator{


    public static void main(String []  args){
           

        //    Integer a[] =  {6,4,3,2,7,1};
        //    Arrays.sort(a);
        //    System.out.println(Arrays.toString(a));

           // sorting  with help of comparator

        //    Arrays.sort(a, (Integer val1 , Integer val2) -> val1-val2);

        //    for(int val : a){
        //      System.out.println(val);
        //    }

        Car[] carArray = new Car[3];
        carArray[0] =  new Car("SUV","petrol");
        carArray[1] =  new Car("sedan","diesel");
        carArray[2] =  new Car("HatchBack","cng");

        // Arrays.sort(carArray);  --  it will not work because direct sort function will not understand how to sort object with key value.

        Arrays.sort(carArray,(Car obj1, Car obj2) -> obj2.carType.compareTo(obj1.carType));
        
        
        for(Car car : carArray){
              System.out.println(car.carName + ".." +  car.carType);
        }
        
        



           
    }
}