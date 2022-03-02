package autoTes.projectOne;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class getUtils {

	XSSFWorkbook book = new XSSFWorkbook();

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream(
				"C:\\Users\\jd\\eclipse-workspace\\SeleniumAutomation\\projectOne\\utils\\data.propreties");
		Properties prop = new Properties();
		prop.load(file);
		String res = prop.getProperty("browser");
		String path = prop.getProperty("driverpath");
		System.out.println(res + " " + path);
	}

	public static void getFromExcel(FileInputStream fileInput, XSSFWorkbook book) throws FileNotFoundException {
		fileInput = new FileInputStream("path of the excel file ");
		book = new XSSFWorkbook();
		int numOfsheets = book.getNumberOfSheets();
		for (int i = 0; i < numOfsheets; i++) {

			if (book.getSheetName(numOfsheets).equalsIgnoreCase("rajdom sheet")) {
				XSSFSheet sheet = book.getSheetAt(i);

			}
		}

	}
}
