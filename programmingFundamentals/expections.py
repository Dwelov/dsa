# try:
#     result = 10 / 0
# except ZeroDivisionError:
#     print("Error: You cannot divide by zero!")
    

# else clause 

try:
    file = open("myfile.txt", "r")
except FileNotFoundError:
    print("Error: File not found!")
else:
    print("File opened successfully!")
    file.close()

# finally clause 
try:
    file = open("data.txt", "r")
except FileNotFoundError:
    print("File not found.")
else:
    print("File opened successfully.")
    file.close()
finally:
    print("This runs no matter what.")
    
    
# raise keyword 
def check_age(age):
    if age < 0:
        raise ValueError("Age cannot be negative!")
    return f"Valid age: {age}"

