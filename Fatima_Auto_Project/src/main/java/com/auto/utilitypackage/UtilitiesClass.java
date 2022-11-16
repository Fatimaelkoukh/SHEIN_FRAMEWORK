package com.auto.utilitypackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.auto.basepackage.BaseClass;
import com.google.common.io.Files;

public class UtilitiesClass extends BaseClass {

	
	
	
	
	
	
	
	
	
	
	// take screenshot of the payement
	public static void takeScreenShot() throws IOException {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+ "//screenshot.screenshot.png");
		targetFile.getParentFile().mkdir();
		srcFile.createNewFile();
		Files.copy(srcFile, targetFile);
		
	
	}
}
