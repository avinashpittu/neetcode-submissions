import math
class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
            
            
            l, r =1, max(piles)
            res = max(piles)
            while l<=r:
                count=0
                m = (l+r)//2
                for i in piles:
                    count+= math.ceil(i/m)
                if count<=h:
                    res = min(res,m)
                    r = m-1
                elif count>h:
                    l= m+1
            return res