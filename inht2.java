import java.util.*;
class hello{
    int a=4;
    int b=7;
   int he(){
        System.out.println("printing first class");
        int c=a+b;
       // System.out.println(c);
        return c;
       }
}
 class hello1 extends hello
 {
    hello1() {
    System.out.println("printing second class");
    int d=a*b;
        System.out.println(d);
}}

class hello2{
    hello2(){
    hello1 obj2= new hello1(); 
    System.out.println("printing third class");
}}

public class inht2{
    public static void main(String[] args){
        hello obj4 = new hello();
        hello2 obj1 =new hello2();
        System.out.println("calling hello");
        int ans=obj4.he();
        System.out.println(ans);
    }
}