import java.util.*;
class StringPermutation
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string 1");
		String s1 = sc.nextLine();
		System.out.println("Enter string 2");
		String s2 = sc.nextLine();	
		if(arepermutation(s1,s2))
		{
			System.out.println("String "+s1+" and "+s2+" are permutations of each other");
		}
		else
		{

			System.out.println("String "+s1+" and "+s2+" are not permutations of each other");	
		}

	}
	static boolean arepermutation(String s1, String s2)
	{
		//length os strings
		int n1 = s1.length();
		int n2 = s2.length();
		//if unequal length then obviously they are not permutation of each other
		if(n1 != n2)
			return false;
		//to convert string to array
		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();
		//to sort the array
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		//comparing the arrays if they are same or not
		for(int i=0;i<n1;i++)
		{
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;
	}
}