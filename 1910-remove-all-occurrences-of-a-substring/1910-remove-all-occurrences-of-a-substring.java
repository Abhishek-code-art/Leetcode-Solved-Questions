class Solution {
    public String removeOccurrences(String s, String part) {
        int i = 0;
        int j = 0;
        int k = part.length();
        
        while(j < s.length()) {
           if(j-i+1 < k) {
               j++;
           } else if(j-i+1 == k) {
               String temp = s.substring(i, j+1);
               if(temp.compareTo(part) == 0) {
                   s = s.substring(0,i) + s.substring(j+1, s.length());
                   i = 0;
                   j = 0;
               } else {
                   i++;
                   j++;
               }
           }
        }
        
        return s;
    }
}