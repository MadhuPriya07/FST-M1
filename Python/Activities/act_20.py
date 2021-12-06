import pandas
#print all the data in excel
dataframe=pandas.read_excel('activity19.xlsx')
print(dataframe)

#To print number of rows and columns
print(dataframe.shape)

#print data in email column only
print(dataframe["Email"])

#sort the data in ascending order based on first name
print(dataframe.sort_values('FirstName'))