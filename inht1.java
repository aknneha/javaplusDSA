import java.util.*;
class algebra{
   private algebra(){
        System.out.println("printing first class");
       }
}
 class hello1{
    hello1(){
    //algebra obj2= new algebra(); 
    System.out.println("printing second class");
}}

class hello2{
    hello2(){
    hello1 obj2= new hello1(); 
    System.out.println("printing third class");
}}

public class inht1{
    public static void main(String[] args){
    
         hello2 obj1 =new hello2();
        
    }
}