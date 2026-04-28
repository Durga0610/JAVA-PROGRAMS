import java.util.*;
public class Reverseonlydigitandcharacter{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char[] ch=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            }else if(!Character.isLetterOrDigit(ch[right])){
                right--;
            }else{
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
    }
}
