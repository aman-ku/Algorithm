import java.util.*;
public class fib_bumemo {
	
	static String a[]=new String[100002];
	public static String zeropad(String k,int n)
	{
		for(int i=0;i<n;i++)
		{
			k="0"+k;
		}
		return k;
	}
	
	public static String sub(String s,String p)
	{
		if(s.length()-p.length()>0)
		{
			p=zeropad(p,s.length()-p.length());
		}
		else
		{
			s=zeropad(s,p.length()-s.length());
		}
		int borrow=0;
		String c=new String();
		for(int i=s.length()-1;i>=0;i--)
		{
			int l=s.charAt(i)-'0';
			int k=p.charAt(i)-'0';
			int diff;
			if(borrow==1)
			{
				if(l!=0)
				{
					l-=1;
					borrow=0;
				}
				else
				{
					l=9;
				}
				
			}
			if(l>k)
			{
				diff=l-k;
				c+=diff;
			}
			else if(k>l)
			{
				l+=10;
				borrow=1;
				diff=l-k;
				c+=diff;
			}
			else
			{
				diff=l-k;
				c+=diff;
			}
		}
		String reverse = "";
        for(int i = c.length() - 1; i >= 0; i--)
        {
            reverse = reverse + c.charAt(i);
        }
        int i=0,count=0;
        while(reverse.charAt(i)=='0' && i<reverse.length()-1)
        {
        	count++;
        	i++;
        }
        reverse=reverse.substring(count);
        return reverse;
		
	}
	
	public static String add(String a,String b)
	{
		String c=new String();
		if(a.length()>b.length())
		{
			b=zeropad(b,a.length()-b.length());
		}
		else if(a.length()<b.length())
		{
			a=zeropad(a,b.length()-a.length());
		}
		int carry=0;
		for(int i=a.length()-1;i>=0;i--)
		{
			int l=a.charAt(i)-'0';
			int k=b.charAt(i)-'0';
			int sum=l+k+carry;
			c+=sum%10;
			carry=(int)(sum/10);
			if(i==0 && carry!=0)
			{
				c+=carry;
			}
		}
		
		String reverse = "";
        for(int i = c.length() - 1; i >= 0; i--)
        {
            reverse = reverse + c.charAt(i);
        }
        int i=0,count=0,k=reverse.length();
        while(reverse.charAt(i)=='0' && i<k-1)
        {
        	count++;
        	i++;
        }
        reverse=reverse.substring(count);
        return reverse;
	}

	public static String fib(String n)
	{
		for(int i=0;i<=Integer.parseInt(n);i++)
		{
			if(i<=1)
			{
				a[i]=Integer.toString(i);
			}
			else
			{
				a[i]=add(a[i-1],a[i-2]);
			}
		}
		return a[Integer.parseInt(n)];
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();

		long start=System.nanoTime();
		System.out.println(fib(s));
		long end=System.nanoTime();
		long duration=end-start;
		System.out.println("duration = "+duration);

	}
}