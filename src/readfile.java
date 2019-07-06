import java.io.*;
import java.util.*;

public class readfile {
	private Scanner x;
	public String[] farray;
	public void openFile() 
	{
		try
		{
			x = new Scanner(new File("C:\\Users\\aganguli\\Documents\\FruitsAndVegetables.txt"));
		}
		catch(Exception e)
		{
			System.out.println("could not find file");
		}
	} 
	public void readFile()
	{
		System.out.println("/n Reading file");
		while(x.hasNext())
		{
			String a = x.nextLine();
			//System.out.printf("%s \n", a);
			System.out.println(a);
		}
		System.out.println("\n End Reading file");
	}
	public String [] readArray()
	{
		System.out.println("\n readArray start");
		int ctr = 0;	
		try
		{
		 Scanner s1 = new Scanner (new File("C:\\Users\\aganguli\\Documents\\FruitsAndVegetables.txt"));
		 while (s1.hasNextLine())
		 	{
			 ctr = ctr+1;
			 s1.nextLine();
		 	}
		 System.out.println("ctr is" + ctr);
		String[] fruitsvegs = new String[ctr];
		 
		 Scanner s2 = new Scanner(new File("C:\\Users\\aganguli\\Documents\\FruitsAndVegetables.txt"));
		 for (int i = 0; i<ctr; i=i+1)
		 	{
			 while(s2.hasNext())
			 {
			 fruitsvegs[i] = s2.nextLine();
			 System.out.printf("%s \n" ,fruitsvegs[i]);
		 	 }
		 	}
		 System.out.println("test print" +fruitsvegs);
		 return fruitsvegs;
		
		}
		catch (FileNotFoundException e) 
		{
			
			return null;
		}
	}
//	public String toString()
//	{
//		System.out.println("calling to string");
//		String report ="";
//		for (int j=0; j< fruitsvegs.length; j= j+1)
//		{
//			report += farray[j];
//		}
//		return report;
		
//	}
	public void closeFile()
	{
		System.out.println("\n Closing file");
		x.close();
	}

}
