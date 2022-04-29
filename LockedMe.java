package com.company.locker;

import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class LockedMe 
{
    static final String projectPath="D:\\phase 1 final project\\companylockerspvtltd\\LockedMeFiles";
	
	public static void main(String[] args)
	{
		Scanner obj= new Scanner(System.in);
		int ch;
		
		do
		{
		
		displayMenu();
		System.out.println("Enter your choice");
		ch= Integer.parseInt(obj.nextLine());

		switch(ch)
		{
		case 1: getAllFiles();
		     break;
		case 2: createFiles();
		     break;
		case 3: deleteFiles();  
		     break;
		case 4: searchFiles();  
		     break;
		case 5: System.exit(0);     
		     break;
		default : System.out.println("invalid option");  
		     break;
		
		}
		}
		while(ch>0);
		
	}

    public static void deleteFiles() {
		// TODO Auto-generated method stub
		
	}

	public static void searchFiles() {
		// TODO Auto-generated method stub
		
	}

	public static void displayMenu ()
{
    	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	System.out.println("welcome to company Lockers- Locked.Me.com");
    	System.out.println("Developer Name- Rupesh Kumar");
    	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	System.out.println("\t 1. Display all the files");
    	System.out.println("\t 2. Add file to existing directories");
    	System.out.println("\t 3. Delete a file");
    	System.out.println("\t 4. Search a file");
    	System.out.println("\t 5. exit");
    	System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    	
   }
    
    public static void getAllFiles()
    {
    	
     File[] listOfFiles = new File (projectPath).listFiles();
     
    	// if the folder is empty 
     if(listOfFiles.length==0)
    	 System.out.println("no files exist in the directory");
    	 
     else
     {
    	 for(File l:listOfFiles)
    	 {
    		 System.out.println(l.getName());
    	 }
     }
    	 
    }
    
    public static void createFiles()
    { 
      try
      {
    	  Scanner obj = new Scanner(System.in);
    	  String fileName;
    	  int linesCount;
    	  System.out.println("enter file name:");
    	  fileName = obj.nextLine();
    	  
    	  System.out.println("Enter how many lines you want to add in file:");
    	  linesCount = Integer.parseInt(obj.nextLine());
    	  
    	  FileWriter fw = new FileWriter(projectPath+"\\"+fileName);
    	  
    	  
    	  for(int i=1; i<=linesCount; i++)
    	  {
    	    System.out.println("enter file content line:");
    	    fw.write(obj.nextLine()+"\n");
    		  
    	  }
    	   System.out.println("file created sucessfully");
    	   fw.close();
    	  
      }
    	  
    	
      catch(Exception x)
      {
    	  
    	  System.out.println("some error occured.");
      }
      
      
    }
    
    public static void deleteFile()
    {
    	Scanner obj= new Scanner(System.in);
    	
    	try
    	{
    		String fileName;
    		System.out.println("enter file name to be deleted:");
    		fileName= obj.nextLine();
    		
    		File fl= new File(projectPath+"\\"+fileName);
    		
    		if(fl.exists())
    			
    		{
    			fl.delete();
    			System.out.println("file deleted sucessfully");
    			
    		}
    		else
    		{
    			System.out.println("file do not exist");
    		}
    	}
    	
    	catch(Exception Ex)
    	{
    		System.out.println("some error occured");
    	}
    }
    
    public static void searchFile()
    {
    	Scanner obj = new Scanner(System.in);
    	
    	try
    	{
    		String fileName;
    		System.out.println("enter file name to be searched:");
    		fileName= obj.nextLine();
    		
    		File fl= new File(projectPath+"\\"+fileName);
    		
    		if(fl.exists())
    			
    		{
    			
    			System.out.println("file is availiable");
    			
    		}
    		else
    		{
    			System.out.println("file is not availiable");
    		}

    	}
    	catch(Exception Ex)
    	{
    	
    	
    }
    
    } 
}


