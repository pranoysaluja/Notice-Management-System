package src.com.ncu.validators;
import java.util.regex.Pattern;

public class Pass_Nm
{

	public static final String PASSWORD_REGEX =
			"((?=.*[a-z]).{1,16})";

	public  static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
	public  static final String NAME_REGEX =

			"((?=.*[a-z]).{1,16})";
	public static final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);

	public void check()
	{
		String password = "admin";
		String name = "admin ";
			// Validate  password
			if (PASSWORD_PATTERN.matcher(password).matches()) {
				System.out.println("The Password " + password + " is valid");
			}
			else {
				System.out.print("The Password " + password + " isn't valid");
				 }
			  //Validate name
			 if (NAME_PATTERN.matcher(name).matches()) {
				System.out.println("The username " + name + " is valid");
			}
			else {
				System.out.println("The username  " + name+ " isn't valid");
				 }

	}
}
  
