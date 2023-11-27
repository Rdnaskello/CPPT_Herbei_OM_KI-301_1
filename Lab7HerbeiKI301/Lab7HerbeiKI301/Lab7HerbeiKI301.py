
nRows = int(input("Enter the size of the square matrix: "))

filler = input("Enter the filler character: ")


if len(filler) != 1:
    print("Invalid filler character. The program terminates.")
    exit()


arr = [[' ' for _ in range(nRows)] for _ in range(nRows)]

for i in range(nRows):
    for j in range(i, nRows - i):
        arr[i][j] = filler


print("Generated jagged array:")
for row in arr:
    print(' '.join(row))

try:
    with open("output.txt", "w") as fout:
        fout.write("Generated jagged array:\n")
        for row in arr:
            fout.write(' '.join(row) + '\n')
    print("Array saved in the file 'output.txt'")
except IOError:
    print("Error writing to the file.")
    
input("Press Enter to exit.")
