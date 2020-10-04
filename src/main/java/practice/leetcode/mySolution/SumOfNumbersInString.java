/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class SumOfNumbersinString
{
  public static void main (String[]args)
  {
    String s = "ab34ng5j4u563";	// 34+5+4+563

      System.out.println ("Sum is: " + new Main ().sum (s));
  }

  public int sum (String s)
  {
    char[] arr = s.toCharArray ();
    String strDigits = "0";
    int sum = 0;

    for (int i = 0; i < s.length (); i++)
      {
	if (Character.isDigit (arr[i]))
	  {
	    strDigits = strDigits + arr[i];
	  }
	else
	  {
	    sum = sum + Integer.parseInt (strDigits);
	    strDigits = "0";
	  }
      }
    sum = sum + Integer.parseInt (strDigits);
    return sum;
  }
}
