Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
class Solution {
    public boolean isPalindrome(String s) {

        char[] ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            if(!Character.isLetterOrDigit(ch[i])){
            i++;}
            else if(!Character.isLetterOrDigit(ch[j])){  j--;}
          
            else if(Character.toLowerCase(ch[i])!=Character.toLowerCase(ch[j]))
            return false;
            else{
                i++;
                j--;
            }
        }

        return true;
    }
}
