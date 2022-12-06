class Solution {
    public int search(int[] nums, int target) {
        int low =0;                                
        int high = nums.length-1;
        
        while(low <= high){                           //comparison
            int mid = (low + high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) high = mid -1;
            else low = mid+1;
        }
      return -1;  
    }
}                                              
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
//Memory Usage: 54.2 MB, less than 51.04% of Java online submissions for Binary Search.