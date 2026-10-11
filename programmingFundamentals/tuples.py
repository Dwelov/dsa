# they are similar to lists but the major difference is that we can not modify them , and its operations are quite similar to the lists 

#deaclaration of the tuple

numbers = (1,2,3,4,5)
print(numbers)


# accessing the elements of the tuple 

print(numbers[0])
print(numbers[1])
print(numbers[2])
print(numbers[3])       
print(numbers[4])  


# try to modify them 

# numbers[0] = 10 
# print(numbers)

# discussing the tuple methods index and count

print(numbers.count(2))
print(numbers.index(5))


# last concept tuple unpacking

a,b,c,d,e = numbers

print(a)
print(b)
print(c)
print(d)
print(e)   


# Slicing concept 
