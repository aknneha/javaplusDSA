import java.util.Scanner;

public class greatest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("so the numbers are "+a  +b  +c);
    if(a>b && a>c){
        System.out.println(a+" is the greatest no" );//compiler moves from left to right, a+ to start and +a to end
    }
    /*jjjjjjjjjjjjjjjjn dccrfffffffffffffffffffffffkjjjjjjdcc
    rf jirrrrrrrrrrrrrrrrrrrrr*/
    //ways to comment

      if(b>a && b>c){
        System.out.println(b+" is the greaatest no" );
    }
      if(c>b && c>a){
        System.out.println(c+" is the greaatest no");
    }
    }
}