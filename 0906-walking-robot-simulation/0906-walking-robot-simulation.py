class Solution:
    def robotSim(self, commands: List[int], obstacles: List[List[int]]) -> int:
        x,y=0,0
        dx,dy=0,1
        s=set(map(tuple,obstacles))
        mx=0
        for i in commands:
            if i==-1:#turn right
                dx,dy=dy,-dx
            elif i==-2:#turn left
                dx,dy=-dy,dx
            else:
                for _ in range(i):
                    if (x+dx,y+dy) in s:
                        break
                    else:
                        x+=dx
                        y+=dy
                        mx=max(mx,( (y*y)+(x*x) ))
        return mx