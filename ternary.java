import java.util.Scanner;

public class ternary{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the no");
    int a=sc.nextInt();
  
   String ans;
   ans=(a % 2==0)?"even":"odd";// result:condition?ans1:ans2
   System.out.println(ans);
}}
