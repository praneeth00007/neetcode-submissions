class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        boolean con = false;
        for(int i=0;i<nums.length;i++){
            if(hm.contains(nums[i])){
                con =true;
                break;
            }
            hm.add(nums[i]);
        }
       return con;
    }
}