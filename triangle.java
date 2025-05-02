import java.util.Scanner;

public class triangle{
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the sides of the triangle");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    System.out.println("so the sides of the triangle are"+a +b +c);
if(a+b>c && b+c>a && c+a>b){
    System.out.println("valid");
}
else{
System.out.println("invalid");
}
}}