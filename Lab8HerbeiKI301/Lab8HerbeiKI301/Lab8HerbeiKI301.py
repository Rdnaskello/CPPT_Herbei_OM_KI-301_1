import os
import struct
import sys
import math

def write_result_txt(file_name, result):
    with open(file_name, 'w') as file:
        file.write(str(result))

def read_result_txt(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'r') as file:
                result = float(file.read())
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def write_result_bin(file_name, result):
    with open(file_name, 'wb') as file:
        
        file.write(struct.pack('f', result))

def read_result_bin(file_name):
    result = 0.0
    try:
        if os.path.exists(file_name):
            with open(file_name, 'rb') as file:
               
                result = struct.unpack('f', file.read())[0]
        else:
            raise FileNotFoundError(f"File {file_name} not found.")
    except FileNotFoundError as e:
        print(e)
    return result

def calculate_expression(x):
    try:
        result = math.sin(x) / math.cos(x)
        return result
    except ZeroDivisionError:
        print("Error: Division by zero.")
        sys.exit(1)

if __name__ == "__main__":
    x_value = float(input("Enter the value of x: "))
    
    result_value = calculate_expression(x_value)
    
    print(f"Result is: {result_value}")
    
    try:
        write_result_txt("text_result.txt", result_value)
        write_result_bin("bin_result.bin", result_value)
        
        print("Result (from binary file) is: {0}".format(read_result_bin("bin_result.bin")))
        print("Result (from text file) is: {0}".format(read_result_txt("text_result.txt")))
    except FileNotFoundError as e:
        print(e)
        sys.exit(1)

