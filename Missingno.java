import java.util.*;
public class Missingno
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
		    arr[i]=scan.nextInt();
		    sum=sum+arr[i];
		}
		int total=(n+1)*(n+2)/2;
		int miss_no=total-sum;
		System.out.println(miss_no);
	}
		
}                                       
