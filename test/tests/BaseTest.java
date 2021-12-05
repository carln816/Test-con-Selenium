/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 *
 * @author 
 */
public class BaseTest {
    protected String APP_URL = "http://demo.barcofactura.com/User/Login";
    protected WebDriver driver;
    
    @BeforeClass
    public void setupBrowser(){
        System.setProperty("webdriver.chrome.driver", "resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        
    }
    
    /*
    @AfterClass
    public void closeBrowser(){
        driver.close();
    }
    */
    
}
