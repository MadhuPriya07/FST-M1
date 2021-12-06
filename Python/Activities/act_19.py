# Import pandas, ExcelFile and ExcelWriter
import pandas
#from pandas import ExcelFile
from pandas import ExcelWriter

# Structure our data as a dictionary
data = {
  "FirstName": ["Satvik", "Avinash", "Lahri"],
  "LastName": ["Shah", "Kati", "Rathi"],
  "Email": ["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],
  "PhoneNumber": ["4537829158","4528727830","4528727830"]
}

# Create a new DataFrame using the data
dataframe = pandas.DataFrame(data)

# Create an ExcelWriter object
writer = ExcelWriter("activity19.xlsx")

# Write the DataFrame to the Excel file
dataframe.to_excel(writer, "activity19", index=False)

# Save the file
writer.save()