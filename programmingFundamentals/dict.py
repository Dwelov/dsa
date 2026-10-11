# in this i will be practising the dictionaries and all the assocaited methods

student = {"name":"john","age":20,"city":"new york"}

# accessing the elemet 

print(student.get("age"))

# adding a new key and value    

student["gender"] = "male"
print(student)   

# removing a key and value  
# there are three methods here  - pop , del and clear

student.pop("age")  
print(student)

# del student["age"]    
# print(student)  

# student.clear()   
# print(student)      


# finally the useful dictionary methods 

print(student.keys())
print(student.values()) 
print(student.items())


# last but not the least , dictionary in

for key, value in student.items():
    print(key, value)       