package Data_driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_from_excel_file {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("./Testdata/Book1.xlsx");//open the file reading mode
		XSSFWorkbook workbook=new XSSFWorkbook(file);//extract the workbook from the file
		XSSFSheet sheet=workbook.getSheet("Sheet1");//from the workbook we get the sheet  in the variable
		int totalrows=sheet.getLastRowNum();
		int totalcolumns=sheet.getRow(1).getLastCellNum();
		System.out.println("No of rows :"+totalrows);//5 rows counting 0 
		System.out.println("No of columns :"+totalcolumns);//4 cells are counting from 1
		
		for(int r=0;r<=totalrows;r++) {
			XSSFRow currentrow=sheet.getRow(r);//we have to extract the row
			for(int c=0;c<totalcolumns;c++) {
				//currentrow.getCell(c).toString();
//by taking current row. It will get the particular cell and get the data from the particular cell by using toString method
				XSSFCell cell=currentrow.getCell(c);
				System.out.println(cell.toString()+"\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();

	}

}
