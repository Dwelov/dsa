# problem statements

def two_sum(nums:list[int],target:int) ->list[int]:
    seen={}
    for i , num in enumerate(nums):
        complement= target-num
        if complement in seen:
            return [seen[complement],i]
        seen[num]=i


numbers = [1,2,3,4,5,6]
target=10
print(two_sum(numbers,target))