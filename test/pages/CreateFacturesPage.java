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
public class CreateFacturesPage {
    private WebDriver driver;
    
    @FindBy(xpath = "//A[@class='btn btn-default text-white border-white'][text()='\n" +
"                                CREAR FACTURA\n" +
"                            ']")
    WebElement createFacture;
    
    @FindBy(xpath = "//INPUT[@id='productDescriptionSearch0']")
    WebElement producto;
    
    @FindBy(xpath = "//INPUT[@id='productQuantity0']")
    WebElement cantidad;
    
    @FindBy(xpath = "//INPUT[@id='productPrice0']")
    WebElement precio;
    
    @FindBy(xpath = "//A[@id='paymentType']")
    WebElement cobrar;
    
    public CreateFacturesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    
    public void createFacture(){
        this.createFacture.click();
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