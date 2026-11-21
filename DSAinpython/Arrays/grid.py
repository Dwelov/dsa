grid = [[0]*3]*3
print(grid)
grid[0][0] = 1
print(grid)
grid[0][1]=2
print(grid)

# the reason of getting the change in all the third with the same elements is that lists copy the same pointer every time 
# the solution

grid = [[0]*3 for _ in range(3)]
grid[0][1] = 2
print(grid)
