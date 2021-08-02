package student;
import student.StudentDisplay;
import src.com.ncu.processors.*;
import java.util.Scanner;
import java.io.*;
public class LoginStudent
{	
	public void login()
	{
	  Scanner s=new Scanner(System.in);
		int i=0;
		NoticeSystem obj2 = new NoticeSystem();
		
		while(i!=2)
		{
			System.out.println(" 1 to login :");
			System.out.println(" 2 to exit : ");
			int n=s.nextInt();
			
			if(n==1)
			{
				int r=0;
				
				while(r==0)
				{	
					int u=0,p=0;
					
					String student_user,student_pass;
					
					NewScreen ns = new NewScreen();
    				ns.clear();
					
					System.out.println("Input username:");
					student_user=s.next();
					

					if(student_user.equals("pranoy")||(student_user.equals("saluja")))
					{	
						u=1;
					}
					

					System.out.println("Input password:");
					student_pass=s.next();
					

					if(student_pass.equals("pranoy")||(student_user.equals("saluja")))
					{	
						p=1;
					}
					

					if(p==1 && u==1)
					{	System.out.println("Login successful...");
						
						try 
						{
	                     FileWriter fstream = new FileWriter(new File("usernames.txt"),true);
	                     BufferedWriter out = new BufferedWriter(fstream);
	                    
	                     out.write("\n"+student_user);
	                     out.close();
                        }
                        
                        catch (Exception e)
                        {
	                       System.err.println("Error while writing to file: " +e.getMessage());
                        }
						System.out.println("\npress any key to view notice");
						char ch1=s.next().charAt(0);
						StudentDisplay wr=new StudentDisplay();
						wr.noticeRead ();
						System.out.println("\npress any key to go to main menu");
						char ch2=s.next().charAt(0);
						NoticeSystem nl=new NoticeSystem();
						ns.clear();
						nl.start();
						
                           
                       
						
					
						
					
						
						r=1;
						n=2;
					}
					

					else
					 {
						System.out.println("Try Again");
					 }

				}
			}
			
			if(n==2)
			{
				i=2;
			}
		
	}
	
	
}}