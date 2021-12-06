first_list=[12, 32, 56, 45, 66, 77]
second_listt=[13,45,66,78,22,9]
new_list=[]
for number in first_list:
    if number%2==0:
        continue
    else:
        new_list.append(number)

for number in second_listt:
    if number%2==0:
        new_list.append(number)
    else:
        continue
print(new_list)