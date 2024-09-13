class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        n = len(arr)
        prefix = [0]*(n+1)
        for i in range(1,n+1):
            prefix[i] = prefix[i-1]^arr[i-1]
        res = []
        for i in range(len(queries)):
            left,right = queries[i][0],queries[i][1]
            digit = prefix[right+1]^prefix[left]
            res.append(digit)
        return res
