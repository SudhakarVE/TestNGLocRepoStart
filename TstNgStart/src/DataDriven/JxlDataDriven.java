package DataDriven;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.Sheet;
import jxl.read.biff.BiffException;
public class JxlDataDriven {
	public static void main() throws BiffException, IOException{
		System.out.println("Check");
	File f = new File("E:/TOOLSQA/DataTable/MainStoreData.xls");
	
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet(3);
	int rows = s.getRows();
	int columns = s.getColumns();
	
	System.out.println(rows);
	System.out.println(columns);
 }
}
