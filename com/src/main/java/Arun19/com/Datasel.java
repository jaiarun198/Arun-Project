package Arun19.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datasel {
	public static void aaa () throws IOException  {

	File f = new File("C:\\Users\\Jai\\Desktop\\book1.XLSX");
	 
	FileInputStream excel = new FileInputStream(f);
	
	Workbook wb =new XSSFWorkbook(excel);
	
	Sheet st = wb.getSheet("Sheet1");
	
	Row r = st.getRow(0);
	
	Cell cell = r.getCell(1);
	
	CellType celltype = cell.getCellType();
	
    System.out.println(celltype);

	if (celltype.equals(CellType.STRING)){
	
	String s = cell.getStringCellValue();
	
	System.out.println(s);
	
	}
	
	else if (celltype.equals(celltype.NUMERIC)) {
		
	double nv = cell.getNumericCellValue();
	 
	long j =(long)nv;
	
	System.out.println(j);
	
	
	}

	}
	public static void main(String[] args) throws IOException{
		aaa();
	}}


