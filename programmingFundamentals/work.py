import string

print(string.ascii_letters)


print(string.digits)


print(string.punctuation)


print(string.whitespace)

# Positional and Keyword arguments
print("Hello, {0} and {name}!".format("Alice", name="Bob"))

# Conversions (!s, !r, !a)
text = "Hello\nWorld"
print("{!s}".format(text))  # Calls str() -> normal output
print("{!r}".format(text))  # Calls repr() -> 'Hello\nWorld' (with escape chars)
print("{!a}".format(text))  # Calls ascii() -> 'Hello\\nWorld'

# Format Spec (alignment and decimal precision)
print("{:>10}".format("test"))    # Right-aligned in 10 spaces: '      test'
print("{:0.2f}".format(3.14159))  # Rounded to 2 decimal places: '3.14'