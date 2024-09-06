# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        # For duplicates in num, and O(1) lookups to see if val is in nums 
        nums_set = set(nums)

        # Attach dummy node to head of list. 
        # fp (front pointer) points to head of list and bp (back pointer) trails behind at dummy node.
        # Store pointer to dummy node to return head of modified list.
        fp = ListNode(None)
        ans, bp = fp, fp
        fp.next = head
        fp = fp.next

        while fp:
            # Advance fp while node's value is in nums
            while fp and fp.val in nums_set:
                fp = fp.next

            # fp's value is not in nums, or fp is None (end of list).
            # Either way, make this bp's next node, and advance bp.
            bp.next = fp
            bp = bp.next

            # Advance fp, but check if .next exists (not end of list). 
            if fp:
                fp = fp.next

        return ans.next
        