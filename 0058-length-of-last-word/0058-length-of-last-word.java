class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        String ans = "";
        for(int i = arr.length-1; i >= 0; i--) {
            if((!arr[i].equals(" ")) || (!arr[i].equals(""))) {
                ans = arr[i];
                break;
            }
        }
        return ans.length();
    }
}