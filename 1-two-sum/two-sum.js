/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
   let i=0
   const map = new Map()
   while(i<nums.length){
    let needed = target - nums[i]
    if(map.has(needed))return [map.get(needed),i]
    map.set(nums[i],i)
    i++
   }
return []
}