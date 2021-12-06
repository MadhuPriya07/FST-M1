

def printFibonnaci(user_input):
    if user_input<=1:
        return user_input
    else:
        return printFibonnaci(user_input-1)+printFibonnaci(user_input-2)
user_input= int(input("How many Fibonnaci numbers to generate?: "))
if user_input<=0:
    print("Please enter a positive number")
else:
    print("Fibonacci Sequence: ")
    for i in range(user_input):
         print(printFibonnaci(i))

	
       