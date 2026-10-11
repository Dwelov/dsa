''' 
Arithmetic operators
Assignment operators
Comparison operators
Logical operators
Identity operators
Membership operators
Bitwise operators       
'''

#  -------------- Arithmetic operators -----------------

a = 3
b = 5

print("Addition :", a + b)

# Subtraction 

print("Subtraction :", a - b)

# Multiplication

print("Multiplication :", a * b)

# Division

print("Division :", a / b)

#floor division 

print("Floor Division :", a // b)

# Modulo

print("Modulo :", a % b)

# Exponentiation

print("Exponentiation :", a ** b)       

# -------Assignment Operators ----------

x = 5   # Assigns 5
x += 3  # Equivalent to x = x + 3 -> 8
x -= 2  # Equivalent to x = x - 2 -> 6
x *= 2  # Equivalent to x = x * 2 -> 12
print(x)

# ----------- Comparison Operators ----------
a, b = 5, 10

print(a == b)  # Equal to: False
print(a != b)  # Not equal to: True
print(a > b)   # Greater than: False
print(a < b)   # Less than: True
print(a >= 5)  # Greater than or equal to: True
print(b <= 10) # Less than or equal to: True


# ------------ logical operators ------------

x = True
y = False

print(x and y) # True if BOTH are true: False
print(x or y)  # True if AT LEAST ONE is true: True
print(not x)   # Reverses the boolean: False


# -------------- identity operators --------------
# they are used for the detection of the same type of objects of the memory
a = [1, 2, 3]
b = [1, 2, 3]
c = a

print(a is c)     # True (c points to the exact same object as a)
print(a is b)     # False (same values, but different objects in memory)
print(a is not b) # True


# ------------ membership operators -------------
# they are used to check that the member is present in the lists or not 
my_list = [1, 2, 3, 4, 5]

print(3 in my_list)  # True
print(6 in my_list)  # False
print(7 not in my_list) # True


# -------------- bitwise operators ---------
a = 10  # Binary: 1010
b = 4   # Binary: 0100

print(a & b)  # Bitwise AND -> 0 (0000)
print(a | b)  # Bitwise OR  -> 14 (1110)
print(a ^ b)  # Bitwise XOR -> 14 (1110)
print(~a)     # Bitwise NOT -> -11
print(a << 1) # Left Shift  -> 20 (10100)
print(a >> 1) # Right Shift -> 5  (00101)
