import pandas

dataframe=pandas.read_csv('activity17.csv')
#print data in username column only
print(dataframe["Usernames"])

#print username and password of second row
print(dataframe["Usernames"][1],"    ",dataframe["Password"][1])

#Sort the Usernames column data in ascending order and print data
print(dataframe.sort_values("Usernames"))

#Sort the Passwords column in descending order and print data
print(dataframe.sort_values("Password",ascending=False))