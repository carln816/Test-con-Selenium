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
public class LoginPage {
    private WebDriver driver;
    
    @FindBy(xpath = "//*[@id=\"UserName\"]")
    WebElement username;
    
    @FindBy(xpath = "//*[@id=\"Password\"]")
    WebElement password;
    
    @FindBy(xpath = "/html/body/div[3]/div[2]/div/div[1]/form/div[3]/button")
    WebElement loginButton;
    
    @FindBy(xpath = "/html/body/div[2]/div[2]/div/div[1]/div[2]")
    WebElement errorMessage;
    
    @FindBy(xpath = "//A[@class='d-block small'][text()='¿Olvidó su contraseña?']")
    WebElement forgotPassword;
    
    @FindBy(xpath = "//A[@href='/Account/Register'][text()='Registrarse']")
    WebElement register;
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void enterUsername(String username){
        this.username.sendKeys(username);
    }
    
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }
    
    public void clickOnSignInButton(){
        this.loginButton.submit();
    }
    
    public String errorMessage(){
        return this.errorMessage.getText();
    }
    
    public void clickOnForgotPassword(){
        this.forgotPassword.click();
    }
    
    public void clickOnRegister(){
        this.register.click();
    }
    
}
