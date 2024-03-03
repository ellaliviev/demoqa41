package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class SettingsTest extends BaseTest{
    @Test
    public void test_001() {
        // hard coding with the folder tools and driver chrome
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://demoqa.com/");
        try{
            Thread.sleep(20000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void test_002() {
        //hardcoding to check webdrivermanager
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
    }

//    @Test
//    public void test_003(){
    //start without BaseTest.java only
//        ConfigManager.getDriver();
//        try{
//            Thread.sleep(10000);
//        }catch (InterruptedException e){
//            throw new RuntimeException(e);
//        }
//    }

    @Test
    public void test_004() {
        // here we extends from BaseTest and run chrome from ConfigManager
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
