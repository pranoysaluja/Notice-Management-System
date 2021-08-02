package admin;

import src.com.ncu.processors.*;
import java.io.*;
import java.util.*;
class AdminOperations
{
	
	NoticeSystem notice =new NoticeSystem();
	 public void operations()
	{
		Scanner sc=new Scanner(System.in);
		NewScreen ns=new NewScreen();
    	ns.clear();
		
		System.out.println("1. Add Notice      ");
		System.out.println("                   ");
		System.out.println("2. Delete Notice   ");
		System.out.println("                   ");
		System.out.println("3. Update Notice   ");
		System.out.println("                   ");
		System.out.println("4. View Notice     ");
		System.out.println("                   ");
		System.out.println("5. View the Users  ");
		System.out.println("                   ");
		System.out.println("6. Exit            ");
		System.out.println("                   ");
		System.out.println(" Enter your choice ");
		
		int choice = sc.nextInt();

		switch(choice)
		{
			case 1:
			{
				ns.clear();
				
				Append ap=new Append();
				ap.add();
				
				System.out.println("\npress any key to go to menu");
				char ch1=sc.next().charAt(0);
				operations();
				break;
			} 

			case 2:
			{
				ns.clear();
				
				Delete obj3 = new Delete();
				obj3.delete_notice();
				
				System.out.println("\npress any key to go to menu");
				char ch3=sc.next().charAt(0);
				operations();
				break;
			}

			case 3:
			{
				ns.clear();

				Update up = new Update();
				up.updateFile();
				
				System.out.println("\npress any key to go to menu");
				char ch4=sc.next().charAt(0);
				operations();
				break;
			}

			case 4:
			{    
				ns.clear();
                 System.out.println(" n o t i c e | t a k a  e f t i r | z i n d i k i r a n i | r e m a r q u e r ");
	             System.out.println("                                                                              ");
	             System.out.println("                                                                              ");
	             System.out.println("                              N O T I C E                                     ");
	             System.out.println("                                                                              ");
	             System.out.println("                                                                              ");
	             System.out.println(" n o t i c e | t a k a  e f t i r | z i n d i k i r a n i | r e m a r q u e r ");
                 System.out.println("                                                                              ");
				 
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
				  
				  System.out.println("\npress any key to go to menu");
				  char ch2=sc.next().charAt(0);
				 
				  operations();
				  break;
			}

			case 5:
			{
				try
				{
    				ns.clear();
    				System.out.println(" Recent logins are : ");
					
					FileReader fr=new FileReader("usernames.txt");   
         			int i;    
          			while((i=fr.read())!=-1)    
          			System.out.print((char)i);    
          			fr.close();
				}
				
				catch(Exception e)
				{
					System.out.println(e);
				}
				
				System.out.println("\npress any key to go to menu");
				char ch5=sc.next().charAt(0);
				operations();
				break;
			}
			
			case 6:
			
				{
			    ns.clear();
				notice.start();
				break;
				}
			
			default:
			{
				System.out.println(" Invalid Choice ");
				break;
			}

		}
		
		
	}
}

