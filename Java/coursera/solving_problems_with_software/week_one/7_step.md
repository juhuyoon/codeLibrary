How you should approach solving problems:
1) Work by Hand
2) Write down what you did 
    - Write down exact step and just the instance needed. 
            -Work the instance yourself
3) Find patterns
    -Algorithms for any instances
        -Write down this instance
        -Generalize
        -Initialize values needed
    -Figure out repetitions, conditions and values
    -Dificulties? Go back to steps 1 and 2
4) Check by hand
    -Incorrect patterns? Check here
    -Check with different inputs
5) Translate to code
    -Syntaxes and programming languages
6) Run Test Cases
7) Debug failed test cases

With solving how to run perimeters: 
0. Start with TotalPerim = 0;
1. Start with prevPt = the last point
2. For each point currPt in the shape,
    3. Find distance from prevPt pt to currPt, name it currDist
    4. Update totalPerim to be totalPerim + currDist
    5. Update prevPt to be currPt. 
6. totalPerim is my answer
