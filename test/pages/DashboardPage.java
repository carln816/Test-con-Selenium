/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author 
 */
public class DashboardPage {
    private WebDriver driver;
    
    @FindBy(xpath = "//SPAN[@class='px-1 mr-lg-2 ml-2 ml-lg-0'][text()='cnunezb@ucatolica.ac.cr']")
    WebElement usernameLabel; //*[@id="layout-navbar-collapse"]/div[2]/div[3]/a/span/span
    
    @FindBy(xpath = "//A[@class='nav-link dropdown-toggle']")
    WebElement showMenu;
    
    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);        
    }
    
    public String getCurrentUsername(){
        return this.usernameLabel.getText();
    }
    
    public void clickOnProfileMenu(){
        this.showMenu.click();
    }
    
    
}
