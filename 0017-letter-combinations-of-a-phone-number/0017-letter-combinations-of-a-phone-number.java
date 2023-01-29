class Solution {
    public List<String> letterCombinations(String digits) {
        Map<String, String> map = new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        
        String output = new String("");
        int index = 0;
        solve(digits, output, index, ans, map);
        return ans;
    }
    
    public void solve(String digits, String output, int index, List<String> ans, Map<String, String> map) {
        
        if(index >= digits.length()) {
            ans.add(output);
            return;
        }
        
        int number = digits.charAt(index)-'0';
        String value = map.get(String.valueOf(number));
        
        for(int i = 0; i < value.length(); i++) {
            output = output + value.substring(i, i+1);
            solve(digits, output, index+1, ans, map);
            output = output.substring(0, output.length()-1);
        }
        
    }
}