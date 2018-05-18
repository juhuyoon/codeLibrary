#IF, ELSE, ELIF statements
#Makes use of colons and indentations(whitespace)
#This indentation allows for control for Python and is crucial.

#if (some_condition): #executes some code

#elif for doing something else when the condition does not end and it's in a chain.

#else, then do something else

if True:
    print("ITS TRUE")

#for the if/else statement were to work, then they have to LINE UP in indentation
hungry = False
if hungry:
    print("FEED ME")
else:
    print("I'm not hungry")

loc = 'Store'
if loc == "auto shop":
    print("cars")
elif loc == 'Bank':
    print("Money is Cool!")
elif loc == 'Store':
    print("Stuff are cool!")
else:
    print("i don't know")

name = "Sammy"
if name == 'Frankie':
    print("Hi Frankie")
elif name =='Sammy':
    print("Hello Sammy")
else:
    print("What is your name?")

#===================================================
#For loops
#iterable, you can iterate over every element in the object.
#you can use it over and over again.

my_iterable = ['a','b','c']
#item_name = parameter name
for item_name in my_iterable:
    print(item_name)

mylist = [1,2,3,4,5,6,7,8,9,10]
for num in mylist:
    print(num)

#C can also put in print('hello') to just get back 'hello' 10 times.

for num in mylist:
    if num % 2 == 0:
        print(num)
    else:
        print(f'odd number: {num}') #f = function

list_sum = 0
for num in mylist:
    list_sum = list_sum + num
# you want to get the sum of the list, and you have it start then add up the number list
print(list_sum) #by putting the indentation outside, it comes OUT of the for loop, and it only iterates once the end sum
#If it's tabbed inside, then it falls into the for loop and thus iterates through the entire addition sums.

mystring = "Hello World"
#good practice when you just want to iterate through:
for _ in mystring:
    print(_)

#for tuples
tup = (1,2,3)
for item in tup:
    print(item)

#Tuple unpacking
mylist = [(1,2),(3,4),(5,6),(7,8)] #tuple pairs of a list
print(len(mylist))

for item in mylist:
    print(item)

#OR
for (a,b) in mylist:
    print(a)
    print(b)

mylist2 = [(1,2,3),(5,6,7),(8,9,10)]
for a,b,c in mylist2:
    print(b)
    #print(a)
    #print(c)

#Dictionaries
d = {'k1':1, 'k2':2,'k3':3}
for key,value in d.items():
    #print(value)
    print(key)

#===========================================
#While Loops
#executes a block of code while some conditions remain true

x = 0
while x < 5:
    print(f'The current value of x is {x}')
    x += 1
else:
    print("x is not less than 5")
# it will run over and over again if you don't have the x = x + 1 to put a final condition

#BREAK, CONTINUE, PASS
#Break: breaks out of the current closest enclosing loop.
#Continue: Goes to the top of the closest elcosing loop.
#pass: Does nothing at all

y = [1,2,3]
for item in y:
    #to have a filler
    pass #to keep it has a placeholder when inputting in a function in your big code
print('end of my script')

mystring = 'Sammy'
for letter in mystring:
    if letter == 'a':
        continue #goes to the top of your loop and runs again, skipping the 'a'
    print(letter)

x = 0
while x <5:
    if x ==2:
        break #to end the code.
    print(x)
    x+= 1


#=========================================================
#Useful Operators:
#Arranged Function of Python
mylist = [1,2,3]
for num in range(0,11,2): #all the way to, but not including, from a starting point to ending point, with a step as well at the end.
    print(num)
print(range(0,11,2))
print(list(range(0,11,2)))

index_count = 0
word = 'abcde'
for item in enumerate(word): #take in any inumerable number/string, then returns it back in a list.
    print(item)

mylist1 = [1,2,3]
mylist2 = ['a','b','c']
mylist3 = [100,200,300]
for item in zip(mylist1, mylist2,mylist3):
    print(item) #puts the lists together, prints out the tuples.

print('x' in [1,2,3]) #to check if something's in a list, dictionary, tuples

d = {'mykey': 345}
print(345 in d.values ())

mylist =[100,200,300,400,500]
print(min(mylist))
print(max(mylist))

#IMPORTING A LIBRARY
from random import shuffle
mylist = [1,2,3,4,5,6,7,8,9,10]
shuffle(mylist)
print(mylist)

#Grabbing a random integer
from random import randint
print(randint(0,100))
mynum = randint(0,10)
print(mynum)

#result = input('Enter a Number here: ')

#===================================
#List Comprehensions
#unique way of quickly creating a list with Python.
#good alternatives to appending to a list

mystring = 'hello'
mylist = [letter for letter in mystring]
#this is a flattended out for loop
print(mylist)

mylist = [element for element in 'word']
print(mylist)

mynum = [num**2 for num in range(0,11)]
print(mynum)

#to grab only even numbers using a if function
mylist = [x for x in range(0,11) if x%2 ==0]
print(mylist)

celcius = [0,10,20,34.5]
fahrenheit = [((9/5)*temp + 32) for temp in celcius]
print(fahrenheit)

#the same is:
fahrenheit = []
for temp in celcius:
    fahrenheit.append(( (9/5)* temp + 32))
print(fahrenheit)

results = [x if x%2 == 0 else 'ODD' for x in range(0,11)]
print(results)