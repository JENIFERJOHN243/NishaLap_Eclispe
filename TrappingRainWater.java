class Solution {
    public int trap(int[] height) {
        
        int left=0, right = height.length-1;
        int leftMax=0, rightMax=0, water=0;
        
        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] >= leftMax) leftMax = height[left];
                else water = water + leftMax - height[left];
                left=left+1;
            } else {
                if(height[right] >= rightMax) rightMax = height[right];
                else water = water + rightMax - height[right];
                right=right-1;
            }
        }
        return water;
    }
}
