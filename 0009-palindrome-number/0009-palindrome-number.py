import math

class Solution:
    def isPalindrome(self, x: int) -> bool:
        x_str = str(x)
        if x_str[::-1] != x_str:
            return False
        return True