# explicit type casting 

# String to Integer & Float
num_str = "123"
num_int = int(num_str)
num_float = float(num_str)

print(num_int)    # Output: 123 (int)
print(num_float)  # Output: 123.0 (float)

# Float to Integer (cuts off the decimal part)
pi = 3.14159
print(int(pi))    # Output: 3

# Number to String
age = 21
message = "I am " + str(age) + " years old."
print(message)    # Output: I am 21 years old.


# implicit type casting 

x = 10      # Integer
y = 2.5     # Float

result = x + y  # Python automatically converts int (10) to float (10.0)
print(result)   # Output: 12.5 (Float)
print(type(result))
