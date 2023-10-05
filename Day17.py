def most_frequent_element(arr):
    frequency_table = {}
    for element in arr:
        if element in frequency_table:
            frequency_table[element] += 1
        else:
            frequency_table[element] = 1

    max_frequency = 0
    most_frequent_element = None
    for element, frequency in frequency_table.items():
        if frequency > max_frequency:
            max_frequency = frequency
            most_frequent_element = element

    return most_frequent_element
