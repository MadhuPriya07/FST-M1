user_input= input("Enter numbers and make them comma seperated: ").split(",")

tuple_change= tuple(user_input)

for number in tuple_change:
    if int(number)%5==0:
        print(number)
	
