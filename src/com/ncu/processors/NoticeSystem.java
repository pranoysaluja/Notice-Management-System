package src.com.ncu.processors;


import admin.*;
import src.com.ncu.processors.NewScreen;
import student.*;
import java.util.*;

public class NoticeSystem
{
	NewScreen ns = new NewScreen();
	LoginStudent student = new LoginStudent();
	AdminLogin admin = new AdminLogin();
	public void start()
	{
	   Scanner sc= new Scanner ( System.in);
	  
//	   System.out.print  (" n o t i c e | t a k a  e f t i r | z i n d i k i r a n i | r e m a r q u e r ");
	   System.out.println("                                                                              ");
	   System.out.println("                                                                              ");
	   System.out.println("                     N O T I C E     M A N A G E M E N T                      ");
	   System.out.println("                                                                              ");
	   System.out.println("                               S Y S T E M                                    ");
	   System.out.println("                                                                              ");
	   System.out.println("                                                                              ");
//	   System.out.println(" n o t i c e | t a k a  e f t i r | z i n d i k i r a n i | r e m a r q u e r ");
       System.out.println("                                                                              ");
	   System.out.println(" 1. Login as Student ");
	   System.out.println("                                                                              ");
	   System.out.println(" 2. Login as Admin   ");
	   System.out.println("                                                                              ");
	   System.out.println(" Enter your choice : ");
	   int choice =sc.nextInt();

	   switch(choice)
	   {
	   	case 1:
			{
    		
    			ns.clear();
				
				student.login();
				break;
			}
		
		case 2:
			{    			
    			
    			ns.clear();
				
				admin.login();
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