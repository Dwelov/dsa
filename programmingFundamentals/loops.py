# Iterating over a list
fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
    print(fruit)

# Iterating using range() (0 up to 4)
for i in range(5):
    print(i)
    
    
# Using while loop
count = 0
while count < 5:
    print(count)
    count += 1
    
# Nested Loop
for i in range(3):
    for j in range(2):
        print(f"({i}, {j})")
        
        
# --- using break statement ------

for i in range(10):
    if i == 5:
        break
    print(i)       
    
    
# using else with for loop 
for i in range(3):
    print(i)
else:
    print("Loop finished successfully!")


    # --- using continue statement -----
    
for i in range(5):
    if i == 3:
        continue
    print(i)


    #--- using pass statement ---
    
for i in range(5):
    pass  # does nothing, used as a placeholder     