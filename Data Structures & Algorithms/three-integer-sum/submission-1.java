
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int pivot = 0; pivot < nums.length; pivot++) {

            // Skip duplicate pivots
            if (pivot > 0 && nums[pivot] == nums[pivot - 1]) {
                continue;
            }

            int left = pivot + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[pivot] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(
                        nums[pivot],
                        nums[left],
                        nums[right]
                    ));

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return result;
    }
}