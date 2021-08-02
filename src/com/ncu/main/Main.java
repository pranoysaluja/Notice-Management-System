package src.com.ncu.main;
import src.com.ncu.processors.*;
import java.util.*;
import java.io.*;
class Main
{
	public static void main(String[] args)throws Exception 
	{
		NoticeSystem obj1 = new NoticeSystem();
		NewScreen ns = new NewScreen();
        ns.clear();
		obj1.start();
	}
}