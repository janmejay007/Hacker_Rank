Given an array of positive integers nums and a positive integer target, return the minimal length of a 
subarray
 whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.


  class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        while(end<nums.length){
            sum+=nums[end++];

            while(sum>=target){
                ans=Math.min(ans,end-start);
                sum-=nums[start++];
            }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}
//         for(end=1;end<nums.length;end++){
//             currSum+=nums[end];
//             if(currSum>=target){
//               count=end-start;
//               ans=Math.min(ans,count);
//               currSum-=nums[start];
//               start++;  
              
//             }
//             else if(currSum<=0){
//                 if(nums[start]<0){
//                     currSum+=nums[start++];
                    
//                 }
//                 else{
//                     currSum-=nums[start++];
                    
//                 }
//             }
           
//         }
//         return ans;
//     }
// }
