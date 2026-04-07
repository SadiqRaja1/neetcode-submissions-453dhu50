class Solution:
    def search(self, nums: List[int], target: int) -> int:
        start = self.findStart(nums)

        if len(nums) == 0 :
            return -1
        elif len(nums) == 1 :
            return 0 if nums[0] == target else -1
        elif (nums[start] <= target and nums[len(nums)-1] >= target) :

            return self.binarySearch(nums,target,start,len(nums)-1);
        else :
            return self.binarySearch(nums, target, 0, start-1)
        return -1
    
    def binarySearch(self, nums: List[int], target : int, start : int, end : int) -> int :
        while start <= end :
            mid = int(start + (end - start)/2)
            if nums[mid] == target :
                return mid
            elif nums[mid] < target :
                start = mid+1
            else :
                end = mid-1

        return -1
    
    def findStart(self, nums: List[int]) -> int : 
        start = 0
        end = len(nums)-1

        while start < end :
            mid = int(start + (end - start)/2)

            if mid < len(nums)-1 and nums[mid] > nums[mid+1] :
                return mid+1
            elif nums[mid] > nums[end] :
                start = mid+1
            else :
                end = mid

        return 0