import java.util.*;
class AssignmentFive
{
	static boolean palindrome(String str)
	{
	int x=0,y=str.length()-1;
	while(x<y)
	{
	if(str.charAt(x)!=str.charAt(y))
	{
	return false;
	}
	x++;
	y--;
	}
	return true;
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no.of words");
	int len=sc.nextInt();
	System.out.println("Enter the words:");
	String[] s2=new String[len];
	for(int i=0;i<len;i++)
	{
     s2[i]=sc.next();
	}
	for(int i=0;i<len;i++)
	{
	if(palindrome(s2[i]))
	{
	System.out.println(s2[i]+"is palindrome");
	}
	else
	{
	System.out.println(s2[i]+"is not palindrome");
	}
	}
}
}