class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxAr=0;
        while(left<right){
          
          int height=Math.min(heights[left], heights[right]);
          int side = right-left;
          int currAr = height*side;
          maxAr= Math.max(maxAr,currAr);
          if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxAr;

    }
}
