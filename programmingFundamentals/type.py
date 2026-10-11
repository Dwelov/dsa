
age: int = 21
name: str = "Siraj"
is_active: bool = True

# Function annotations  
def add(a: int, b: int) -> int:
    return a + b

result = add(10, 5)
print(result)  