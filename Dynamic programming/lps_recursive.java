import java.util.*;
public class lps_recursive
{
	static int max(int x, int y) 
	{
		if(x>y)
		{
			return x;
		}	
		else
		{
			return y;			
		}
	}
	static int longestproblemsubsequence(char s[], int i, int j) 
	{
		if (i == j)
		{
			return 1;
		}
		if (s[i] == s[j] && i + 1 == j)
		{
			return 2;
		}
		if (s[i] == s[j]) 
		{
			return longestproblemsubsequence(s, i + 1, j - 1) + 2;
		}
	return max(longestproblemsubsequence(s, i, j - 1), longestproblemsubsequence(s, i + 1, j));
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s;
		System.out.println("Enter the string");
		s=sc.nextLine();
		int n = s.length();
		System.out.println( "maximum palindrome of length is "+longestproblemsubsequence(s.toCharArray(), 0, n - 1));
	}
}