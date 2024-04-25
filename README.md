Java Program - Identifying "Weird" Numbers
This is a Java program that determines if a user-entered number is classified as "weird" based on specific criteria.

How it Works
Input: The program prompts the user to enter a number using Scanner.
Logic:
The program checks if the number is odd (remainder 1 after division by 2). If odd, it's considered "weird".
Even numbers are further classified:
Even numbers between 2 (inclusive) and 5 (inclusive) are considered "not weird".
Even numbers between 6 (inclusive) and 20 (inclusive) are considered "weird".
Even numbers greater than 20 are considered "not weird".
Output: The program prints "weird" or "not weird" based on the classification.
Note: This definition of "weird" is specific to this program and  doesn't follow a standard mathematical concept.

Running the Program
Save the code as a .java file (e.g., WeirdNumbers.java).
Compile the code using a Java compiler (e.g., javac WeirdNumbers.java).
Run the program using Java runtime environment (e.g., java WeirdNumbers).
Example
If you enter 10, the program will print:

weird
This is because 10 is an even number within the range (6 to 20) considered "weird" in this program.
