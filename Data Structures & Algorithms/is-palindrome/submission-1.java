class Solution {
    public boolean isPalindrome(String s) {
        int start = 0, end=s.length() - 1;
        if(s.length() <= 1) return true;
        while(start<end){
            char left = Character.toLowerCase(s.charAt(start));
            char right = Character.toLowerCase(s.charAt(end));
            System.out.println((int)left+" "+(int)right);
            if(!Character.isLetterOrDigit(left)) {
                start++;
                continue;
            }else if(!Character.isLetterOrDigit(right)){
                end--;
                continue;
            }
            if(left != right) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }
}
