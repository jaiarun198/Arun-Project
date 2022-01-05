package Arun19.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xddf.usermodel.text.CapsType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Dataexcell{
	
	public static void aa() throws IOException {
		File f = new File("C:\\Users\\Jai\\Desktop\\Book1.xlsx");
	
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.createSheet("dec");
		Row rowcreate = sheet.createRow(0);
		Cell cellcreat = rowcreate.createCell(0);
		cellcreat.setCellValue("studentname");
		wb.getSheet("dec").getRow(0).createCell(1).setCellValue("rollno");
		wb.getSheet("dec").getRow(0).createCell(2).setCellValue("age");
		
		sheet.createRow(1);
		wb.getSheet("dec").getRow(1).createCell(0).setCellValue("1");
		wb.getSheet("dec").getRow(1).createCell(1).setCellValue("jai");
		wb.getSheet("dec").getRow(1).createCell(2).setCellValue(25);
        System.out.println("creat");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

	}
		public static void main(String[] args) throws IOException {
			
			aa();
		}}