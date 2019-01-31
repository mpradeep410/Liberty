package com.valuemomentum.xyz.module1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.model.WorkbookRecordList;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {
	
	

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis;
		XSSFWorkbook workbook;
		XSSFSheet sheet=null;
		HSSFWorkbook workbook1;
		HSSFSheet sheet1 =null;
		
		
		String path = "D:\\Rajasekhar\\raja.xlsx";
		
		if(path.contains(".xlsx"))
		{
			fis = new FileInputStream("D:\\Rajasekhar\\raja.xlsx");
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet("Sheet1");
			System.out.println(sheet.getLastRowNum());
			System.out.println(sheet.getRow(0).getLastCellNum());
			
			for(int i = 0;i<=sheet.getLastRowNum();i++)
			{
				//System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + " - " +  sheet.getRow(i).getCell(1).getStringCellValue());
				
				if(sheet.getRow(i).getCell(2).getStringCellValue().equalsIgnoreCase("Y"))
				{
					System.out.println("Run mode mentioned as yes" + " - " +sheet.getRow(i).getCell(0).getStringCellValue()+ " " + sheet.getRow(i).getCell(1).getStringCellValue() );
					
				}else
				{
					System.out.println("Run Mode mentioned as No");
				}
			}
			
			for(int i = 0;i<=sheet.getLastRowNum();i++)
			{
				for(int j = 0; j<sheet.getRow(i).getLastCellNum();j++)
				{
					System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
					
					
				}
			
			}
			
			
		}else
		{
		
			fis = new FileInputStream("D:\\Rajasekhar\\raja.xls");
			workbook1 = new HSSFWorkbook(fis);
			sheet1 = workbook1.getSheet("Sheet1");
			System.out.println(sheet1.getLastRowNum());
			
			for(int i = 0;i<=sheet1.getLastRowNum();i++)
			{
				//System.out.println(sheet.getRow(i).getCell(0).getStringCellValue() + " - " +  sheet.getRow(i).getCell(1).getStringCellValue());
				
				if(sheet1.getRow(i).getCell(2).getStringCellValue().equalsIgnoreCase("Y"))
				{
					System.out.println("Run mode mentioned as yes" + " - " +sheet1.getRow(i).getCell(0).getStringCellValue()+ " " + sheet1.getRow(i).getCell(1).getStringCellValue() );
					
				}else
				{
					System.out.println("Run Mode mentioned as No");
				}
			}
			
		}
		
	
	}

}
