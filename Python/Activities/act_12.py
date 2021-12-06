
def sum(n):
    if(n<=0):
        return n
    else:
        return n +sum(n-1)

n=int(input("Provide a number: "))	

print(sum(n))