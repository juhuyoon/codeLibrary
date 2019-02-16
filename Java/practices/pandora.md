How to find first two minimum values in an array:
    Simple Solution: Sort the array in increasing order. First two elements in sorted array would be two smallest elements. O(n Log n)

    Better Solution: Scan the array twice. In first traveral, find minimum element. Let this element be x. In second traversal, find the smallest element greater than x. Time complexity is O(n).
    
1) Initialize both first and second smallest as INT_MAX
   first = second = INT_MAX
2) Loop through all the elements.
   a) If the current element is smaller than first, then update first 
       and second. 
   b) Else if the current element is smaller than second then update 
    second

How do cookies work?
    - Small data packets given to a browser by the server, reveals the cookies as applicables only to the domain that provided the cookie in the first place. 
    
    - Also used to monitor activity of Internet users. 

    -Session cookies are only stored when user is actively using the website

    - Persistent cookie is stored to local hard drive. 

Why are domains with different origins not allowed to access each other's cookies?
    - Same Origin Domain. 
        -When getting a resource from another domain, it will run the context of the domain that serves it. 
        -This is used to prevent the script on one website to access the information of another website. (Imagine you're on FB and you want to move to another website)

    -Cross Site Scripting
        It is a vulnerability that allows an attacker to inject JS code into a website so that it originates from the attacked website from the brower point of view.
        
Some command line arguments you can give your java program before it executes:
    1) basic ones like javac name.java
    2) then java name.java
    3) 

Java Errors to know!:
http://www.cs.cmu.edu/~tcortina/activate/java/errors.html
