

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[]  args){
    
        //  1. Find the sum of all numbers in a list using streams.
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum: " + sum);

        // 2. Find the maximum number in a list using streams.
       List<Integer> numbers2 = Arrays.asList(1,2,3,4,5);
       int max =  numbers2.stream().max(Comparator.naturalOrder()).get();
       System.out.println("Max: " + max);

       //3. Given a List of strings, write program to count the number of strings that start with specific chareracter.
       List<String> strings = Arrays.asList("apple", "banana", "avocado", "grape", "apricot");
       long count = strings.stream().filter(fruit -> fruit.startsWith("a")).count();
       System.out.println("Count of strings starting with 'a': " + count);

       //4.  conver the list of strings to uppercase 
       strings.stream().map(String::toUpperCase).forEach(System.out::println);

       //5. filter the even numbers from the list
       long  numberOfEvens  = numbers.stream().filter(num -> num%2 == 0).count();
       System.out.println("Count of even numbers: " + numberOfEvens);

       //6. Write a program to find the average of a list of floating-point numbers using streams.
       List<Double> floatNumber =  Arrays.asList(1.5, 2.5, 3.5, 4.5, 5.5);
       double avg =  floatNumber.stream().mapToDouble(Double::doubleValue).average().getAsDouble();
       System.out.println("Average: " + avg);

       //7.  Given a List of intergers, write a program concatenate all the numbers into a single string using streams.
       String concatenated  =  strings.stream().collect(Collectors.joining(", "));
       System.out.println("Concatenated String: " + concatenated);

       //8. Remove duplicates from the list of integers
       numbers.stream().distinct().forEach(System.out::println);

       //9.  give a list of object , write a program to sort the object based on a spaecific property using streams.
       List<Person> people = Arrays.asList(
           new Person("Alice", 30),
           new Person("Bob", 25),
           new Person("Charlie", 35)
       );
    //    people.stream().sorted(Comparator.comparing(Person::getAge)).forEach( System.out::println   );

    //10.  write the code to check if all the elements setisfy a specific condition using streams.
    List<Integer> nums = Arrays.asList(1,3,5,7,9,10);
    boolean allodd = nums.stream().allMatch(element ->  element % 2 != 0);
    System.out.println("All numbers are odd: " + allodd);

    }
    
}
