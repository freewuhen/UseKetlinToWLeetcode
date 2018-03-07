class Solution {
    fun p(s:String,left:Int, right:Int):Int
    {
        var l = left
        var r = right
        while (l >= 0&&r < s.length && s[l] == s[r])
        {
            l--
            r++
        }
        return r-l-1
    }
    fun longestPalindrome(s: String): String {
        var re:String = String()
        var len1 = 0
        var len2 = 0
        var len = 0
        var start = 0
        var end = 0
        for (i in 0 .. s.length-1) {
            len1 = p(s, i, i)
            len2 = p(s, i, i + 1)
            len = if (len1 >= len2) len1 else len2
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        print("start = $start,end = $end")
        re = s.substring(start,end+1)
        return re
    }
}
fun main(args:Array<String>)
{
    var s:String = "aacbc"
    var re:Solution = Solution()
    var res = re.longestPalindrome(s)
    print("\n$res")
}