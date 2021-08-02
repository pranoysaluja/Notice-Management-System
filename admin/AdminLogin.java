package admin;

import java.util.Scanner;
import src.com.ncu.validators.*;
import src.com.ncu.processors.NewScreen;
public class AdminLogin
{
	public void login()
	{	
		final Scanner s = new Scanner(System.in);
		int i = 0;
		while (i != 2) {
			System.out.println("Input 1 to login: ");
			System.out.println("                  ");
			System.out.println("Input 2 to exit: ");
			int n = s.nextInt();

			if (n == 1) {
				int r = 0;

				while (r == 0) {
					int u = 0, p = 0;
					String admin_user, admin_pass;
					final NewScreen ns = new NewScreen();
					ns.clear();

					System.out.println("Input username:");
					admin_user = s.next();
					if (admin_user.equals("admin")) {
						u = 1;
					}

					admin_user = s.nextLine();

					System.out.println("Input password:");
					admin_pass = s.next();

					if (admin_pass.equals("admin")) {
						p = 1;
					}
					
					if (p == 1 && u == 1) {
						System.out.println("Login successful");
						Pass_Nm obj=new Pass_Nm();
						obj.check();
				
						final AdminOperations obj2 = new AdminOperations();
						obj2.operations();						
						r=1;
						n=2;
					}
					else
						System.out.println("Try Again");

				}
			}
			if(n==2)
			{
				i=2;
			}
		}
	}
}