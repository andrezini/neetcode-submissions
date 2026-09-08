class Solution {
    public int lengthOfLongestSubstring(String s) {
         int pointer1 = 0;
        int max = 1;
        StringBuilder sb = new StringBuilder();
        if(s.isEmpty()){
            return 0;
        }
        sb.append(s.charAt(pointer1));
        for (int pointer2 = 1; pointer2< s.length(); pointer2++) {
            if (sb.indexOf(String.valueOf(s.charAt(pointer2))) == -1) {
                sb.append(s.charAt(pointer2));
                max = Math.max(max, sb.length());
            } else {
                pointer1++;
                pointer2 = pointer1;
                sb.setLength(0);
                sb.append(s.charAt(pointer1));
            }
        }
        return max;
    }
}
