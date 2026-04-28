import java.util.*;
public class Maximumproductsubarray{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int ans = Integer.MIN_VALUE;
        int leftproduct=1;
        int rightproduct=1;
        for(int i=0;i<n;i++){
            if(leftproduct==0){
                leftproduct=1;
            }
            if(rightproduct==0){
                rightproduct=1;
            }
            leftproduct*=arr[i];
            rightproduct*=arr[n-1-i];
            ans=Math.max(ans,Math.max(leftproduct,rightproduct));
            
        }
        System.out.println(ans);
    }
}
