import java.util.Scanner;

public class loop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       
        System.out.println("enter the number");
        int a=sc.nextInt();
        for(int i=0;i<=a;i+=2){
                System.out.println(+i);
        }}}