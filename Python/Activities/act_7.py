list=input("Enter numbers with comma seperated value: ").split(",")
sum=0
for number in list:
    sum=sum+int(number)

print(sum)