# a practical mini project that is the students marks analyzer 

from _sitebuiltins import _Printer
marks = [43,45, 55, 89,78,45,44,56,67,76]

total = 0
passcount = 0
failcount = 0

for mark in marks:
    total += mark
    if mark >= 40:
        passcount += 1
    else:
        failcount += 1  

print("no of students: ",len(marks))
print("total marks: ",total)
print("pass count: ",passcount)
print("fail count: ",failcount)
