import java.util.Scanner;

public class p8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n1 = sc.nextInt();
        System.out.print("Enter no of columns : ");
        int n2 = sc.nextInt();
        for(int i=1;i<=n1;i++)
        {
            for(int j=1;j<=n2;j++)
            {
                if(i==j || i+j==n2+1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(" ");
        }
    }
}