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
public class ForgotPasswordPage{
    private WebDriver driver;
    
    @FindBy(xpath = "//INPUT[@id='sendEmail']")
    WebElement email;
    
    @FindBy(xpath = "//BUTTON[@id='btn-send-email']")
    WebElement sendRequest;
    
    @FindBy(xpath = "//DIV[@id='show-msg-failed']")
    WebElement errorMessage;
    
    @FindBy(xpath = "//DIV[@class='p-4 p-sm-5']")
    WebElement correctMessage;
    
    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void sendEmail(String email){
        this.email.sendKeys(email);
    }
    
    public void clickOnSendRequest(){
        this.sendRequest.click();
    }
    
    public String errorMessageLabel(){
        return this.errorMessage.getText();
    }
    
    public String correctMessageLabel(){
        return this.correctMessage.getText();
    }
}
