import java.util.Scanner;
class Unique
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		if(unique(str))
		{
			System.out.println("String contains all unique char");
		}
		else
		{
			System.out.println("String does not contains  unique char");
		}
		
	}
	public static boolean unique(String str)
	{
		//Converts given string into character array 
		char str1[] = str.toCharArray();
		//In arrays we've to use length and not length()
		if (str1.length>128)
		{
			return false;	
			
		}
		for(int i=0;i<str1.length;i++)
		{
			for(int j=i+1;j<str1.length;j++)
			{
				if(str1[i]==str1[j])
				{
					return false;
				
				}
			}
		}
		return true;
	}
}