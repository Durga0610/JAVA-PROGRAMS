import java.util.*;
public class LuckyCustomer{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=1,b=1,res=0;
        if(n==1 || n==2){
            System.out.println("1");
        }
        for(int i=2;i<n;i++){
            res=a+b;
            a=b;
            b=res;
        }
        System.out.println(b);
    }
}
