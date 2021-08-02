package admin;
import java.time.LocalDateTime;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*; 
public class Update 
{
 
    public void updateFile() 
    {
        LocalDateTime curr=LocalDateTime.now();
        Scanner sc=new Scanner(System.in);
        try 
        {
            Path path = Paths.get("notices.txt");
            Stream <String> lines = Files.lines(path);
            System.out.println("enter the line to be replaced");
            String old=sc.nextLine();
            System.out.println("enter the line to write");
            String updated=sc.nextLine();
            List <String> replaced = lines.map(line -> line.replaceAll(old, updated)).collect(Collectors.toList());
            Files.write(path, replaced);
            lines.close();
            System.out.println("Find and Replace done on :"+curr);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}