fruit_shop={
    "apple":10,
    "mango":12,
    "pineapple": 3,
    "guava": 4,
    "orange" : 7
}

key_tocheck=input("What are you looking for in Dictionary: ")

if(key_tocheck in fruit_shop):
    print("Apples are present")
else:
    print(key_tocheck," is not present")

