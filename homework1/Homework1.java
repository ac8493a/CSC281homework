/**
 * Homework 1 for CSC-281.001 Spring 2017
 * 
 * Chessffyn:
 * 
 * This assignment consists of 7 problems. Problem 1 asks you to modify existing
 * code for three subproblems.The remaining six problems each require you to 
 * write a method that satisfies the requirements stated in their descriptions.
 * 
 * You are required to create a javadoc style comment for each method you
 * create. See the sample method named add3 for an example to follow. 
 * 
 * Your homework will be graded in the following manner:
 * 70 points for correctness.
 * 		10 points per problem.
 * 		Does your input match the expected output exactly?
 * 30 points for following standards. Evaluation considerations for these points:
 *		Did you use vi to craft your code?
 *		Are camel case and Pascal case used correctly?
 * 		Did you follow the the submission instructions properly?
 */

import java.math.*; // math has been imported for you
public class Homework1{

  /**
   * The entry point for the program.
   * 
   * @param args Commandline input arugments.
   */
  public static void main(String[] args) {
    Homework1 hw1 = new Homework1();// THIS CREATES AN INSTANCE AC

    System.out.println("===Problem 1===");
    hw1.problem1();

    System.out.println("===Problem 2===");
    // Uncomment to print the results of calling your topInt method with the following input:
    System.out.println(hw1.topInt(1.5));
    System.out.println(hw1.topInt(5.1));
    System.out.println(hw1.topInt(1.0));
    System.out.println(hw1.topInt(-4.2));


    System.out.println("===Problem 3===");
    // Uncomment to print the results of calling your draw4x4 method with the following input:
    hw1.draw4x4('-');
    hw1.draw4x4('4');

    System.out.println("===Problem 4===");
    // Uncomment to print the results of calling your citationName method with the following input:
     System.out.println(hw1.citationName("Alastair", "Reynolds"));
     System.out.println(hw1.citationName("Grace", "Hopper"));

    System.out.println("===Problem 5===");
    // Uncomment to print the results of calling your min3 method with the following input:
    System.out.println(String.valueOf(hw1.min3(1.0, 2.0, 3.0)));
    System.out.println(String.valueOf(hw1.min3(4.0, 3.0, 2.0)));
    System.out.println(String.valueOf(hw1.min3(0.5, 0.1, 0.5)));
    
    System.out.println("===Problem 6===");
    // Uncomment to print the results of calling your fibonacci method with the following input:
    System.out.println(hw1.fibonacci(0));
    System.out.println(hw1.fibonacci(1));
    System.out.println(hw1.fibonacci(2));
    System.out.println(hw1.fibonacci(3));
    System.out.println(hw1.fibonacci(10));
    System.out.println(hw1.fibonacci(25));
    
    
    System.out.println("===Problem 7===");
    // Uncomment to print the results of calling your isPalindrome method with the following input:
    System.out.println(hw1.isPalinedrome("racecar"));
    System.out.println(hw1.isPalinedrome("cat"));
    System.out.println(hw1.isPalinedrome("hannah"));
    System.out.println(hw1.isPalinedrome("saippuakivikauppias"));
  }

  /**
   * (This is an example of a javadoc comment. All of your methods should have a similar comment.) 
   * This method adds three numbers together and returns
   * their sum.
   * 
   * @param x The first number to sum.
   * @param y The second number to sum.
   * @param z The third number to sum.
   * @return The sum of x, y, and z.
   */
  public double add3(double x, double y, double z) {
    return x + y + z;
  }






// ================================================================================================================================

  /**
   * PROBLEM 1
   * Change the expressions in the variable assignments so the program prints "successfully
   * completed!". This may involve changing the arithmetic operators or the type of number that is
   * produced.
   */
  public void problem1() {
    double result1 = 5.0 / 4.0; //ADD A DECIMAL TO TELL JAVA ITS A DOUBLE
    if (result1 == 1.25) {
      System.out.println("Problem 1a: successfully completed!");
    } else {
      System.out.println("Problem 1a: not quite right.");
    }

    double result2 = Math.pow(4,2);/**This method TURN INTO EXPONENT USING .POW MATH METHOD AND TURN INT TO DOUBLE
*4 is the base number and 2 is the power
*/
    if (result2 == 16) {
      System.out.println("Problem 1b: successfully completed!");
    } else {
      System.out.println("Problem 1b: not quite right.");
    }

    String strA = new String("foo");
    String strB = new String("foo");
    if (strA.equals( strB)) { // USE .EQUALS STRING METHOD TO COMPARE STRINGS I.E. OBJECT.EQUALS(OTHER OBJECT)
      System.out.println("Problem 1c: successfully completed!");
    } else {
      System.out.println("Problem 1c: not quite right.");
    }
  }

//========================================================================================================================

