#arrays stores the data in the continous memory locations,
# pythons lists are advanced arrays as we know that the data of the different types have different bytes 
# list solves this issue by storing the data in the non continous memory location and storing the address of
# the data in the list (not in java)

#advantages of the lists:
#1. dynamic arrays
#2. stores the data of different types
#3. random access

from string import printable
a = [1,2,3,4,5,6,7,8,9,10]
print(a) 

#appending - addition of the element at the end of the list - O(1) as it is only one step and does not depends upon the input

a.append(11)
print(a)  

# inserting - the time complexity is O(n)

a.insert(0,0) # cause right shift of all the elements , no of steps > no of elements
print(a)

a.insert(1, 0.5)
print(a)

# removing with pop() and the 
# 1- pop() - O(1)

a.pop()
print(a)

# 2- pop(index) - O(n)
a.pop(0)
print(a)

x = a
print(x)

a.remove(1)
print(x)

# x = a ---> that assignments simple assigns the full list to the x
# if i make any changes in x then it will be reflected in a

# searching in the python 

print(4 in a) # O(n)

# slicing 
print(a[1:4])

