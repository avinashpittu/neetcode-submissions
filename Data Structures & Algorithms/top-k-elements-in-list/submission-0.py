class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        d={}

        for i in nums:
            d[i] = d.get(i, 0)+1
        
        s = []
        for key,val in d.items():
            s.append([val, key])
        s.sort()

        t =[]
        while len(t)<k:
            t.append(s.pop()[1])
        return t

        