  /*
   * PROBLEM 2
   *
   * When a double or float is cast into an integer via (int), the fractional part of the number
   * after that decimal place is thrown away (e.g. 3.3 becomes 3). An example: int x = (int)3.3;
   * 
   * 1) Write a method called "topInt" that takes a double as a parameter and returns an int that
   * is rounded up from the double instead of being rounded down.
   *
   * For example, 4.5 would become 5 (the lack of a decimal point after 5 is important). Take care
   * that your method does not round up numbers with no fractions (i.e. 5.0 should not be rounded
   * up to 6.0).
   *
   * Hint: use a method in the math package that we covered in class.
   * 
   * Your method will be ran with the following input: 1.5 5.1 1.0 -4.2
   */

 public int topInt(double someArg) { /**This method using Math.ceil() method to cast a double into an integer
*@param the 1.5,5.1,1.0,-4.2 will substitute someArg
*/ 
    return (int) Math.ceil(someArg);
}


//===========================================================================================================================

  /*
   * PROBLEM 3
   * 
   * 1) Declare a method named "draw4x4" that prints a 4 by 4 box of a character. This character
   * should be defined by the first parameter of the method. This parameter should be of the char
   * data type. The output of this method is the printed box. This means there will be no return
   * statement in this method.
   *
   * Here is what the output of draw4x4('x') should look like: 
   * xxxx
   * x  x
   * x  x
   * xxxx
   *
   * Your method will be ran with the following input: '-' '4'
   */
  public void draw4x4(char x){ /**This method prints the border of a box made of characters
*@param = a character value
*/
    System.out.println(""+x+x+x+x+""); //empty space needed to avoid concatenation
    System.out.println(x+"  "+x);
    System.out.println(x+"  "+x);
    System.out.println(""+x+x+x+x+"");
}
//========================================================================================================================

  /*
   * PROBLEM 4
   * 
   * 1) Write a method named "citationName" that takes two String parameters: a first name and a
   * last name. It should return a String that contains the last name concatenated with a comma, a
   * space, the first letter of the first name, and a period.
   *
   * This example: citationName("Jack", "Beatty") should return: "Beatty, J."
   *
   * Your method will be ran with the following input: "Alastair" "Reynolds", "Grace" "Hopper"
   */



  public String citationName (String first, String last) { /** This method uses a char method to print the initials of a persons first name
*and concat. the persons last name (with grammer)
*@param first =first name last=last name
*/
    char a= first.charAt(0);
    return( last +","+ " " + a+".");
}

//======================================================================================================
  /*
   * PROBLEM 5
   * 
   * 1) Write a method named "min3" that takes 3 doubles as parameters and returns the lowest
   * value of the three.
   *
   * Print what your min3 method returns for the following triples of doubles as input: 1.0 2.0
   * 3.0, 4.0 3.0 2.0, 0.5 0.1 0.5
   */


 public  double min3(double num1, double num2, double num3) { /** This method uses conditionals to return lowest number
* @param num 1 =first double. num2= second double. num3= third double
*/

  if (num1 < num2 && num1 < num3){
    return num1;
}

  else if (num2 < num1 && num2 < num3){
     return num2;
}
  else{
     return num3;

}
}

//==========================================================================================================

  /*
   * PROBLEM 6
   * 1) Write a method named fibonacci that calculates
   * Fibonacci numbers: http://en.wikipedia.org/wiki/Fibonacci_number
   *
   * Your fibonacci method should have a single int as its only parameter. It should return
   * the fibonacci number as in int.
   *
   * Assume the seed values of F(0) = 1 and F(1) = 1.
   *
   * This method should use recursion which means the method should call itself. 
   *
   * Your method will be ran on following input: 0,1,2,3,10,25
   */
 

  public int fibonacci(int n)  {/** This method uses recursion to run fibonacci's number
*@param n =the number from which the recursion takes place
*/
    if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
}
  
//===============================================================================================================


  /* PROMBLEM 7
   * A palindrome is where a word or sentence is spelled the same
   * forward as it is backward. For example, "pop" is a palindrome where "cat" is not. The sentence
   * "Was it a car or a cat I saw" is a palindrome when the spaces are extracted and it is converted
   * to all lowercase letters.
   *
   * 1) Write a method named "isPalindrome" that takes a single String parameter. It should return
   * the boolean value of true if the string is a palindrome or false if it is not.
   *
   * Your method is only expected to run correctly on input consisting only of lowercase strings.
   *
   * Your method will be ran on the following input:
   * "racecar"
   * "cat"
   * "hannah"
   * "saippuakivikauppias"
   * 
   * hint: build a string that is the reverse of the input
   */


  
  boolean isPalinedrome( String  word) {/** this methos uses char method to determine if a phrase is a palinedrome
*@param: word = the palinedrome phrase
*/
 
    int first = 0;
    int last = word.length() - 1;

    while (first < last)
    {
        if (word.charAt(first) != word.charAt(last))// If its a palindrome, then the first letter should be the same as the last
        {
            return false;
        }
        first++;
        last--;
    }

    return true;
}

//==================================================================================================================
}
