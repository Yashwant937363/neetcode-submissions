class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(String str : strs){
            if(str.equals("")) prefix = "";
            for(int i = 0; i < str.length(); i++){
                if(i >= prefix.length()){
                    break;
                }
                if(str.charAt(i) != prefix.charAt(i) && i < prefix.length()){
                    prefix = str.substring(0, i);
                    System.out.println("Prefix: "+prefix);
                }
            }
            if(str.length() < prefix.length()) prefix = str;
            System.out.println(prefix);
        }
        return prefix;
    }
}