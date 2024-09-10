# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        def gcd(a, b):
            while b > 0:
                r = a
                a = b
                b = r % b
            return a
        lis = []
        while head:
            lis.append(head)
            head = head.next
        a = lis[0]
        store_gcd = []
        for b in lis[1: ]:
            store_gcd.append(ListNode(gcd(a.val, b.val)))
            a = b
        ind = 0
        for i in range(len(lis) - 1):
            store_gcd[ind].next = lis[i].next
            lis[i].next = store_gcd[ind]
            ind += 1
        return lis[0]