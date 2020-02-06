package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public String[][] excelRead() throws IOException {
	XSSFWorkbook wbook = new XSSFWorkbook("./data/Testdata.xlsx");
	XSSFSheet wsheet=wbook.getSheetAt(0);
	int rowCount=wsheet.getLastRowNum();
	int colCount=wsheet.getRow(0).getLastCellNum();
	String[][] data=new String[rowCount][colCount];
	for(int i=1;i<=rowCount;i++) {
		XSSFRow row=wsheet.getRow(i);
		for(int j=0;j<colCount;j++) {
			XSSFCell cell =row.getCell(j);
			String value=cell.getStringCellValue();
			data[i-1][j]=value;
			System.out.print(data +" ");
		}
	}
	wbook.close();
	return data;
	}}
