class Solution {
    public String mergeAlternately(String word1, String word2) {
        String output = "";
        int p1 = 0, p2 = 0;
        System.out.println(word2.isEmpty());
        while(p1 < word1.length() || p2 < word2.length()){
            if(p1 >= word1.length()){
                output += word2.substring(p2);
                break;
            }
            if(p2 >= word2.length()){
                output += word1.substring(p1);
                break;
            }
            output += word1.charAt(p1++);
            output += word2.charAt(p2++);
            System.out.println(output);
        }
        return output;
    }
}