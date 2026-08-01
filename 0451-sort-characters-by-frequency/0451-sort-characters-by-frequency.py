class Solution(object):
    def frequencySort(self, s):
        """
        :type s: str
        :rtype: str
        """
        d={}
        for i in s:
            d[i]=d.get(i,0)+1
        l = sorted(d.items(), key=lambda x: x[1], reverse=True)
        ans=""
        for key,value in l:
            ans=ans+(key*value)
        return ans    
