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
public class RegisterPage {
    private WebDriver driver;
    
    @FindBy(xpath = "//INPUT[@id='TaxableName']")
    WebElement name;
    
    @FindBy(xpath = "//INPUT[@id='identification']")
    WebElement id; 
    
    @FindBy(xpath = "//INPUT[@id='Email']")
    WebElement email;
    
    @FindBy(xpath = "//INPUT[@id='password']")
    WebElement passw1;
     
    @FindBy(xpath = "//INPUT[@id='ConfirmPassword']")
    WebElement passw2;
    
    @FindBy(xpath = "//BUTTON[@type='submit'][text()='CREAR CUENTA']")
    WebElement registerSubmit;
    
    public RegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void enterName(String name){
        this.name.sendKeys(name);
    }
    
    public void enterID(String id){
        this.id.sendKeys(id);
    }
    
    public void enterEmail(String email){
        this.email.sendKeys(email);
    }
    
    public void enterPassword(String password){
        this.passw1.sendKeys(password);
    }
    
    public void confirmPassword(String passwd){
        this.passw2.sendKeys(passwd);
    }
    
    public void submitRegister(){
        this.registerSubmit.click();
    }
    
}
