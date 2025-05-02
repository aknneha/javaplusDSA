import java.util.Scanner;

public class absolute{
   // public static void main(Strings[] args){
         public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        if(a>=0){
            System.out.println(+a);
        }
        else{
            int h=(-1)*a;
            System.out.println(+h);
        }
        }
    }
