class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer>numsMap = new HashMap<>();
       int i = 0 ;
       while(i<nums.length){
        int needed = target - nums[i];
        if(numsMap.containsKey(needed)){
            return new int []{
                numsMap.get(needed),i 
            };
        }
            numsMap.put(nums[i],i);
            i++ ; 
       }
        return new int []{} ;
    }  
}