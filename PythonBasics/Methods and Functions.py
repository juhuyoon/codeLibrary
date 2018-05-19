#Methods are functions that are built into Python.

mylist = [1,2,3]
mylist.append(4)
print(mylist)

#mylist. then a list of possible methods should appear
#do this to see the documentation for the method.
help(mylist.insert)

#Also look stack overflow if you need to

#=====================================
#repeatable functions and codes

def name_of_function():
    '''
    DOCSTRING: information about the function
    Input: no input...
    Output: Hello ...
    '''
    print("Once")


name_of_function()

def say_hello(name):
   return 'hello ' + name

result = say_hello("Jose")
print(result)

def add(n1,n2):
    return n1 + n2

result = add(20,30)

print(result)

#Find out if the word "dog" is in a string?
def dog_check(mystring):
    return'dog' in mystring.lower()

print(dog_check('Dog ran away'))
print(dog_check('Cat ran away'))

#Pig Latin
#If word starts with a vowel, add 'ay' to the end
#If word does not start with a vowel, put first letter at the end, then add 'ay'
#word --> ordway
#apple --> appleay

def pig_latin(word):
    first_letter = word[0]
    # check if vowel
    if first_letter in 'aeiou':
        pig_word = word + 'ay'
    else:
        pig_word = word[1:] + first_letter + 'ay'
    return pig_word
print(pig_latin('apple'))


#===============================
#*args and **kwargs ARGUMENTS
#only two to 5 positional arguments can be passed
#GOOD TO USE WHEN DEALING WITH OUTSIDE LIBRARIES
def myfunc(a,b):
    #Returns 5% of the sum of a and b
    return sum((a,b)) * 0.05

print(myfunc(40,60)) #positional arguments where 40 is assigned to a, 60 to b.
#to do so, you had to pass this as tuples.

#to get past this limit of 2 to 5 arguments
#it doesn't have to say args, as long as it follows after *, it just activates "arguments"
def myfunc(*args):
    return sum(args) * 0.05

print(myfunc(40,60,100,1,34,60))

#arbitrary ways to use keyword arguments
#kwargs is a dictionary. Gives you control to call it
def myfunc(**kwargs):
    print(kwargs)
    if 'fruit' in kwargs:
        print('My fruit of choice is {}'.format(kwargs['fruit']))
    else:
        print("I did not find any fruit here")

print(myfunc(fruit='apple', veggie='lettuce'))

def myfunc(*args, **kwargs):
    print(args)
    print(kwargs)
    print('I would like {} {}'.format(args[0],kwargs['food']))

#must be in the same order as you have set up positionally
print(myfunc(10,20,30, fruit = 'orange', food = 'eggs', animal = 'dogs'))

