/*
Study this method and then answer the questions that follow it.
*/

class CodeStudy {
    public static int mystery(double a, double b) {
        int value = 0;
        if (a < b)
            value = -1;
        if (a > b)
            value = 1;
        return value;      
    }
}

/* Question & Answers

What is the identifier of the method?
The identifier of the method is 'mystery'

What are its parameters?
The parameters are 'a' and 'b' which are both doubles

What type of value is returned by the method?
The method returns an integer value

What part of the definition forms the heading?
this method returns the integer

Rewrite the method using a nested if structure.
public static int mystery(double a, double b) {
        int value = 0;
        if (a < b) 
        {
            value = -1;
        } else 
        {
            if (a > b) 
            {
                value = 1;
            }
        }
        return value;
    }


Rewrite the method using multiple return statements. 
public static int mystery(double a, double b) {
        if (a < b) {
            return -1;
        } else 
        {
            if (a > b) 
            {
                return 1;
            } else 
            {
                return 0;
            }
        }
    }

*/