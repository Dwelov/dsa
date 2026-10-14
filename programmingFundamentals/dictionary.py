# creating a dictionary

marks = {
    "Maths" : 98,
    "Physics" : 89,
    "Chemistry" : 92,
    "Computer Science" : 100
}

total = 0
for values in marks.values():
    total += values

print("total :", total)
print("average :",total/len(marks))
print("max :", max(marks.values()))
print("min :", min(marks.values()))
print("Maths    : ", marks.get("Maths"))
print("Physics  : ", marks.get("Physics"))
print("Chemistry  : ", marks.get("Chemistry"))
print("Computer Science  : ", marks.get("Computer Science"))

# create a dictionary

student = {
    "name" : "Siraj",
    "age" : 21,
    "city" : "Karachi",
    "Semester": 3,
    "marks" : {
        "Maths" : 98,
        "Physics" : 89,
        "Chemistry" : 92,
        "Computer Science" : 100
    }
}

    
print(student)

# updating my name 

student["name"] = " Siraj Ahmed"
print(student)
