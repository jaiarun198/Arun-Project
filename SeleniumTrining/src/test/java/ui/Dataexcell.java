package ui;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Dataexcell {
	public void aaa () throws IOException  {

		
		 
		FileInputStream excel = new FileInputStream("C:\\Users\\Jai\\Desktop\\datadriven.xlsx");
		
		Workbook workbook =new XSSFWorkbook(excel);
		
		Sheet st = workbook.getSheetAt(0);
		
		Iterator<Row>rowIterator=st.iterator();
		
		while(rowIterator.hasNext()) {
		Row rowValue=rowIterator.next();
		
	   Iterator<Cell> columnIterator=rowValue.iterator();
	   
	   
	   while(columnIterator.hasNext()) {
		   Cell cellvalue=columnIterator.next();
		   System.out.println(cellvalue);
	   }
	   
		}

		}
		public static void main(String[] args) throws IOException {
			
		Dataexcell usingpoi = new Dataexcell();
		usingpoi.aaa();
			
			
		
			
		}}


