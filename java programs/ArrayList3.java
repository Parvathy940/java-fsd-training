import java.util.*;
class ArrayList3
{
	public static void main(String[] args)
	{
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("ferrari");
		sample.add("maruthi");
		for(String car:sample)
		{
			System.out.println(car);
		}
}
}