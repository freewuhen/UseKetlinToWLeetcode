class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var n1 = nums1
        var n2 = nums2
        if (n1.size > n2.size) {
            var t = n1
            n1 = n2
            n2 = t
        }
        var left = 0
        var right = n1.size
        var halflen = (n1.size + n2.size + 1) / 2
        var i = 0
        var j = 0
        var maxleft = 0
        var minright = 0
        while (left <= right) {
            i = (left + right) / 2
            j = halflen - i
            if (i < n1.size && n2[j - 1] > n1[i]) {
                left++
            } else {
                if (i > 0 && n1[i - 1] > n2[j]) {
                    right--
                } else {

                    if (i == 0) {
                        maxleft = n2[j - 1]; } else if (j == 0) {
                        maxleft = nums1[i - 1]; } else {
                        maxleft = if (n1[i - 1] >= n2[j - 1]) n1[i - 1] else n2[j - 1]; }
                    if ((n1.size + n2.size) % 2 == 1) {
                        return maxleft.toDouble(); }


                    if (i == n1.size) {
                        minright = n2[j]; } else if (j == n2.size) {
                        minright = nums1[i]; } else {
                        minright = if (nums2[j] <= nums1[i]) nums2[j] else nums1[i]
                    }

                    return (minright + maxleft) / 2.0;
                }
            }

        }
        return 0.0
    }
}
    fun main(args:Array<String>)
{
    var s = Solution()
    var n1:IntArray = intArrayOf(1,3)
    var n2:IntArray = intArrayOf(2)
    var re =  s.findMedianSortedArrays(n1,n2)
    print(re)
}