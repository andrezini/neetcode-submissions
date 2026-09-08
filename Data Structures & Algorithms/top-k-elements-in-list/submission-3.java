class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i<nums.length; i++){
           map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }

        PriorityQueue<Integer> pq =
    new PriorityQueue<>(
        (a, b) -> Integer.compare(map.get(b), map.get(a))
    );
        for(Integer number: map.keySet()){
            pq.add(number);
        }

        for(int i=0; i<k;i++){
            result[i]=pq.poll();
        }

        return result;
    }
}