import java.util.Scanner;

public class divisible{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter a number");
    int a=sc.nextInt();
    if(a%3==0 && a%5==0  && a%15!=0){
        System.out.println("valid");
    }
    else{
        System.out.println("Invalid");
    }
}}
 