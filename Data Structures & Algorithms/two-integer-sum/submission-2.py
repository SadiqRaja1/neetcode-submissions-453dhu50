class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        answer = []

        dictnaory = {}

        for num in range(len(nums)) :
            dictnaory[nums[num]] = num

        for num in range(len(nums)):
            helper = target - nums[num]
            if dictnaory.__contains__(helper) and dictnaory.get(helper) != num :
                answer.append(num)
                answer.append(dictnaory.get(helper))
                

                return answer

        return answer