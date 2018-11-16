//Markov Text Generation
    //Generates and recognizes text
    //Statistical and probabilitisic models
    //Idea behind both the Google's PageRank and Machine Learning algorithms.
//Focus on Generalizing a concept and algorithm
    //From 0-order, 1-order to N-order
    //Developing a Java interface

//Capturing Abstractions in Java
    //Understanding design and testing
    //Understasnding efficiency
//Software engineering knowledge and skills

//Order-zero Markov text generation
    //Use training text to generate text randomly
    //Chooses character at random and it doesn't use any characters to 'predict' the next character
//In order-one, use one character to predict the next. 
    // Every character except the first in the text above is chosen from a subset of characters that are found in the training text after the preceding character.
    //One character is used to predict the next character at random 


    //Set methods separately so that the methods are single-purpose
        //Set the training text
            //To be used when generating the random text
            //Might want to geneerate several random 'texts' from the same training text
            //Store text in instance variable to set in one method and access in another
        //Generate the random text

            public String getRandomText(int numChars) {
                if(myText == null) return "";

                StringBuilder sb = new StringBuilder();
                for(int k = 0; k < numChars; k++ ) {
                    int index = myRandom.nextInt(myText.length());
                    sb.append(myText.charAt(index));
                }
                return sb.toString();
            }

//Constructors should initialize the fields
            //Random Number generator
                //Sometimes useful to set the seeds
        public class MarkovZero {
            private Random myRandom;
            private String myText;
            public MarkovZero() {
                myRandom = new Random();
            }
            public void setRandom(int seed) {
                myRandom = new Random(seed);
                //used to do debugging for the MarkovZero class
                //Setting the seed of the random number generator. 
            }
        }

//Markov-one -two
        //Find occurrences of 't' or 'th' in training text
        //Follow characters to generate text at random
//key algorithm: use of training to find all following characters
        //Develop for Markov-one, and then generalize outwards
        
//how to build algorithm:
        //1) Follows list is initially empty
        //2) find first occurrence of 't' starting at index 0
        //3) Add letter at index 1 to follows
        //4) find first occurrence of 't' starting at index 1
        //5) add letter at index 13 to follows
        //6) find first occurrence of 't' starting at index 13
        //7) add letter to index 14 to follows
        //8) find first occurrence of 't' starting at index 14
        //if not finding the 't' at the end, then stop

//general algorithm:
        //A. follows in an empty ArrayList, pos is zero
        //B. While there is more searching to do
            //1. index = first occurence of KEY starting at pos
            //2. if found, add value at [index+1] to follows
            //3. pos = index +1;

//Software Design Concept: Open-Closed
    //Open for extension, closed to modification
    //Capture the common method signatures in the interface
    //Name interfaces starting with "I" is common;
    //Then have the Markovs implement the interface!
    //Using an interface provides utility and flexibility
        public interface IMarkovModel {
            public void setTraining(String text);
            public String getRandomText(int numChars);
        }

        public class MarkovOne implements IMarkovModel {
            ...
        }
