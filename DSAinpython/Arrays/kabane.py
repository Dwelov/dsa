#return the subarray which has the largest sum 

# 1. Problem Statement

# Given an integer array nums, find the contiguous subarray (containing at least one number) that has the largest sum, and return that sum.

#     Example: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

#     Output: 6 (from the subarray [4, -1, 2, 1])

def maxSubArray(nums: list[int]) -> int:
    # intialize variables
    maxSum = nums[0]
    currentSum = 0
    
    for num in nums:
        if currentSum < 0:
            currentSum = 0
            
        currentSum += num
        maxSum = max(maxSum, currentSum) 
    
    return maxSum

print(maxSubArray([-2, 1, -3, 4, -1, 2, 1, -5, 4]))