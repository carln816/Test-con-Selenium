/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CreateFacturesPage;
import pages.DashboardPage;
import pages.ForgotPasswordPage;
import pages.LoginPage;
import pages.NavbarPage;
import pages.ProformasPage;
import pages.RegisterPage;

/**
 *
 * @author 
 */
public class CreateProformaTest extends BaseTest {
    ProformasPage proformaPage = new ProformasPage(driver);
    CreateFacturesPage facturePage;
    DashboardPage dashboardPage;
    ForgotPasswordPage passPage;
    RegisterPage registerPage;
    NavbarPage navPage;
    LoginPage loginPage;
    
    
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
    
    @Test
    public void verifyThatSystemCreatesProformaScenario(){
        loginPage.enterUsername("(\"###\");");
        loginPage.enterPassword("###");
        loginPage.clickOnSignInButton();
        navPage.clickOnDocuments();
        navPage.clickOnFactures();
        facturePage.createFacture();
        facturePage.insertProduct("FIFA");
        facturePage.insertQuantity("2");
        facturePage.insertPrice("5000");
        facturePage.clickOnPay();
        
    }
    
    //@Test
    public void verifyThatSystemNotCreateProformaWhenMissingField(){
        loginPage.enterUsername("(\"###\");");
        loginPage.enterPassword("(\"###\");");
        loginPage.clickOnSignInButton();
        navPage.clickOnDocuments();
        navPage.clickOnFactures();
        facturePage.createFacture();
        facturePage.insertProduct("FIFA");
        facturePage.insertQuantity("2");
        facturePage.insertPrice("5000");
        facturePage.clickOnPay();
    }
}
