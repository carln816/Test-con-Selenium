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
public class NavbarPage {
    private WebDriver driver;
    
    @FindBy(xpath = "//A[@id='zoomBtn']")
    WebElement documentos;
    
    @FindBy(xpath = "//I[@class='text-white border-white lnr lnr-file-add display-5']")
    WebElement facturas;
    
    @FindBy(xpath = "//DIV[text()='Proformas']")
    WebElement proformas;
    
    @FindBy(xpath = "//DIV[text()='Notas de Crédito']")
    WebElement notasCredito;
    
    @FindBy(xpath = "//DIV[text()='Notas de Débito']")
    WebElement notasDebito;
    
    public NavbarPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void clickOnDocuments(){
        this.documentos.click();
    }
    
    public void clickOnFactures(){
        this.facturas.click();
    }
    
    public void clickOnProformas(){
        this.proformas.click();
    }
    
    public void clickOnCreditsFacture(){
        this.notasCredito.click();
    }
    
    public void clickOnDebitsFacture(){
        this.notasDebito.click();
    }
        
}
