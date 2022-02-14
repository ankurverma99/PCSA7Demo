package Object;
public class String1 {
	
public static void main(String[] args) {
	String s1=" hi good morning ";
	String []st=s1.split(" ");
	String rev=" ";
	/*for(int i=0;i<st.length;i++)
	{
		System.out.println(st[i]);
	}*/
	for(int j=st.length-1;j>0;j--)
	{
		rev=rev+st[j]+" ";
	}
	System.out.println(rev);
}

	

}
