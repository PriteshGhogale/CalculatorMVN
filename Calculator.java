import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Simple Calculator");
      System.out.println("Select Operation: 1.Add 2.Subtract");
      int a,b,n;
	    n= sc.nextInt();
	    System.out.println("Enter First Number:");
      a=sc.nextInt();
      System.out.println("Enter Second Number:");
      b=sc.nextInt();
      if(n==1)
      {
        System.out.println("Result of Addition: " + (a+b) );
      }
      else
      {
        System.out.println("Result of Substraction : " + (a-b) );
      }
	 }
}
