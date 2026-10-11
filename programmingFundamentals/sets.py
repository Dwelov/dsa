fruits = {"apple", "banana", "cherry"}

fruits.add("orange")         # Adds orange
fruits.remove("banana")      # Removes banana
fruits.discard("grape")      # Safe remove (won't crash if missing)

print(fruits)


set_a = {1, 2, 3, 4}
set_b = {3, 4, 5, 6}

# Union (all unique items)
print(set_a | set_b)          # Output: {1, 2, 3, 4, 5, 6}

# Intersection (common items)
print(set_a & set_b)          # Output: {3, 4}

# Difference (items in a but not b)
print(set_a - set_b)          # Output: {1, 2}

# Symmetric Difference (unique to each)
print(set_a ^ set_b)          # Output: {1, 2, 5, 6}