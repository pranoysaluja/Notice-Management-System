package admin;
import java.time.LocalDateTime;
import java.io.*;
import java.util.*;
class Append 
{
 public void add()
  {
	LocalDateTime curr=LocalDateTime.now();
  	Scanner sc=new Scanner(System.in);
  try
  {
	  FileWriter fstream = new FileWriter(new File("notices.txt"),true);
	  BufferedWriter out = new BufferedWriter(fstream);
	  System.out.println(" Enter the notice you want to add : ");
	  String s=sc.nextLine();
	  out.write(s+"\n");
	  out.close();
	  System.out.println(" Notice added on: "+curr);
  }

  catch (Exception e)
  {
	 System.err.println("Error while writing to file: " +e.getMessage());
  }
 
 }
}