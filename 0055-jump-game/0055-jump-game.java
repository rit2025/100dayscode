class Solution {
    public boolean canJump(int[] nums) {
        int jump=0;
        for(int i=0;i<=jump;i++){
  jump=Math.max(jump,i+nums[i]);
            if(jump>=nums.length-1){
   return true;
            }
        }
        return false;
        
    }
}