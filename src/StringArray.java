

import java.util.*;

public class StringArray {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name search");
String s=sc.nextLine();
String array[]={"ravi","teja","sai","prakash","kumar","srikanth"};
int flag = 0,i=0;
for(i=0;i<6;i++)
{
	if(s==array[i])
	{
		flag=1;
		break;
	}
}
if(flag==0)
	System.out.println("The name " +s+" Exits");
	else
		System.out.println("The name " +s+" does not Exits");

}
	}