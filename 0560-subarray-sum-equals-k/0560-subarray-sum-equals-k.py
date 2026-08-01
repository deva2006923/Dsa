class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        d={0:1}
        total=0
        c=0
        for i in nums:
            total=total+i
            if((total-k) in d):
                c=c+d[total-k]
            d[total]=d.get(total,0)+1
        return c;        

        