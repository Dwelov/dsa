fruits = ["apple", "kiwi", "banana"]

print(fruits)

# modification of the list 
fruits[2] = "cherry"
fruits.append("orange")

print(fruits)

# Accessing element from the list 

print(fruits[0])    

# insertion, extention 

fruits.insert(2, "grape")
print(fruits)

fruits.extend(["mango", "pineapple"])
print(fruits)


# removal of elements from the list 

fruits.remove("mango")
print(fruits)

fruits.pop()
print(fruits)

# .clear if you want to clear the list 


#organizing and searching operations of the lists

scores = [50, 10, 30, 10, 40]

scores.sort()          # [10, 10, 30, 40, 50]
scores.reverse()       # [50, 40, 30, 10, 10]
print(scores.count(10))# Output: 2
print(scores.index(30))# Output: 2


# len and in are the other useful operations
print(len(fruits))
print("apple" in fruits)


# --- List slicing ----

print(fruits[1:3])  # ['kiwi', 'cherry']
print(fruits[:2])   # ['apple', 'kiwi']
print(fruits[2:])   # ['cherry', 'grape']