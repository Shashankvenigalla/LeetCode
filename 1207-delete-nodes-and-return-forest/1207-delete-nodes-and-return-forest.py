# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def delNodes(self, root: Optional[TreeNode], to_delete: List[int]) -> List[TreeNode]:
        
        roots = []
        to_delete = set(to_delete)
        def del_node(root, parent_deleted):
            if not root:
                return None
            
            curr_node_del = True if root.val in to_delete else False
            # if my parent is deleted but I will be not deleted then add myself to ans
            if parent_deleted and not curr_node_del:
                roots.append(root)
            
            # tell my children whether I will be deleted or not
            root.left = del_node(root.left, curr_node_del)
            root.right = del_node(root.right, curr_node_del)
            return None if curr_node_del else root

        del_node(root, True)
        return roots
