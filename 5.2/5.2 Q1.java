/*
A student wrote the following method to exchange the values of two int variables.
He then tested the method with the following fragment:
What did the fragment print? Explain.
*/

class Fragments {

    public static void swap(int m, int n) {
        int temp = m;
        m = n;
        n = temp;
    }

    public static void main(String[] args) {
        int i = 7;
        int j = 3;
        swap(i, j);
        System.out.println("i = " + i + " and j = " + j);

    }
}

/* Answer
The output will be i = 7 and j = 3. 
This is because they are the original values, therefore they are unchangeable by the method. 
The reason why it doesn’t change is because the parameters are passed to a method. 
When it is passed to a method a copy is made. 
Therefore the original values will remain the same even though the method has changed.
*/