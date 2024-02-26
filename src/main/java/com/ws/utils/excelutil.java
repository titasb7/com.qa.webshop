package com.ws.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutil {
	
	// We arere going use this classfor future.
		// we have to create a methods or constructor for creating the object of that class
//		we have tp parameterise the path 
		
		XSSFWorkbook WB;
		
		public excelutil(String excelpath) {
		
		
			
			try {
				File file =new File(excelpath);
				FileInputStream fIS = new FileInputStream(file);
				//XSSFWorkbook choose input stream
				WB =new XSSFWorkbook(fIS);
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		
		}
		//get active no of row count
		public int getRowCount(int SheetNo) {
			int Count = WB.getSheetAt(SheetNo).getLastRowNum()+1;
			return Count;
			
		}

		//to retreat data  no of row count
		
	  public String getCellData(int SheetNo, int Row, int Cell){
		
		String data= WB.getSheetAt(SheetNo).getRow(Row).getCell(Cell).toString();
		return data;
	}
		
		
		
	}



}
