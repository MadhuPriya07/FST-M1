
tuple_numbers= [12,34,67]

def sum(tuple_numbers):
    final_sum=0
    for item in tuple_numbers:
        final_sum+=item
    return final_sum

print(sum(tuple_numbers))