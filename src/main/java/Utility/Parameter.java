package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameter {
	public static String parameterization(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Selenium 1\\KiteZeroda\\src\\test\\resources\\test case1.xlsx");
		String value = WorkbookFactory.create(file).getSheet("Zeroda").getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

}
