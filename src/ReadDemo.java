import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDemo {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		String path = "D:\\selenium.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("WebDriver");
		// Cell cl=sh.getRow(4).getCell(0);
		 //System.out.println(cl.toString());
		int rCount = sh.getPhysicalNumberOfRows();
		System.out.println(rCount);
		int cCount = sh.getRow(0).getLastCellNum();
		System.out.println(cCount);
		for (int i = 0; i < rCount; i++) {
			for (int j = 0; j < cCount; j++) {
				Cell cl = sh.getRow(i).getCell(j);
				System.out.println(cl.toString());

			}

		}
	}

	
}
