import java.util.*;
public class MissCharacter{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        int i=0,j=0;
        char miss=' ';
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
                i++;
            }else{
                miss=str1.charAt(i);
                break;
            }
        }
        if(i<str1.length() && miss==' '){
            miss=str1.charAt(str1.length()-1);
        }
        if(miss==' '){
            System.out.println("NA");
        }else{
            System.out.println(miss);
        }
    }
}
