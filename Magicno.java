import java.util.*;
public class Magicno{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int org=n;
        int sum=0;
        int rev=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n/=10;
        }
        int temp=sum;
        while(temp>0){
            int res=temp%10;
            rev=rev*10+res;
            temp/=10;
        }
        int magic=sum*rev;
        if(org==magic){
            System.out.println("magic no");
        }else{
            System.out.println("not magic no");
        }
    }
}
