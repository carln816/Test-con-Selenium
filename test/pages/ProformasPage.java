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
public class ProformasPage {
    private WebDriver driver;
    
    @FindBy(xpath = "//I[@class='fa fa-list text-white']")
    WebElement lowDocuments;
    
    @FindBy(xpath = "//I[@class='fa fa-list text-white']")
    WebElement createProforma;
    
    @FindBy(xpath = "//INPUT[@id='productDescriptionSearch0']")
    WebElement producto;
    
    @FindBy(xpath = "//INPUT[@id='productQuantity0']")
    WebElement cantidad;
    
    @FindBy(xpath = "//INPUT[@id='productPrice0']")
    WebElement precio;
    
    @FindBy(xpath = "//A[@id='paymentType']")
    WebElement cobrar;
    
    public ProformasPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void clickOnLowDocuments(){
        this.lowDocuments.click();
    }
    
    public void clickCreateProforma(){
        this.createProforma.click();
    }
    
    public void insertProduct(String producto){
        this.producto.sendKeys(producto);
    }
    
    public void insertQuantity(String cantidad){
        this.cantidad.sendKeys(cantidad);
    } 
    
    public void insertPrice(String precio){
        this.precio.sendKeys(precio);
    }
    
    public void clickOnPay(){
        this.cobrar.click();
    }
}
