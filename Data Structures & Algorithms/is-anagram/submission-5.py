class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t) :
            return False
    
        
        sCount = {}
        tCount = {}

        for i in range(len(s)) :
            ch_s = s[i]
            ch_t = t[i]

            if ch_s in sCount :
                sCount[ch_s] += 1
            else :
                sCount[ch_s] = 1

            if ch_t in tCount :
                tCount[ch_t] += 1
            else :
                tCount[ch_t] = 1
        
        return sCount == tCount