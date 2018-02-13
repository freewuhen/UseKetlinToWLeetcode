class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val re =    IntArray(2)

        for(i in 0..nums.size-1)
        {
            re[0] = i;
            var f = target - nums[i];
            for(j in 0..nums.size-1)
            {
                if(nums[j] == f)
                {
                    if(i == j) continue;
                    re[1] = j;
                    return re;//found the two num
                }
            }
        }
        re[0] = -1
        re[1] = -1
        return re

    }
}
fun main(args:Array<String>)
{
    val s = Solution()
    val nums:IntArray = intArrayOf(3,2,4)
    val re = s.twoSum(nums,6)
    print("${re[0]},${re[1]}")


}