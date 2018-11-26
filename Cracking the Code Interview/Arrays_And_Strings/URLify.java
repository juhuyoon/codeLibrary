//1.3
//Write a method to replace all the spaces in a string with '%20'
//You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. 

//Soln:
//First scan : Count the number of spaces
//If you triple, we can compute how many extra charactrers we will have in the final string.
//Second pass: Done in reverse order to edit the string. 
//Replace the space with %20. 


void replaceSpaces(char[] str, int trueLength) {
    int spacecount = 0;, index, i = 0; 
    for(i = 0; i < trueLength; i++) {
        if(str[i] == ' ') {
            spaceCount++;
        }
    }
    index = trueLength + spaceCount * 2;
    if(trueLength < str.length) str[trueLength] = '/0' //this would be the end of the array;
    for(i = trueLength - 1; i >= 0; i--) {
        if(str[i] == ' ') {
            str[index - 1] = '0';
            str[index - 2] = '2';
            str[index - 3] = '%';
            index = index -3;
        } else {
            str[index - 1] = str[i];
            index--;
        }
    }
}

//NOte that this was done with character arrays as Java strings are immutable. 
