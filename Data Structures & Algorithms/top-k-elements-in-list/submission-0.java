class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++ ){
            map.merge(nums[i], 1,Integer::sum);
        }
        int[] topNKeys = map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Sort by value descending
                .limit(k) // Take the top n entries
                .mapToInt(Map.Entry::getKey) // Extract the keys as an int array
                .toArray();


        System.out.println("Top " + k + " biggest values:");
        System.out.println(Arrays.toString(topNKeys));

        return topNKeys;
    }
}
