package Day7;

import java.util.Locale;

public class palindrome1 {
    public static void main(String[] args){
        String str="Is MadAm Si".toLowerCase();
        str.trim();
        int left=0;
        int right=str.length()-1;
        boolean IsPalindrome=true;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                IsPalindrome=false;
                break;
            }left++;
            right--;
        }
        if(IsPalindrome){
            System.out.println(str + " is a palindrome ");
        }else{System.out.println(str + " is not a palindrome ");}
    }
}
