import java.util.*;
class algebra{
    int a;
    int b;
static void vir(int x,int y){
        System.out.println("you are a dog");
        a=x;
        b=y;}
int add(){
        int ans =a+b;
        return ans;}
int sub(){
        int ans =a-b;
        return ans;}
}
    public class const1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        algebra obj=new algebra();
        vir(a,b);

        System.out.println("sum of input numbers is");
        int ans1=obj.add();
         System.out.println(ans1);
         int ans=obj.sub();
         System.out.println(ans);
    }
}