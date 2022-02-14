import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxm14j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.cell;
import org.apache.poi.ss.usermodel.sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class Read {
	public static void main(String[] args)throws EncryptedDocumentException,Inv
	FileInputStream fis=new FileInputStream("G:\\login.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	Sheet sh= wb.getsheet("login");
	Cell cl= sh.getRow(3).getcell(0);
	System.out.println(cl.toString());
		
	}

}
