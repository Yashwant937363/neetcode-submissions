class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() <= 0 || s.length() <= 0 || s.length() != t.length()) return false;
        for(char c: s.toCharArray()){
            if(!t.contains(String.valueOf(c))) return false;
            t = t.replaceFirst(String.valueOf(c),"");
        }
        return true;
    }
}
