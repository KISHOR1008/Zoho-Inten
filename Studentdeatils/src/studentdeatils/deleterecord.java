package studentdeatils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner; 
public class deleterecord {
	public static void removeRecord(String filepath,String removeterm,String name,String grade,String result,int postionterm,String delimeter)
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
					pw.print(result);
					
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
	public static void main(String[] args) {
		//removeRecord("D:\\csv file\\csvstud.csv","kishor",1,",");
		Scanner in = new Scanner(System.in);
		System.out.println("enter the  name that should be updated");
		String removeterm=in.next();
		System.out.println("enter the new name that should be updated");
		String name=in.next();
		System.out.println("enter the new grade that should be updated");
		String grade=in.next();
		System.out.println("enter the new result that should be updated");
		String result=in.next();
		removeRecord("D:\\csv file\\csvstud.csv",removeterm,name,grade,result,1,",");
	}
/*public static void removeRecord(String filepath,String removeterm,int postionterm,String delimeter)
{
	int postion=postionterm-1;
	String tempfile="D:\\deletecheck\\temp.txt";
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
*/
}
