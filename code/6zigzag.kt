/*The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
(you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".*/
class ZZSolution {
    fun convert(s: String, numRows: Int): String {
        var re:String = ""
        var slength:Int = s.length
        if(slength == 0 || numRows < 2) return s
        var tlen = 0
        var next = numRows + numRows -2
        var j = 0
        for (i in 0..numRows-1)
        {
            j  = i
            while (j < slength)
            {
                re = re+s[j]
                if (i > 0 && i < numRows-1)
                {
                    if(i > 0 && i < numRows-1)// In addition to the special treatment of the head and tail
                    {
                        tlen = j+2*numRows - 2 - 2*i
                        if(tlen < slength)
                        {
                            re = re + s[tlen]
                        }

                    }
                }
                j = j + next
            }
        }
        return re
    }
}
fun main(args:Array<String>)
{
    var re:ZZSolution = ZZSolution()
    var s = re.convert("PAYPALISHIRING",3)
    print(s)
}