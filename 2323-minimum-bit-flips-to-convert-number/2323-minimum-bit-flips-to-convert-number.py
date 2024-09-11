class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        v1=str(bin(start))[2:]
        v2=str(bin(goal))[2:]
        if len(v1)>len(v2):
            cnt=len(v1)-len(v2)
            v2=str('0')*cnt+v2
        elif len(v2)>len(v1):
            cnt=len(v2)-len(v1)
            v1=str('0')*cnt+v1
        
        res=0
        for i,j in zip(v1,v2):
            if i!=j:
                res+=1
        return res