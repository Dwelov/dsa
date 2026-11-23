# so basically in this problem we have to find the solution of the array such
# that the product of the array is equal to the all other exppect the current element.

# for example A= [1,2,3,4] ans will be [24, 12,8,6]

from sys import prefix
from programmingFundamentals.conditionals import result
def productOfOthers(nums:list[int]) -> list[int]:
    # create an empty list of same length as nums
    n = len(nums)
    result = [1] * n
    
    #creating the prefix and multiply with the other number
    prefix = 1
    for i in range(n):
        result[i] = prefix
        prefix *= nums[i]
    
    #creating the suffix and multiply with the other number
    suffix = 1
    for i in range(n-1, -1, -1):
        result[i] *= suffix
        suffix *= nums[i]
    
    return result