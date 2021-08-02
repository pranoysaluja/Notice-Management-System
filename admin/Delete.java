package admin;
import java.time.LocalDateTime;
import java.io.*;
import java.util.Scanner;
public class Delete
{
   void delete_notice()
   {
      LocalDateTime curr=LocalDateTime.now();
	  Scanner sc =new Scanner(System.in);
      System.out.println("Enter the notice  you want to remove ");
      String l=sc.nextLine();
	
      try
      {
	
         File inputFile = new File("D:\\final evaluation\\Desktop\\final evaluation\\notices.txt");
         File tempFile = new File("D:\\final evaluation\\Desktop\\final evaluation\\temp.txt");

         BufferedReader reader = new BufferedReader(new FileReader(inputFile));
         BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

         String lineToRemove =l ;
         String currentLine;

         while((currentLine = reader.readLine()) != null) 
         {

            String trimmedLine = currentLine.trim(); // trim newline when comparing with lineToRemove
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
         }
         
         writer.close(); 
         reader.close(); 
        File file = new File("D:\\final evaluation\\Desktop\\final evaluation\\notices.txt");
        if(file.delete())
        {
           System.out.println(" File deleted on ! "+curr);
        }
        else 
        {
           System.out.println("Failed to delete the file ");
        }
        File oldname = new File("D:\\final evaluation\\Desktop\\final evaluation\\temp.txt");
        File newName = new File("D:\\final evaluation\\Desktop\\final evaluation\\notices.txt");

        if(oldname.renameTo(newName))
        {
           System.out.println(" Renamed successfully ");
        }
        else
        {
           System.out.println(" Error ");
        }
        BufferedReader br = new BufferedReader(new FileReader("D:\\final evaluation\\Desktop\\final evaluation\\notices.txt "));
        {
           String line;
          while ((line = br.readLine()) !=null)
           {
              System.out.println(line);
           }
           br.close();
        }
        
      }
   

         catch(IOException e)
         {
           e.printStackTrace();
         }
      }
}