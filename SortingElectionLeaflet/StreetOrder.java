import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
  * This program gets a text file containing the name of some people 
  * living in an area. Each line preceding with a number representing    
  * the street number. The program should read the data line by line, 
  * and store the data in an array.
  * In the end, It prints the odd number of street with the name of the 
  * residents in that street in the ascending order, and repeat the
  * same thing for residents in the even number of street in descending order
  * 
  * The program gets two command line arguments. The first one is the file 
  * should read from and the second one is the file it need to write in.
  */

public class StreetOrder
{
  public static void main(String[] args) 
  {
    BufferedReader input = null;
    PrintWriter output = null;
    try
    {
      if(args.length < 2)
        throw new IllegalArgumentException(
                                    "You must supply exactly 2 arguments");
      input = new BufferedReader(new FileReader(args[0]));
      output = new PrintWriter(new FileWriter(args[1]), true);

      List<String> arrayContainingLinesOfFile = new ArrayList<>();
      String currentLine;
      while((currentLine = input.readLine()) != null)
        arrayContainingLinesOfFile.add(currentLine);
      
      // printing the odd addresses
      for(int i=0; i<arrayContainingLinesOfFile.size(); i+=2)
        output.println(arrayContainingLinesOfFile.get(i));

      // printing the even addresses
      for(int i=arrayContainingLinesOfFile.size()-1; i>0; i-=2)
        output.println(arrayContainingLinesOfFile.get(i));
    }//try
    catch(IllegalArgumentException e)
    {
      System.err.println("The error message is: " + e.getMessage());
      System.out.println(e);
    }//IllegalArgumentException  
    catch(FileNotFoundException e)
    {
      System.err.println("at least one of the files is not found");
      System.out.println(e);
    }//catch
    catch(IOException e)
    {
      System.err.println("Something unforseen has happened");
      System.out.println(e);
    }
    finally
    {
      try{if(input != null) input.close();}
      catch(IOException e){System.err.println("file cannot be closed " 
                                     + e.getMessage());}
      if(output != null)
      {
        output.close();
        if(output.checkError())
          System.err.println("Something wrong has happend with the output");
      }//if
    }
  }//main
}
 
