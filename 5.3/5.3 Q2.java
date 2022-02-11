/* The following method definitions lack both punctuation and indentation. Rewrite each definition correcting these defects and state, in a few words, the purpose of each method.
public static char first(char a char b){if(a<b)
return a else return b}
public static double second(double a double b)
{double answer if(a<b)answer=a-b else answer=b-a
return answer}

a) 
public static char first (char a, char b) {
    if (a < b) {
        return a;
    } else {
        return b;
    }
}

What this method does is that it obtains the input of the 2 characters and then outputs the greatest character.


b)
public static double second (double a, double b) {
    double answer; 
    if (a < b) {
        answer = a-b; 
    } else { 
        answer = b-a;
    }
    return answer;
}

This method is a simple subtraction, it takes the number of both inputs and subtracts the larger number from the smaller number.
*/