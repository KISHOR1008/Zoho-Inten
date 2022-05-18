package studentdeatils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
class student2
{
	
	String name;
	String grade;
	String result;
	
	student2(String name,String grade,String result)
	{
		this.name=name;
		this.grade=grade;
		this.result=result;
		
	}
	public String toString()
	{
		return name+" "+grade+" "+result;
	}
}


public class listhelper {
	
	static void insert() throws IOException
	{	 Scanner in = new Scanner(System.in);
		File oldfile=new File("D:\\csv file\\csvstud.csv");
		if(oldfile.exists())
			;
		else
			oldfile.createNewFile();
		 System.out.println("Enter the number students that should be updated ");
		 FileWriter csvWriter = new FileWriter(oldfile,true);
		 int a=in.nextInt();
		 for(int i=0;i<a;i++) 
		 {

			
			 System.out.print("Enter the number of "+(i+1)+" Studnet name  ");
			 String name=in.next();
			
			 System.out.print("Enter the number of "+(i+1)+" Studnet grade  ");
			 String grade=in.next();
			 
			 System.out.print("Enter the number of "+(i+1)+" Studnet result pass/fail  ");
			 String result=in.next();
			 student1 s=new student1(name,grade,result);
			 csvWriter.append(s.name);
			 csvWriter.append(",");
			 csvWriter.append(s.grade);
			 csvWriter.append(",");
			 csvWriter.append(s.result);
			 csvWriter.append("\n");
			 csvWriter.flush();
			 //student s=new student(name,grade,result);
				 
			 }

			 csvWriter.flush();
			 csvWriter.close();
			
			 
		 }
	static void view() throws IOException
	{
		File oldfile=new File("D:\\csv file\\csvstud.csv");
		if(oldfile.exists())
			;
		else
			oldfile.createNewFile();
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		BufferedReader reader=null;
		FileReader freader=new FileReader(oldfile);
		String line="";
		try {
			reader=new BufferedReader(freader);
			while((line = reader.readLine()) != null)
			{
				String[] row =line.split(",");//line split method will return string array type
				for(String index : row)
				{
					System.out.printf("%-10s",index);
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
	}
	static void search() throws IOException
	{
		File oldfile=new File("D:\\csv file\\csvstud.csv");
		if(oldfile.exists())
			;
		else
			oldfile.createNewFile();
		Scanner in = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------------------");
		BufferedReader reader1=null;
		String line="";
		try {
			reader1=new BufferedReader(new FileReader(oldfile));
			System.out.println("Enter the name that should be searched ");
			String check = in.next();
			while((line = reader1.readLine()) != null)
			{
				
				String[] row =line.split(",");
				if(check.equals(row[0]))
				for(String index : row)
				{
					System.out.printf("%-10s",index);
				}
				
				
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				reader1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println();
		
	}
	public static void removeRecord(String filepath,String removeterm,int postionterm,String delimeter)
	{
		int postion=postionterm-1;
		int k=0;
		String tempfile="D:\\csv file\\temp.csv";
		File oldfile=new File(filepath);
		File newfile=new File(tempfile);
		String currentline;
		String []data;
		try 
		{
			FileWriter fw=new FileWriter(tempfile,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			FileReader fr=new FileReader (filepath);
			BufferedReader br=new BufferedReader(fr);
			while((currentline = br.readLine())!=null)
			{
				data =currentline.split(",");
				if(!data[postion].equalsIgnoreCase(removeterm))
				{
					pw.println(currentline);
				}
			}
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();
			oldfile.delete();
			File dum=new File(filepath);
			newfile.renameTo(dum);			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void updateRecord(String filepath,String removeterm,String name,String grade,String result,int postionterm,String delimeter)
	{
		int postion=postionterm-1;
		String tempfile="D:\\csv file\\temp.csv";
		File oldfile=new File(filepath);
		File newfile=new File(tempfile);
		String currentline;
		String []data;
		try 
		{
			FileWriter fw=new FileWriter(tempfile,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			FileReader fr=new FileReader (filepath);
			BufferedReader br=new BufferedReader(fr);
			while((currentline = br.readLine())!=null)
			{
				data =currentline.split(",");
				if(!data[postion].equalsIgnoreCase(removeterm))
				{
					pw.println(currentline);
				}
				else
				{   
					pw.print(name);
					pw.print(",");
					pw.print(grade);
					pw.print(",");
					pw.println(result);
					
				}
			}
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();
			oldfile.delete();
			File New=new File(filepath);
			newfile.renameTo(New);			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);
		
		
		 int choice;
		 
		do {
			 System.out.println("Press 1 for Insert ");
			 System.out.println("Press 2 for View ");
			 System.out.println("Press 3 for Search");
			 System.out.println("Press 4 for delete ");
			 System.out.println("Press 5 for Udapte");
			 System.out.println("Press 0 for Exit");
			 choice=in.nextInt();
			 switch(choice)
			 {
			 case 1:
				 insert();
				 break;
			case 2:
				view();
				break;
			case 3:
				search();
				break;
			case 4:
				System.out.println("Enter the name to deleted ");
				String check=in.next();
				removeRecord("D:\\csv file\\csvstud.csv",check,1,",");
				
				 break;
			case 5:
				
				System.out.println("enter the  name that should be updated");
				String removeterm=in.next();
				System.out.println("enter the new name that should be updated");
				String name=in.next();
				System.out.println("enter the new grade that should be updated");
				String grade=in.next();
				System.out.println("enter the new result that should be updated");
				String result=in.next();
				updateRecord("D:\\csv file\\csvstud.csv",removeterm,name,grade,result,1,",");

				break;
			 }

}while(choice!=0);
}
}

