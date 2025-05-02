//impt
import java.util.Scanner;

public class p6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int n1 = sc.nextInt();
        
        int c=0;
    for(int i=0;i<n1;i++){
        if((i%2)==0){
            char b=65;
            for(int j=0;j<=i;j++){
            
                System.out.print( " "+b+" " );
                b++;
            }
            System.out.println(" ");   
        }
        else{
            c=1;
            for(int j=0;j<=i;j++){
                System.out.print(" "+c+" ");
                c++;
            }
            System.out.println(" ");   
        }
        }
    }}