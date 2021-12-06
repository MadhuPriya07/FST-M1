list= input("Enter list of numbers comma seperated: ").split(",")

first_element=list[0]
last_element=list[-1]

if first_element==last_element:
    print("True")
else:
    print("False")