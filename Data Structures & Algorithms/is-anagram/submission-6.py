class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) :
            return False
    
        Count = {}

        for i in range(len(s)):
            Count[s[i]] = Count.get(s[i],0)+1
            Count[t[i]] = Count.get(t[i],0)-1

        for c in Count.values():
            if c != 0:
                return False
            

        return True