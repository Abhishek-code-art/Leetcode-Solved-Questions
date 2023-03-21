class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();
        int ans = -1;
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            q.add(i);
            
            while(!q.isEmpty()) {
                if(map.get(s.charAt(q.peek())) > 1) {
                    q.poll();
                } else {
                    ans = q.peek();
                    break;
                }
            }
            
            if(q.isEmpty()) {
                ans = -1;
            }
        }
        return ans;
    }
}