package Object;

public class String2 {
	public static void main(String[] args) {
		String s1=" good morning ";
		
		String[] str=s1.split(" ");
		String re =" ";
		for (int i = 0; i < str.length; i++)
		{
	
			re = reverse(str[i])+" "+re;	
		}
		System.out.println(re);

	}
	
	public static String reverse(String str)
	{
		
		String rev =" ";
		char ch[]=str.toCharArray();
		for(int j=ch.length-1;j>=0;j--)
		{
			rev=rev+ch[j];
		}
		return rev;
	}
	

}
