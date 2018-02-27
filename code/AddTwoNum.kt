/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int = 0) {
 *     var next: ListNode? = null
 * }

 */
class ListNode(var `val`: Int = 0)
{
        var next: ListNode? = null
}

class ADN_Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var re:ListNode = ListNode()
        var t:ListNode = re
        var l1t:ListNode? = l1
        var l2t:ListNode? = l2

        var carry = 0
        var sum = 0
        var l1v = 0 //  temporarily store the value of l1
        var l2v = 0 // temporarily store the value of l2

        t.`val` = (l1!!.`val`+l2!!.`val`)%10
        print("l1v = ${l1.`val`}\n")
        print("l2v = ${l2.`val`}\n")
        print("${t.`val`}\n")
        carry = (l1!!.`val`+l2!!.`val`)/10
        l1t = l1t!!.next
        l2t = l2t!!.next
        t.next = null
        // the above steps because the List is headless
        while (l1t != null || l2t != null)//only two listnodes are empty cycle will stop
        {
            var nextnode:ListNode = ListNode()
            if(l1t == null)
            {
                l1v = 0;
            }
            else
            {
               l1v = l1t!!.`val`
               l1t = l1t.next
            }
            if(l2t == null)
            {
                l2v = 0;

            }
            else
            {
                l2v = l2t!!.`val`
                l2t = l2t.next
            }
            sum = l1v + l2v +carry
            carry = sum/10
            sum = (sum%10)
            nextnode.`val` = sum
            nextnode.next = null

            //Iteration ,create new node
            t.next = nextnode
            t  = nextnode
        }
        if(carry == 1)
        {
            var p = ListNode(1)
            p.next = null
            t.next = p
            print("p.`val` = $p.`val`")
        }
        return re
    }
}
fun main(args:Array<String>)
{
    var l1:ListNode = ListNode(2)
    var l2:ListNode = ListNode(4)
    var l3:ListNode = ListNode(3)
    var r1:ListNode = ListNode(5)
    var r2:ListNode = ListNode(6)
    var r3:ListNode = ListNode(4)

    l1.next = l2
    l2.next = l3
    l3.next = null

    r1.next = r2
    r2.next = r3
    r3.next = null

    var test:ADN_Solution = ADN_Solution()
    print("addTwoNumbers run over\n ")
    var testlink:ListNode? = test.addTwoNumbers(l1,r1)
    print("l3 = ")
//    while(testli nk != null)
//    {
//        print(testlink.`val`)
//        testlink = testlink.next
//    }
    print(testlink?.`val`)
    testlink = testlink!!.next
    print(testlink?.`val`)
    testlink = testlink!!.next
    print(testlink?.`val`)
    print("\ntest")

}