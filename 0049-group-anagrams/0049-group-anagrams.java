class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(String s : strs) {
            String temp = s;
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            List<String> list = map.getOrDefault(String.valueOf(ch), new ArrayList<>());
            map.put(String.valueOf(ch), list);
            (map.get(String.valueOf(ch))).add(temp);            
        }
        
        for(List<String> list : map.values()) {
            ans.add(list);
        }
        
        return ans;
    }
}