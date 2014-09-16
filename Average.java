// ***************************************************************** 
// Average.java
//
// Read three integers from the user and print their average
// ***************************************************************** 
import java.util.Scanner; 
public class Average 
{
public static void main(String[] args) 
{
int test1, test2;
double average;
double sum;
Scanner scan = new Scanner(System.in) ;
// get three values from user
   System.out.println("Please enter two test scores and " + "I will compute their average");
   test1 = scan.nextInt();
   test2 = scan.nextInt();
   
  
//compute the average
   sum =  (test1 + test2 );
   System.out.println ("Sum of all test scores " + sum );
   average = (sum / 2);
//print the average
   System.out.println ("Test average equals " + average);
//set quiz values
  int quiz1, quiz2, quiz3;
  double average1;
  double sum1;
  Scanner scan1 = new Scanner(System.in);
  System.out.println("Please enter your three quiz scores and " + " I will compute their average");
  quiz1 = scan1.nextInt();
  quiz2 = scan1.nextInt();
  quiz3 = scan1.nextInt();
// Compute the average
  sum1 = (quiz1 + quiz2 + quiz3 );
  System.out.println ("Sum of all quiz scores" + sum1 );
  average1 = (sum1 / 3);
//print the average1
  System.out.println ("Quiz average equals " + average1);
//Enter HW average
  int hw;
  double average2;
  double sum2;
  Scanner scan2 = new Scanner(System.in) ;
  System.out.println ("Please enter your homework average" + " I will compute your weighted average");
  hw = scan2.nextInt();
  
  

    } 
}