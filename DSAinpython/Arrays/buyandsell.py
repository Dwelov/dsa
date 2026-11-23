#Problem Statement
# Given an array prices where prices[i] is the stock price on day i, return the maximum
# profit you can make from one buy and one sell. You must buy before you sell; if no profit is possible, return 0.   
# Example

#    Input: prices = [7, 1, 5, 3, 6, 4]

#    Output: 5 (buy on day 2 at price 1 and sell on day 5 at price 6 -> 6 - 1 = 5)   

# Optimal Solution (Python)Instead of checking every buy/sell pair with nested loops (O(n2)
# O(n2)), do a single pass while tracking the lowest buying price seen so far.   

def max_output(prices:list[int])-> int:
    # initialize variables
    min_price = float('inf') # the purpose of this the algorithms starts from the very small value
    max_profit = 0
    
    for price in prices:
        min_price = min(min_price, price)
        max_profit = max(max_profit, price - min_price)
    return max_profit

#testing for the outputs

prices = [7, 1, 5, 3, 6, 4]
nums = [3,4,6,7,3,2,1,9]

print(max_output(prices))
print(max_output(nums))