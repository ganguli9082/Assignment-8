import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class StringTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		int ctr = 0;
		//readfile r = new readfile();
		
		//r.openFile();
		//r.readFile();
		//String [] array;
		//array = r.readArray();
		try
		{
			Scanner s1 = new Scanner (new File("C:\\Users\\aganguli\\Documents\\FruitsAndVegetables.txt"));
			Scanner s2 = new Scanner(new File("C:\\Users\\aganguli\\Documents\\FruitsAndVegetables.txt"));
			while (s1.hasNextLine())
		 	{
			 ctr = ctr+1;
			 s1.nextLine();
		 	}
			s1.close();
		 System.out.println("ctr is" + ctr);
		String[] fruitsvegs = new String[ctr];
		 
		
		 
		 
			 
			 while(s2.hasNext())
			 {
				for (int i = 0; i<ctr; i=i+1)
				{
				 fruitsvegs[i] = s2.nextLine();
				 //System.out.printf("%s \n" ,fruitsvegs[i]);
				 //i = i+1;
		 	     }
			 
			 }
		 
		 
		 s2.close();
		 for (int i=0; i<fruitsvegs.length; i = i +1)
			{
				tree.add(fruitsvegs[i]);
			}
			tree.InOrderTraversal(tree.root);
		 
		 
		}
		
		catch (FileNotFoundException e) 
		{
			System.out.println("file not herre");
		}
		
		
		
		// tree.traverse();
		 
		 	System.out.println("end");
	
		


	}
	
}

