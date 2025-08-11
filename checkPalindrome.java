public class checkPalindrome{
    public static boolean check_Palindrome(String str){
        int n=str.length();
       for(int i=0;i<n;i++){
        if(str.charAt(i)!=str.charAt(n-1-i)){
            return false;
        }
       }
       return true;
    }
    public static void main(String args[]){
        String str="racecar";
        check_Palindrome(str);
        System.out.print(check_Palindrome(str));
    }
}