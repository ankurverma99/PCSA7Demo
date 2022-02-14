import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMethod {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String res=read("D:\\demo.xlsx","Sheet1",1,0,1,1);
		System.out.println(res);
		
	}
	public static String read(String path,String fn,int r,int c,int r1,int c1) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(fn);
		Cell cl1=sh.getRow(r).getCell(c);
		String s=cl1.toString();
		Cell cl2=sh.getRow(r1).getCell(c1);
		String s2=cl2.toString();
		String s3=s+" " +s2;
		
		return s3;
		
	}
	

}
