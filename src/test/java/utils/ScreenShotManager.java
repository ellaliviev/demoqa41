package utils;

import config.ConfigManager;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ScreenShotManager {

    @Attachment(value = "Failure screenshot", type = "image/png")
    public static  byte[] takeScreenshot(String testName) {

        try{String screenshotName = testName+"_"+System.currentTimeMillis()+".png";
            File screenshotFile = ((TakesScreenshot) ConfigManager.getDriver()).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File("screenshots/"+screenshotName));
            // for mac both return are correct
            return Files.readAllBytes(Paths.get("screenshots\\"+screenshotName));
            //  return Files.readAllBytes(Paths.get("screenshots/"+screenshotName));
        }
        catch (IOException e){
            return null;
        }
    }

}