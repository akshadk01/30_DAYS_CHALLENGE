def maxSubarrayLength(arr):
    # Dictionary to store the first occurrence of a sum
    sum_dict = {}
    
    # Initialize variables
    max_len = 0
    curr_sum = 0
    
    for i in range(len(arr)):
        curr_sum += arr[i]
        
        # Check if the current sum is zero
        if curr_sum == 0:
            max_len = i + 1
        
        # If the sum is already in the dictionary, update max_len
        elif curr_sum in sum_dict:
            max_len = max(max_len, i - sum_dict[curr_sum])
        
        # If the sum is not in the dictionary, store it with the current index
        else:
            sum_dict[curr_sum] = i
    
    return max_len

# Example usage
array = [15, -2, 2, -8, 1, 7, 10, 23]
result = maxSubarrayLength(array)
print("Length of the largest subarray with sum zero:", result)
