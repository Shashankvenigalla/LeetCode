class Solution(object):
    def addTwoNumbers(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        ptr1 = l1
        ptr2 = l2
        
        res_head = ListNode()
        res_ptr = res_head
        carry = 0
        while ptr1 or ptr2:
            val1 = ptr1.val if ptr1 else 0
            val2 = ptr2.val if ptr2 else 0
            add = val1 + val2 + carry
            r = add%10
            carry = add // 10
            new_res_node = ListNode(r)
            res_ptr.next = new_res_node
            res_ptr = new_res_node

            
            ptr1 = ptr1.next if ptr1 else None
            ptr2 = ptr2.next if ptr2 else None
        
        if carry:
            res_ptr.next = ListNode(carry)
        return res_head.next