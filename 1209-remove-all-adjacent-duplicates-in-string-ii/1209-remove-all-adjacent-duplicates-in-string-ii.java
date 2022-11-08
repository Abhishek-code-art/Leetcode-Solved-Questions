class Solution {
    public String removeDuplicates(String s, int k) {
//         int i = 0;
//         int[] stack = new int[s.length()];
//         int[] count = new int[26];
        
//         for(int j = 0; j < s.length(); j++) {
//             char curr_char = s.charAt(j);
//             count[curr_char - 'a'] = count[curr_char - 'a'] + 1;
//             if(i > 0 && stack[i-1] == curr_char) {
//                 if(count[curr_char - 'a'] == k) {
//                     i -= k-1;
//                     count[curr_char - 'a'] = count[curr_char - 'a'] - k;
//                 } else {
//                     stack[i++] = curr_char;
//                 }
//             } else {
//                 stack[i++] = curr_char;
//             }
//         }
        
//         return new String(stack, 0, i);
        
        int i = 0, n = s.length(), count[] = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
            count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) i -= k;
        }
        return new String(stack, 0, i);
    }
}