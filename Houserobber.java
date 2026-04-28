import java.util.*;
public class Houserobber{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int[] dp=new int[n+1];
        if(n<2){
            System.out.println(arr[0]);
            return;
        }
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-1]);
        }
        System.out.println(dp[n-1]);
    }
}
