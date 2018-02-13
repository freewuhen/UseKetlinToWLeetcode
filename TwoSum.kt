class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var re =    IntArray(2)
        var map:HashMap<Int,Int> = hashMapOf()
        for (i in 0..nums.size-1)
            map.put(nums[i],i)
        for(i in 0..nums.size-1)
        {
            re[0] = i;
            var aim:Int = target - nums[i];
            if (map.containsKey(aim) && map.get(aim) != i)
            {
                re[1] = map.get(aim)!!
                return re
            }
        }
        re[0] = -1
        re[1] = -1
        return re

    }
}
fun main(args:Array<String>)
{

    var s = Solution()
    var nums:IntArray = intArrayOf(3,2,4)
    var re = s.twoSum(nums,6)
    print("${re[0]},${re[1]}")


}