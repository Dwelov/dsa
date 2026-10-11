# in this  file i am studying the matrix data type and how to use it 

import numpy as np

A = np.array([[1, 2], 
              [3, 4]])

B = np.array([[5, 6], 
              [7, 8]])

print(A * B)

print(A @ B)

# * is used for the element wise and @ for the true matrix multiplication as happens in the real linear algebra

