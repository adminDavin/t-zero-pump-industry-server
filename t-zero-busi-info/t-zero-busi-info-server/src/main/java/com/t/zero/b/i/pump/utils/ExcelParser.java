package com.t.zero.b.i.pump.utils;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Component
public class ExcelParser {

	@Autowired
	public ObjectMapper mapper;

	public static final String rowForamt = "row_%d_%d";


	private ObjectNode getExcelMs(MultipartFile file) throws IOException {
		var efile = new HSSFWorkbook(file.getInputStream());
		var sheet = efile.getSheetAt(0);
		sheet.getRow(0);
		var tempObj = mapper.createObjectNode();
		for (var rit = sheet.rowIterator(); rit.hasNext();) {
			var row = rit.next();
			for (var cit = row.cellIterator(); cit.hasNext();) {
				var cell = cit.next();
				var c = cell.getColumnIndex();
				var r = cell.getRowIndex();
				var key = String.format(rowForamt, r, c);
				if (CellType.STRING.equals(cell.getCellType())) {
					System.out.println(cell.getStringCellValue());
					tempObj.put(key, cell.getStringCellValue());
				} else if (CellType.NUMERIC.equals(cell.getCellType())) {
					System.out.println(cell.getNumericCellValue());
					tempObj.put(key, cell.getNumericCellValue());
				}
			}
		}
		efile.close();
		return tempObj;
	}

	private ObjectNode getExcel(MultipartFile file) throws IOException {
		var excelFile = new XSSFWorkbook(file.getInputStream());
		var sheet = excelFile.getSheetAt(0);
		sheet.getRow(0);
		var tempObj = mapper.createObjectNode();
		for (var rit = sheet.rowIterator(); rit.hasNext();) {
			var row = rit.next();
			for (var cit = row.cellIterator(); cit.hasNext();) {
				var cell = cit.next();
				var c = cell.getColumnIndex();
				var r = cell.getRowIndex();
				var key = String.format(rowForamt, r, c);
				if (CellType.STRING.equals(cell.getCellType())) {
					System.out.println(cell.getStringCellValue());
					tempObj.put(key, cell.getStringCellValue());
				} else if (CellType.NUMERIC.equals(cell.getCellType())) {
					System.out.println(cell.getNumericCellValue());
					tempObj.put(key, cell.getNumericCellValue());
				}
			}
		}
		excelFile.close();
		return tempObj;
	}

	public ObjectNode parseExcel(MultipartFile file) throws IOException {
		if ("application/vnd.ms-excel".equals(file.getContentType())) {
			return getExcelMs(file);
		} else {
			return getExcel(file);
		}
	}

}
