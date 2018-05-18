# numbers, setting variables. Note that variables in Python are dynamic typings, so they can have different assignmments
# if the assignments are all different types i.e. one can be a number/string, the other a list(array).
#RUN TO SEE THE RESULTS

my_income = 100
tax_rate = 0.1

my_taxes = my_income * tax_rate
print(my_taxes)

# Use double quotes when you need to use single quotes for grammar terms.
print("I'm going on a run")

print('print \nfirst') # to have a space
print('Something \tsecond') # to have a tab


# Practicing indexing. To call on the letter on the string of that position.
mystring = "Hello World"
print(mystring)
print(mystring[0])
#Reverse indexing, literally go backwards of your string.
print(mystring[-1])

#from position index 2 to the end
mystring2 = 'abcdefghijk'
print(mystring2[2:])

#from position index 3 and backwards
print(mystring2[:3])

#to get specific positions of positioning:
print(mystring2[3:6])

#to grab all of it
print(mystring2[::])

#to do step sizing, jumping around the indexing of your positioning
print(mystring2[::3])

#starting from index 2, stop at 7, step sizing(skipping) every 2
print(mystring2[2:7:2])

#reversing the string
print(mystring2[::-1])

#=======================================================
#String Properties and Methods

#Immutability, strings cannot be reassigned. So to make changes, you must do new equations
#Change Sam to Pam
name = "Sam"
last_letters =name[1:]
print(last_letters)
print('P' + last_letters) #String concatenation

x = "Hello World"
print(x + ' it is beautiful outside')
x = x + (' it is beautiful nowhere ')
print(x)
print(x + x)
print(x)

#have multiple string variables:
letter = 'z'
multiples = letter * 10
print(multiples)

#additional methods for variables and functions
print(x.upper())
print(x.lower())
print(x.split())
print(x.split('i')) #splits on every i

#.format() method
#Good way to format objects into your strings for print statements.
#Syntax is: 'String here {} then also {}'.format('something1', 'something2')

print('This is a string {}'.format('INSERTED'))
#can also put specific indexes to make specific positions.
print('The {2} {1} {0}'.format('fox', 'brown', 'quick'))
#assigning variables
print('The {q} {b} {f}'.format(f='fox', b='brown', q='quick'))

#Float Formatting follows "{value: width.precision f}"
result = 100/777
print(result)
#To make precision of when it rounds the number and the like for long decimal numbers.
# The width adds the white space in front of the number
print("the result was {r:1.3f}".format(r=result))

#F-strings lets you do the same thing without using .format()
#Put f in front, then put in assigned variable into {}
#Note this is only available after 3.6 Python
name = "Jose"
age = 10

print(f"Hello, his name is {name} and he is {age} years old")


#======================================================
#Lists (basically an array)
# Ordered Sequence can be indexed or sliced.
my_list = [1,2,3]
my_list = ['one', 'two', 'three']
print(my_list)

#to see how many are in it
print(len(my_list))

#Concatenation
another_list = ['four', 'five']
new_list = my_list + another_list
print(new_list)

#to change what's inside the list
new_list[0] = 'ONE ALL CAPS'
print(new_list)

#appending
new_list.append('six')
print(new_list)

#removing the end
new_list.pop()
print(new_list)
print(new_list.pop())

popped_item = new_list.pop()
print(popped_item)
print(new_list.pop(0))
print(new_list)

# sorts and reverse
sorting_list = ['a', 'e', 'i', 'o', 'u']
number_list = [1,2,3,4]
sorting_list.sort() #If you print this, you will get nothing as this is just a method. You must call back the list after you run this method.
print(sorting_list)
number_list.sort()
my_number_list = number_list
print(my_number_list)

number_list.reverse()
print(my_number_list)
nested_number = [1,3,[1,2]]
print(nested_number[2][1])



#===================================================
#Dictionaries: unordered mappings for storing objects. Allow you to store via key-value pairing.
# {'key1':'value1', 'key2': 'value2'}
#Objects retrieved by key name. Unordered and cannot be sorted.

my_dict = {'key1' : 'value1', 'key2' : 'value2'}
print(my_dict)
print(my_dict['key1'])

prices_lookup = {'apple': 2.99, 'oranges': 1.99, 'milk':5.80}
print(prices_lookup['apple'])

elementD = {'k1':123, 'k2': [0,1,2], 'k3':{'insideKey':100}}
print(elementD['k2'][1])
print(elementD['k3'])
print(elementD['k3']['insideKey'])

upperD = {'key1':['a', 'b', 'c']}
print(upperD['key1'][1].upper())

#adding new values
d = {'k1': 100, 'k2':200}
print(d)
d['k3'] = 300
print(d)

#to get all the keys and values
print(d.keys())
print(d.values())


#=========================================================
#Tuples
# Very similar to lists, but they cannot be changed [immutable]
#Once an element is inside the tuple, it cannot be reassigned
#Tuples use parenthesis: {1,2,3)


t = (1,2,3)
print(type(t))
print(t)

t=('one', 2)
print(t[0])

# counting with tuple
t = ('a', 'a', 'b')
print(t.count('a'))

#indexing with tuple
print(t.index('a'))

#TUPLE DOES NOT ALLOW ITEM ASSIGNMENT
#Done for data integrity

#==================================================================
#Sets
#unordered collections of unique elements
#there can be only one representative of the same object.

myset = set()
print(myset)
myset.add(1)
print(myset)
myset.add(2)
print(myset)
#The additional 2 won't be noticed as they must all be unique values
myset.add(2)
print(myset)

mylist = [1,2,2,3,2,2,3,1,2,3,4]
print(set(mylist))

#===================================================================
#Booleans
#True or False statements
#Must be Capitalized True or False

print(type(True))
print(1 > 2)
print(1 == 1)
b = None
print(b)

