# ----- creation of the lists --------

from ast import alias
friends = ["Ali","harry","hamza"]
print(friends)

# task 2 - indexing of list 
numbers = [10, 20, 30, 40, 50]

print(numbers[0])
print(numbers[-1])
print(numbers[1])
print(numbers[-2])

# ---- slicing ------ 
print(numbers[0:3])
print(numbers[1:])
print(numbers[2:5])
print(numbers[0:5:2])  #every second element
numbers.reverse()
print(numbers)


students = ["Ali", "Ahmed"]
students.append("sara")
students.insert(1, "moiz")
students.extend(["umar","sonia","bilal"])

print(students)


students.remove("moiz")
print(students)


students.pop()
print(students)

students.clear()
print(students)


marks = [45, 67, 89, 32, 76, 91, 55]
total = 0 
passcount = 0
failcount = 0
for mark in marks:
    total += mark
    if mark >= 40:
        passcount += 1
    else:
        failcount += 1
print(total)    
print("average :", total / len(marks)) 
print("pass count :", passcount)
print("fail count :", failcount)
print("max", max(marks))
print("min", min(marks))
    
    
#search 
students = ["Ali", "Ahmed", "Sara", "Ayesha"]

name = input("Enter a student name: ")

if name in students:
    print(name, "exists in the list.")
else:
    print(name, "does not exist in the list.")
    
sensor_data = [10, 15, -1, 20, 25, -1, 30]
positivels = []

for data in sensor_data:
    if data > 0:
        positivels.append(data)
        
print(positivels)
