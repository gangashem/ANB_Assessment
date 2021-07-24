package StepDefinitions;

/*
 * Author: Mulisa Gangashe
 * */

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;

//Reusable Methods Class.
public class ReusableMethods {
    static String fileName;

    //Function below is used to read Elements from Property files
    public static String ReadElementsLocator(String key, String Path) throws IOException
    {
        FileInputStream file = new FileInputStream(Path);
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }

    //Function below is used to read data from Excel file
    public static String datareading(String excelpath, int sheetName, int row, int column) throws IOException
    {
        XSSFWorkbook wb; //declare the Excel file
        XSSFSheet sheet1; //Declare the sheet

        File src = new File(excelpath);
        FileInputStream fis = new FileInputStream(src);
        wb = new XSSFWorkbook(fis);

        sheet1 = wb.getSheetAt(sheetName); //Sheet name in the Excel
        String data = sheet1.getRow(row).getCell(column).getStringCellValue(); //Get the fields(row and column) where the data is saved
        return data;
    }

    //Function below is used to take screen shots
    public static String TakeScreenShot(WebDriver driver, String ScreenType, String sFolder, String UniqueFolder, String FileName) throws Exception
    {
        try
        {
            File FolderPath = new File(System.getProperty("user.dir")+"/ScreenShots/"+ScreenType+"/"+sFolder+"/"+UniqueFolder);
            if (!FolderPath.exists())
            {
                System.out.println("New unique Folder created " + FolderPath);
                FolderPath.mkdir();
            }
            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); //take the screenshot
            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()); //Generate the file date and time withing the file name
            fileName =FolderPath+"/"+FileName+"_"+timeStamp+".png"; //The directory of the file and the file format
            FileUtils.copyFile(scrFile, new File(fileName));
        }
        catch (Exception e)
        {
            throw new Exception("Error on this [TakeScreenShot] method, please debug and see where the error might be");
        }
        return fileName; //Return name of the file
    }

    // Method to verify text on page
    public static boolean ValidateTextOnPage(WebDriver driver, String expValue)
    {
        boolean result = false;
        if(driver.getPageSource().contains(expValue))
        {
            result=true;
        }
        return result;
    }
}
