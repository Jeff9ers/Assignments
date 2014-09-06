//  Prints a table of points students earned in lab work.
//*******************************************************************

public class StudentGrades
{
    //--------------------------------------------------------
    // Print the table with a border and aligned columns;
    // use the + operator to do arithmetic and concatenation.
    //--------------------------------------------------------
    public static void main (String[] args)
    {
  //Print Boarder
   System.out.println (" ///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
     System.out.println (" ==\tStudent Points\t       ==");
       System.out.println (" \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
      
  //Print Table
       System.out.println ();
          System.out.println ("Name\tLab\tBonus\tTotal");
       System.out.println ("----\t---\t-----\t-----");
       System.out.println ("Juan\t54\t6\t60" + "\nCarlos\t67\t5\t72" + "\nRacheal\t59\t7\t66" + "\nHelen\t76\t2\t78" + "\nMaria\t67\t5\t72");
       
  
    }
}
