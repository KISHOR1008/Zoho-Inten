package studentdeatils;
import java.util.*;
import java.io.*;

@SuppressWarnings("serial")
class student implements Serializable
{
	int id;
	String name;
	int Tamil_mark;
	int English_mark;
	int Maths_mark;
	float avg;
	student(int id,String name,int Tamil_mark,int English_mark,int Maths_mark,float avg)
	{
		this.id=id;
		this.name = name;
		this.Tamil_mark=Tamil_mark;
		this.English_mark=English_mark;
		this.Maths_mark=Maths_mark;
		this.avg= avg;
		
	}
	public String toString()
	{
		return id+" "+name+" "+Tamil_mark+" "+English_mark+" "+Maths_mark+"  "+avg;
	}
}
public class Studentdeatils {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception
	{
	 List<student> lists=new ArrayList<student>();//arraylist of student class type
	 Scanner in = new Scanner(System.in);
	 File file= new File("D:\\student.txt");//creating file
	 ObjectOutputStream oos= null;//new ObjectOutputStream(new FileOutputStream(file));
	 ObjectInputStream ois=null;
	 ListIterator<student> li=null;
	 if(file.isFile())
	 {
		 ois=new ObjectInputStream(new FileInputStream(file));
		 lists=(List<student>)ois.readObject();//updating file elements to the list
		 ois.close(); 
	 }
	 int choice;
	 do
	 {
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
			 int n;
			 System.out.print("Enter the number of Studnet  ");
			 n=in.nextInt();
			 for(int i=0;i<n;i++)
			 	{
				
				 System.out.print("Enter the number of "+(i+1)+" Studnet ID  ");
				 int ID=in.nextInt();
				 System.out.print("Enter the number of "+(i+1)+" Studnet NAME  ");
				 String Name=in.next();
				 System.out.print("Enter the number of "+(i+1)+" Studnet Tamil Mark  ");
				 int T_MARK=in.nextInt();
				 System.out.print("Enter the number of "+(i+1)+" Studnet Enlgish Mark  ");
				 int E_MARK=in.nextInt();
				 System.out.print("Enter the number of "+(i+1)+" Studnet Maths Mark  ");
				 int M_MARK=in.nextInt();
				 float AVG=(T_MARK+E_MARK+M_MARK)/3;
				 lists.add(new student(ID,Name,T_MARK,E_MARK,M_MARK,AVG));
				 }
			 oos=new ObjectOutputStream(new FileOutputStream(file));//updating the file
			 oos.writeObject(lists);
			 oos.close();
			 break;
		 case 2:
			 System.out.println("----------------------------------");
			 li=lists.listIterator();
			 while(li.hasNext())
				 System.out.println(li.next()); 
			 System.out.println("----------------------------------");	 
			 break;
		 
		 case 3:
			 if(file.isFile())
			 {
			 System.out.println("Enter the Student id to Searched ");
			 int check=in.nextInt();
			 System.out.println("----------------------------------");
			 boolean found=false;
			 
			
			 li=lists.listIterator();
			 while(li.hasNext())
			 {
				 student s=(student)li.next();
				 if(s.id==check)
				 {
					 System.out.println(s);
				 found=true;
				 }
			 }
			 if(!found)
				 System.out.println("Not found ");
			 }
			 else
				 System.out.println("File not found ");
			 System.out.println("----------------------------------");
			 break;
		 case 4:
			 if(file.isFile())
			 {
			 System.out.println("Enter the Student id to be deleted ");
			 int check=in.nextInt();
			 System.out.println("----------------------------------");
			 boolean found=false;
			 
			
			 li=lists.listIterator();
			 while(li.hasNext())
			 {
				 student s=(student)li.next();
				 if(s.id==check)
				 {
					li.remove();
				 found=true;
				 }
			 }
			 if(!found)
				 System.out.println("Not found ");
			 }
			 else
				 System.out.println("File not found ");
			 System.out.println("----------------------------------");
			break;	 
		 case 5:
			 if(file.isFile())
			 {
			 System.out.println("Enter the Student id to be updated ");
			 int check=in.nextInt();
			 System.out.println("----------------------------------");
			 boolean found=false;
			 
			
			 li=lists.listIterator();
			 while(li.hasNext())
			 {
				 student s=(student)li.next();
				 if(s.id==check)
				 {
					System.out.println("Enter the id to be updated ");
					int id=in.nextInt();
					System.out.println("Enter the name to be updated ");
					String name=in.next();
					System.out.println("Enter the Tamil mark to beupdated ");
					int Tamil_mark=in.nextInt();
					System.out.println("Enter the Tamil mark to beupdated ");
					int English_mark=in.nextInt();
					System.out.println("Enter the Tamil mark to beupdated ");
					int Maths_mark=in.nextInt();
					float avg=(Tamil_mark+English_mark+Maths_mark)/3;
					li.set(new student(id,name,Tamil_mark,English_mark,Maths_mark,avg));
					
				 found=true;
				 }
			 }
			 if(!found)
				 System.out.println("Not found ");
			 }
			 else
				 System.out.println("File not found ");
			 System.out.println("----------------------------------");
			break;	 
		 }
	 }while(choice!=0);
	 oos=new ObjectOutputStream(new FileOutputStream(file));//updating the file
	 oos.writeObject(lists);
	 oos.close();
	 in.close();
	}}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
