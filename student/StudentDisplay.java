package student;
import java.time.LocalDateTime;
import src.com.ncu.processors.*;
import java.io.File;
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class StudentDisplay
{
  LocalDateTime curr=LocalDateTime.now();
  public  void noticeRead() 
  {
    NewScreen ns=new NewScreen();
    ns.clear();
    System.out.println(" n o t i c e | t a k a  e f t i r | z i n d i k i r a n i | r e m a r q u e r ");
    System.out.println("                                                                              ");
    System.out.println("                                                                              ");
    System.out.println("                              N O T I C E                                     ");
    System.out.println("                                                                              ");
    System.out.println("                                                                              ");
    System.out.println(" n o t i c e | t a k a  e f t i r | z i n d i k i r a n i | r e m a r q u e r ");
      System.out.println("                                                                              ");

      System.out.println("Notice viewd on "+curr);
      System.out.println("Today's  notices : ");

    try 
    {
      File myObj = new File("notices.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) 
      {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } 
  
    catch (FileNotFoundException e) 
    {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}