# declaration and assignment 
# Define a function
def greet(name):
    print(f"Hello, {name}!")

# Call the function
greet("Siraj")
# Output: Hello, Siraj!

# parameters and arguments 

def add(a, b):      # Parameters
    return a + b

result = add(5, 3)  # Arguments 
print(result)       # Output: 8
    
    
# default parameter

def greet(name = "Guest"):
    return f"Hello, {name}!"

print(greet())    
print(greet("Siraj")) 


#keyword arguments 

def describe_pet(animal_type, pet_name):
    print(f"I have a {animal_type} called {pet_name}.")

        
# lambda functions
double = lambda x:x *2 
print(double(5))   