public  class StringTest{
         public static void main(String[] args) {
             String s1 =  "Hello";
             String s2 =  "Hello";
             String s3 = new String("Hello");
             String s4 = new String("Hello");
             System.out.println(s1 == s2);   //TRUE  address of the string is same because of stringPole.
             System.out.println(s1.equals(s2));  // TRUE  content of string s1 and s2 is equal.
             System.out.println(s1 == s3);    //FALSE in s3 we allot new memory to the string so memory adress in not same.
             System.out.println(s1.equals(s3)); //TRUE  but content of s1 and s3 is still same that why it true.
             System.out.println(s3 == s4);  //FALSE


             s1 = "rohit";
             System.out.println(s1);
         }
}