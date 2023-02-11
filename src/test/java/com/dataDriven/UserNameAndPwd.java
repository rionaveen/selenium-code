package com.dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UserNameAndPwd {

	static File file;
	static FileInputStream fis;
	static Workbook wb;
	static Sheet sheetAt;

	public static void readExcelData(String path) throws IOException {

		file = new File(path);
		fis = new FileInputStream(file);
		wb = new HSSFWorkbook(fis);
		sheetAt = wb.getSheetAt(0);
		int physicalNumberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < physicalNumberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				if (cellType.equals(CellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();

					System.out.println(stringCellValue);
				} else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();
					//int value = (int) numericCellValue;
					System.out.println(numericCellValue);
				}
				wb.close();
			}
		}
	}

	public static void main(String[] args) throws IOException {
		readExcelData("C:\\Users\\PC\\Selenium\\maven\\dataset\\new.xls");
		//C:\\Users\\PC\\Selenium\\maven\\dataset\\new.xls
	   //C:\Users\PC\Selenium\maven\dataset\data.xlsx

	}
}
