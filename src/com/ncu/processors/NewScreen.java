package src.com.ncu.processors;

import java.io.*;
public class NewScreen
{
	public static void clear()
    {
    	try
   	    {
   	    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   	    }	
   	    catch(Exception e)
   	    {
   	    	System.out.print(e);
   	    }
    }
}