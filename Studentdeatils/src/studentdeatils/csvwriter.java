package studentdeatils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
class student implements Serializable
{
	String name;
	String grade;
	String result;
	
	student(String id,String name,String grade)
	{
		this.name=id;
		this.grade = name;
		this.result=grade;
		
		
	}
	public String toString()
	{
		return name+" "+grade+" "+" "+result;
	}
}





public class csvwriter {

	static int count=0;
	
	
	
	
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int i=0;
		File oldfile=new File("D:\\csv file\\csvstud.csv");
		if(oldfile.exists())
			;
		else
			oldfile.createNewFile();
		String currentline;		
			FileReader fr=new FileReader ("D:\\csv file\\csvstud.csv");
			BufferedReader br=new BufferedReader(fr);
			while((currentline = br.readLine())!=null)
			{
				
					i++;
			}
			fr.close();
			br.close();
			String []data1=new String[100];
			//int count=0;
			FileReader ff=new FileReader ("D:\\csv file\\csvstud.csv");
			BufferedReader bb=new BufferedReader(ff);
			currentline=null;
			while((currentline = bb.readLine())!=null)
			{
				data1[count] =currentline;
				count++;
			}			
			ff.close();
			bb.close();
	
			
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
					 System.out.println("------------------------------------------------------------------");
						System.out.println();
					 System.out.println("Enter the number students that should be updated ");
					 int a=in.nextInt();
					 int j=count;
					 count =count+a;
					 for(i=0;i<a;i++) 
					 {
						 
						
						 System.out.print("Enter the number of "+(i+1)+" Studnet name  ");
						 String name=in.next();
						 System.out.print("Enter the number of "+(i+1)+" Studnet grade  ");
						 String grade=in.next();
						 System.out.print("Enter the number of "+(i+1)+" Studnet result pass/fail  ");
						 String result=in.next();
						 data1[j]=name+","+grade+","+result;
						 j++;
					 }
					 break;
				case 2:
					System.out.println("------------------------------------------------------------------");
					System.out.println();
					for(i=0;i<count;i++)
					{
						System.out.println(data1[i]);
					}
					System.out.println();
					System.out.println("------------------------------------------------------------------");
					
					break;
				case 3:
					System.out.println("------------------------------------------------------------------");
				System.out.println();
					String line="";
					i=0;
					System.out.println("Enter the name that searched ");
					String check=in.next();
						while((line = data1[i]) != null)
						{
							i++;
							String[] row =line.split(",");
							if(check.equals(row[0]))
							for(String index : row)
							{
								System.out.printf("%-10s",index);
							}
							
							
						}
						System.out.println();
						System.out.println();
						System.out.println("------------------------------------------------------------------");
						
					break;
				case 4:
					System.out.println("------------------------------------------------------------------");
					System.out.println();
					line="";
					
					int k=0;
					i=0;
					String temp[]=new String[count];
					System.out.println("Enter the name that deleted");
					check=in.next();
						while((line = data1[k++]) != null)
						{
							
							String[] row =line.split(",");
							if(!(check.equals(row[0])))
							{
								temp[i]=line;
								i++;
							}
						
							
							
						}
						data1=temp;
						count--;
						System.out.println("The values after deleting");
						for(i=0;i<count;i++)
						{
							System.out.println(data1[i]);
						}
						System.out.println();
						System.out.println();
						System.out.println("------------------------------------------------------------------");
						
					
					 break;
				case 5:
					System.out.println("------------------------------------------------------------------");
					System.out.println();
					System.out.println("enter the  name that should be updated");
					check=in.next();
					System.out.println("enter the new name that should be updated");
					String name=in.next();
					System.out.println("enter the new grade that should be updated");
					String grade=in.next();
					System.out.println("enter the new result that should be updated");
					String result=in.next();
					System.out.println();
					System.out.println("------------------------------------------------------------------");
					
					line="";
					k=0;
					i=0;
					String temp1[]=new String[count];
					
						while((line = data1[k++]) != null)
						{
							
							String[] row =line.split(",");
							if(!(check.equals(row[0])))
							{
								temp1[i]=name+","+grade+","+result;
								i++;
								continue;
							}
							temp1[i]=line;
							i++;
						}
						data1=temp1;
						count--;
						System.out.println("The values after deleting");
						for(i=0;i<count;i++)
						{
							System.out.println(data1[i]);
						}
						System.out.println();
					
					break;
				 }

	}while(choice!=0);

			FileWriter fw=new FileWriter("D:\\csv file\\csvstud.csv");
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			for(i=0;i<count;i++)
			{
				pw.println(data1[i]);
				pw.flush();
			}
			pw.flush();
			pw.close();
			fr.close();
			br.close();
			bw.close();
			fw.close();

	}
}

