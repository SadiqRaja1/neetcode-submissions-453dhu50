class Solution:
    def findMin(self, nums: List[int]) -> int:
        n = len(nums)
        start = 0
        end = n-1

        while start < end :
            mid = int(start + (end-start)/2)
            if nums[mid] > nums[mid+1] :
                return nums[mid+1]
            elif nums[mid] > nums[end] :
                start = mid+1
            else :
                end = mid

        
        return nums[0]