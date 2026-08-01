class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d={}
        total=0
        c=0
        for i in nums:
            total=total+i
            if((total-k) in d):
                c=c+d[i]
            d[total]=d.get(total,0)+1
        return c;        

        