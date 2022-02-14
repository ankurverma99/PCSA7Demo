import org.testing.annotations.DataProvider;
 import org.testing.annotations.Test;
public class DEmoDataP {
	@DataProvider
	public static String[][]data(){
		String[][]st=new String[3][2];
		st[0][0]="UserA";
		st[0][1]="A";
		st[1][0]="UserB";
		st[1][1]="B";
		st[2][0]="UserC";
		st[2][1]="C";
		return st;
		
	}
	@Test(dataProvider="data")
	public void tc(String s1,String s2) {
		Reporter .Log(s1+"  "+s2,true);
	}

}
