package ddt;

import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import scripts.ddt.DataProviders;
import scripts.po.iteration1.STCTourismHomePage;

import org.testng.annotations.BeforeMethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DDTSTCTourismLogin {
	STCTourismHomePage loginPage;

	//@Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
	public void loginDataComingFromHardCodedData(String username, String password) {
		loginPage.login(username, password);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		loginPage = new STCTourismHomePage();
	}

	@AfterMethod
	public void afterMethod() {
		loginPage.closeBrowser();		
	}
	
//	@Test(dataProvider = "loginDataFromXLS",dataProviderClass = DataProviders.class)
	public void loginDataComingFromXLS(String username, String password, String role) {
		loginPage.login(username, password);
	}	
	
	@Test(dataProvider = "loginDataFromCSV", dataProviderClass = DataProviders.class)
	public void loginDataComingFromCSV(String username, String password) {
		loginPage.login(username, password);
	}
	
   @DataProvider(name="loginDataFromCSV")
   public Iterator readDatafromCSV() throws IOException
   {
	return getTestDataFromCSV("test/resouces/data/Book1.csv").iterator();
	  
  }
   public static Collection<String[]> getTestDataFromCSV(String fileName) throws IOException {
		List<String[]> records = new ArrayList<String[]>(); // arraylist of array of string is two dim arraylist

		String record;
		// FileReader is meant for reading streams of characters(reading text files)
		// FileReader myReader = new FileReader(fileName);
		// A BufferedReader object takes a FileReader object as
		// an input which contains all the necessary information
		// about the text file that needs to be read.
		BufferedReader file = new BufferedReader(new FileReader(fileName));
		while ((record = file.readLine()) != null) {// record = "niche,thyself"
			String fields[] = record.split(",");// split() method is inside String class
			// fields[0] = "niche", and fields[1] = "thyself"
			records.add(fields);
		}
		file.close();
		return records;
	}

}


