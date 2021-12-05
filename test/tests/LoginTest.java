/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import pages.CreateFacturesPage;
import pages.DashboardPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.NavbarPage;
import pages.RegisterPage;

/**
 *
 * @author 
 */
public class LoginTest extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage;
    ForgotPasswordPage passPage;
    RegisterPage registerPage;
    NavbarPage navPage;
    CreateFacturesPage facturePage;
    
    @BeforeMethod
    public void initPages(){
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        passPage = new ForgotPasswordPage(driver);
        registerPage = new RegisterPage(driver);
        navPage = new NavbarPage(driver);
        facturePage = new CreateFacturesPage(driver);
        driver.get(APP_URL);
        
    }
    
    //@Test
    public void verifyThatUserIsAbleToLoginWhenCredentialsAreCorrect(){
        loginPage.enterUsername("###");
        loginPage.enterPassword("###");
        loginPage.clickOnSignInButton();
        dashboardPage.clickOnProfileMenu();
        
          
    } 
    //@Test
    public void verifyThatUserIsntAbleToLoginWhenCredentialsAreWrong(){
        loginPage.enterUsername("###");
        loginPage.enterPassword("###");
        loginPage.clickOnSignInButton();
        
    }
    
    
    public void verifyThatSystemOpensForgotPasswordLink(){
        loginPage.clickOnForgotPassword();
    
    }
    
    //@Test
    public void verifySytemSendsEmailWhenForgotPasswordAndTheUserIsRegistered(){
        loginPage.clickOnForgotPassword();
        passPage.sendEmail("###");
        passPage.clickOnSendRequest();
    }
    
    
    public void veriftSystemDontSendEmailWhenUserIsNotRegistered(){
        loginPage.clickOnForgotPassword();
        passPage.sendEmail("###");
        passPage.clickOnSendRequest();
        
        String currentMessage = passPage.errorMessageLabel();
        
    }
    
    //@Test
    public void verifyThatSystemOpensRegisterPage(){
        loginPage.clickOnRegister();
    }
    
    //@Test
    public void verifyThatSystemAllowsToRegisterAnUser(){
        loginPage.clickOnRegister();
        registerPage.enterName("Carlos Nuñez");
        registerPage.enterID("###");
        registerPage.enterEmail("@gmail.com");
        registerPage.enterPassword("###");
        registerPage.confirmPassword("###");
        registerPage.submitRegister();
        
    }
    
    @Test
    public void verifyThatSystemNotAllowsRegisterWhenCredentialsAreIncorrect(){
        loginPage.clickOnRegister();
        registerPage.enterName("Carlos Nuñez");
        registerPage.enterID("###");
        registerPage.enterEmail("@gmail.com");
        registerPage.enterPassword("###");
        registerPage.confirmPassword("###");
        registerPage.submitRegister();
        
    }
    
    
    
}
