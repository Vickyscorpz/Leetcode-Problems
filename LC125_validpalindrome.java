class Solution {
    public boolean isPalindrome(String s) {
        char str[]=s.toLowerCase().toCharArray();
        int n=s.length();
        int left=0,right=n-1;
        while(left<right){
            while(left<right && !Character.isLetterOrDigit(str[left]))left++;
            while(right>left && !Character.isLetterOrDigit(str[right]))right--;
            if(str[left]!=str[right]){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}