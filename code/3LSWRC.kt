class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var length = 1
        var maxlength = 0
        var flag:Array<Boolean> = Array(128,{i -> false})
        for (i in 0 .. s.length-1)
        {
            flag[s[i].toInt()] = true
            for (j in i+1 .. s.length-1)
            {
                if(flag[s[j].toInt()] == true) break
                length++
                flag[s[j].toInt()] = true
            }
            if (length > maxlength) maxlength = length
            length = 1
            for (f in 0 .. flag.size-1) flag[f] = false
        }

        return maxlength
    }
}
fun main(args:Array<String>)
{
    var test:Solution = Solution()
    var s = "dvdf"
    var i = test.lengthOfLongestSubstring(s)
    print(i)
}