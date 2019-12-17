public class isPalindrome {
    public static void main(String[] args){
        String str = "baaaab";
        isPalindrome(str);
    }
    static void isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                isPalindrome = false;
            i++;j--;
        }
        System.out.println(isPalindrome);
    }
}
